package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ManagerBag {
private ArrayList<Manager> manager;
	
	public ManagerBag(){
		manager = new ArrayList<>();
	}
	
	public void add(Manager m){
		manager.add(m);
	}
	
	public boolean removeByID(String id){
		for(int i = 0; i < manager.size(); i++){
			if(manager.get(i).getId().equals(id)){
				return true;
			}
		}
		return false;
	}
	
	public Manager findPerson(String id){
		//System.out.println(person.size());
		for(int i = 0; i < manager.size(); i++){
			if(manager.get(i).getId().equals(id)){
				return (Manager)manager.get(i);
			}
		}
		return null;
	}
	
	
	public void save() {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("Person.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(manager);
			oos.writeInt(Manager.getIdInt());

			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public void load() {
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("Manager.dat");
			ois = new ObjectInputStream(fis);
			manager = (ArrayList<Manager>) ois.readObject();
			int id = ois.readInt();
			Manager.setIdInt(id);

			for (int i = 0; i < manager.size(); i++) {
				System.out.println(manager.get(i));
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
