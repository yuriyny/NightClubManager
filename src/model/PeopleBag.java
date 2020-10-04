package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class PeopleBag implements Serializable {
	private ArrayList<Person> person;

	public PeopleBag() {
		person = new ArrayList<>();
	}

	public void add(Person p) {
		person.add(p);
	}

	public boolean removeByID(String id) {
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getId().equals(id)) {
				//System.out.println("removed");
				person.remove(i);
				return true;
			}

		}
		return false;
	}

	public boolean removeManagerByID(String id) {
		for (int i = 0; i < getManagers().length; i++) {
			if (getManagers()[i].equals(id)) {
				System.out.println("removed");

				return true;
			}

		}
		return false;
	}

	public Person findPerson(String id) {
		// System.out.println(person.size());
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getId().equals(id)) {
				return (Person) person.get(i);
			}
		}
		return null;
	}
	public Person findLnP(String login, String password) {
		// System.out.println(person.size());
		for (int i = 0; i < person.size(); i++) {
			if(person.get(i).getLogin() != null){
			if (person.get(i).getLogin().equals(login) && person.get(i).getLogin().equals(password)) {
				return (Person) person.get(i);
			}
			}
		}
		return null;
	}
	
	public Person findbyPass(String password) {
		// System.out.println(person.size());
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getPassword().equals(password)) {
				return (Person) person.get(i);
			}
		}
		return null;
	}
	public Person findbyLogin(String login) {
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getLogin().equals(login)) {
				return (Person) person.get(i);
			}
		}
		return null;
	}
	
	
	public Person findLogin(String login) {
		// System.out.println(person.size());
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getLogin().equals(login)) {
				return (Person) person.get(i);
			}
		}
		return null;
	}

	public Manager findManager(String id) {
		// System.out.println(person.size());
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getId().equals(id)) {
				return (Manager) person.get(i);
			}
		}
		return null;
	}
	
	public Custumer findCustumer(String id) {
		// System.out.println(person.size());
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getId().equals(id)) {
				return (Custumer) person.get(i);
			}
		}
		return null;
	}
	
	

	public Person findByName(String name) {
		// System.out.println(person.size());
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i).getlName().equals(name)) {
				return (Person) person.get(i);
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

	public Manager findByName(String fName, String lName) {
		Manager[] m = getManagers();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getfName().equals(fName) && m[i].getlName().equals(lName)) {
				return m[i];
			}
		}
		return null;
	}
	
	public Bartender findBartenderByName(String fName, String lName) {
		Bartender[] m = getBartenders();
		for (int i = 0; i < m.length; i++) {
			if (m[i].getfName().equals(fName) && m[i].getlName().equals(lName)) {
				return m[i];
			}
		}
		return null;
	}

	public Manager[] getManagers() {
//		System.out.println("STARTED");
		Manager[] tempList = new Manager[person.size()];
		int count = 0;
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i) != null && person.get(i) instanceof Manager) {
				tempList[count++] = (Manager) (person.get(i));
//				System.out.println((Manager) (person.get(i)));
			}

		}
		Manager[] tempList2 = new Manager[count];
		for (int j = 0; j < count; j++) {
			tempList2[j] = tempList[j];

		}
//		System.out.println(tempList2.length);
		return tempList2;
	}

	public Bartender[] getBartenders() {
		Bartender[] tempList = new Bartender[person.size()];
		int count = 0;
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i) != null && person.get(i) instanceof Bartender) {
				tempList[count++] = (Bartender) (person.get(i));
			}

		}
		Bartender[] tempList2 = new Bartender[count];
		for (int j = 0; j < count; j++) {
			tempList2[j] = tempList[j];

		}
//		System.out.println(tempList2.length);
		return tempList2;
	}
	
	public Custumer[] getCustumerAt() {
		Custumer[] tempList = new Custumer[person.size()];
		int count = 0;
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i) != null && person.get(i) instanceof Custumer) {
				tempList[count++] = (Custumer) (person.get(i));
			}

		}
		Custumer[] tempList2 = new Custumer[count];
		for (int j = 0; j < count; j++) {
			tempList2[j] = tempList[j];

		}
		System.out.println(tempList2.length);
		return tempList2;
	}
	
	
	public DJ[] getDJs() {
		DJ[] tempList = new DJ[person.size()];
		int count = 0;
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i) != null && person.get(i) instanceof DJ) {
				tempList[count++] = (DJ) (person.get(i));
			}

		}
		DJ[] tempList2 = new DJ[count];
		for (int j = 0; j < count; j++) {
			tempList2[j] = tempList[j];

		}
//		System.out.println(tempList2.length);
		return tempList2;
	}
	
	public Waiter[] getwts() {
		Waiter[] tempList = new Waiter[person.size()];
		int count = 0;
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i) != null && person.get(i) instanceof Waiter) {
				tempList[count++] = (Waiter) (person.get(i));
			}

		}
		Waiter[] tempList2 = new Waiter[count];
		for (int j = 0; j < count; j++) {
			tempList2[j] = tempList[j];

		}
		return tempList2;
	}
	
	public Cook[] getcks() {
		Cook[] tempList = new Cook[person.size()];
		int count = 0;
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i) != null && person.get(i) instanceof Cook) {
				tempList[count++] = (Cook) (person.get(i));
			}

		}
		Cook[] tempList2 = new Cook[count];
		for (int j = 0; j < count; j++) {
			tempList2[j] = tempList[j];

		}
		return tempList2;
	}
	
	public Cashier[] getcas() {
		Cashier[] tempList = new Cashier[person.size()];
		int count = 0;
		for (int i = 0; i < person.size(); i++) {
			if (person.get(i) != null && person.get(i) instanceof Cashier) {
				tempList[count++] = (Cashier) (person.get(i));
			}

		}
		Cashier[] tempList2 = new Cashier[count];
		for (int j = 0; j < count; j++) {
			tempList2[j] = tempList[j];

		}
		return tempList2;
	}
	

	public void change(String id, Person p) {
		int i;
		for (i = 0; i < person.size(); i++) {
			if (person.get(i).getId().equals(id)) {
				person.set(i, p);

				break;
			}
		}
	}

	public int getSize() {
		return person.size();
	}
}
