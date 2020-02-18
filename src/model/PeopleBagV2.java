package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PeopleBagV2 {
	private ArrayList<Person> person;
	
	public PeopleBagV2(){
		person = new ArrayList<>();
	}
	
	public void add(Person p){
		person.add(p);
	}
	
	public boolean removeByID(String id){
		for(int i = 0; i < person.size(); i++){
			if(person.get(i).getId().equals(id)){
				return true;
			}
		}
		return false;
	}
	
	public Person findPerson(String id){
		//System.out.println(person.size());
		for(int i = 0; i < person.size(); i++){
			if(person.get(i).getId().equals(id)){
				return (Person)person.get(i);
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
			oos.writeObject(person);
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
			person = (ArrayList<Person>) ois.readObject();
			int id = ois.readInt();
			Person.setIdInt(id);

			for (int i = 0; i < person.size(); i++) {
				System.out.println(person.get(i));
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Manager[] getManagers() {
		Manager[] tempList = new Manager[person.size()];
		int count = 0;
		for (int i = 0; i < person.size(); i++) {
			if(person.get(i) != null && person.get(i) instanceof Manager){
				tempList[count++] = (Manager) (person.get(i));
			}
			
		}
		Manager[] tempList2 = new Manager[count];
		for (int j = 0; j < count; j++){
			tempList2[j] = tempList[j];
		}
		return tempList2;
	}
	
	
//	public String[] getCoursesTO_TAKE() {
//		String[] tempList = new String[nElems];
//		int count = 0;
//		for (int i = 0; i < nElems; i++) {
//			if(ct[i].getCourseCategory() != null && ct[i].getCourseCategory() == CourseCategory.TO_TAKE){
//				tempList[count++] = (ct[i].getCourseNumber());
//				
//			}
//		}
//		String[] tempList2 = new String[count];
//		for (int j = 0; j < count; j++){
//			tempList2[j] = tempList[j];
//		}
//		return tempList2;
//	}
}
