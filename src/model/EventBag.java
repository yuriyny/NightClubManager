package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class EventBag implements Serializable {
	private ArrayList<ClubEvent> event;

	
	public EventBag(){
		event = new ArrayList<>();
	}
	
	public void add(ClubEvent eb){
		event.add(eb);
	}
	
	public void remove(String name){
		for(int i = 0; i < event.size(); i ++){
			if(event.get(i).getName().equals(name)){
				event.remove(i);
			}
		}
		
	}
	
	public boolean isEmpty(){
		return (event.size() == 0);
	}

	
	public ClubEvent findByName(String name){
		//System.out.println(person.size());
		for(int i = 0; i < event.size(); i++){
			if(event.get(i).getName().equals(name)){
				return event.get(i);
			}
		}
		return null;
	}
	
	
	public void save() {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("Events.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(event);
			//oos.writeInt(Person.getIdInt());

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
			fis = new FileInputStream("Events.dat");
			ois = new ObjectInputStream(fis);
			event = (ArrayList<ClubEvent>) ois.readObject();
//			int id = ois.readInt();
//			Person.setIdInt(id);

			for (int i = 0; i < event.size(); i++) {
				System.out.println(event.get(i));
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void change(String name, ClubEvent p) {
		int i;
		for (i = 0; i < event.size(); i++) {
			if(event.get(i).getName().equals(name)){
				event.set(i, p);
				
				break;
			}
		}
	}
	
	public ClubEvent getEvent(int i){
		return event.get(i);
	}
	
	public int getSize(){
		return event.size();
	}
	

	
}
