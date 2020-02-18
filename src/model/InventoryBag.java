package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class InventoryBag {
private ArrayList<IInventory> inventory;
	
	public InventoryBag(){
		inventory = new ArrayList<>();
	}
	
	public void add(IInventory p){
		inventory.add(p);
	}
	
	public boolean removeByID(String name){
		for(int i = 0; i < inventory.size(); i++){
			if(inventory.get(i).getName().equals(name)){
				return true;
			}
		}
		return false;
	}
	
	public IInventory findPerson(String id){
		//System.out.println(person.size());
		for(int i = 0; i < inventory.size(); i++){
			if(inventory.get(i).getName().equals(id)){
				return inventory.get(i);
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
			oos.writeObject(inventory);
			oos.writeInt(Person.getIdInt());

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
			fis = new FileInputStream("Person.dat");
			ois = new ObjectInputStream(fis);
			inventory = (ArrayList<IInventory>) ois.readObject();
			int id = ois.readInt();
			Person.setIdInt(id);

			for (int i = 0; i < inventory.size(); i++) {
				System.out.println(inventory.get(i));
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
