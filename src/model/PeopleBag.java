package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class PeopleBag {
	private Person[] person;
	int nElems;

	public PeopleBag(int maxSize) {
		person = new Person[maxSize];
		nElems = 0;
	}

	public void add(Person p) {
		person[nElems++] = p;
	}

	public Person delete(String id) {
		int i;
		for (i = 0; i < nElems; i++) {
			if (person[i].getId().equals(id)) {

				break;
			}
		}
		if (i == nElems) {
			return null;
		} else {
			Person deleted = person[i];
			for (int j = i; j < nElems - 1; j++) {
				person[j] = person[j + 1];
			}
			nElems--;
			for (int j = nElems; j < person.length; j++) {
				person[j] = null;
			}
			return deleted;
		}

	}

	public void save() {
		PrintWriter out;
		try {
			out = new PrintWriter("output.txt");
			
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	public void load() {
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("Person.dat");
			ois = new ObjectInputStream(fis);
			person = (Person[]) ois.readObject();
			int id = ois.readInt();
			Person.setIdInt(id);
			for (int i = 0; i < person.length; i++) {
				if (person[i] != null) {
					nElems++;
				}
			}

			for (int i = 0; i < nElems; i++) {
				System.out.println(person[i]);
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public Student findS(String id) {
//		for (int i = 0; i < nElems; i++) {
//			if (person[i].getId().equals(id)) {
//				return (Student) person[i];
//			}
//
//		}
//		return null;
//
//	}
//
//	public Faculty findF(String id) {
//		for (int i = 0; i < nElems; i++) {
//			if (person[i].getId().equals(id)) {
//				return (Faculty) person[i];
//			}
//
//		}
//		return null;
//
//	}

	public void open(Stage stage) {
		FileInputStream fis;
		ObjectInputStream ois;

		FileChooser fileChooser = new FileChooser();
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("DAT files (*.dat)", "*.dat");
		fileChooser.getExtensionFilters().add(extFilter);
		File file = fileChooser.showOpenDialog(stage);
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			person = (Person[]) ois.readObject();
			int id = ois.readInt();
			Person.setIdInt(id);
			for (int i = 0; i < person.length; i++) {
				if (person[i] != null) {
					nElems++;
				}
			}

			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(person[i]);
		}
	}

	public void change(String id, Person p) {
		int i;
		for (i = 0; i < nElems; i++) {
			if(person[i].getId().equals(id)){
				person[i] = p;
				break;
			}
		}
			

	}
//	public void check(Person o) throws MyException{
//		if(o.getAddress().getZip().length() != 5){
//			throw new MyException("Wrong Zip Format!");
//		}
//	}

}
