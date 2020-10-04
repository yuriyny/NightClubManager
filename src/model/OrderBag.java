package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class OrderBag implements Serializable{
	private ArrayList<Order> order;
	
	
	public OrderBag(){
		order = new ArrayList<Order>();
	}
	
	public void addOrder(Order o){
		order.add(o);
	}
	
	public void remove(String name){
		for(int i = 0; i < order.size(); i ++){
			if(order.get(i).getEname().equals(name)){
				order.remove(i);
			}
		}
		
	}
	
	public boolean removeByID(String id) {
		for (int i = 0; i < order.size(); i++) {
			if (order.get(i).getId().equals(id)) {
				order.remove(i);
				return true;
			}

		}
		return false;
	}

	
	
	public boolean isEmpty(){
		return (order.size() == 0);
	}

	
	public Order findByName(String name){
		//System.out.println(person.size());
		for(int i = 0; i < order.size(); i++){
			if(order.get(i).getEname().equals(name)){
				return order.get(i);
			}
		}
		return null;
	}
	
	public Order findOrderID(String id) {
		for (int i = 0; i < order.size(); i++) {
			if (order.get(i).getId().equals(id)) {
				return (Order) order.get(i);
			}
		}
		return null;
	}
	
	
	public void save() {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("Order.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(order);
			oos.writeInt(Order.getIdInt());

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
			fis = new FileInputStream("Order.dat");
			ois = new ObjectInputStream(fis);
			order = (ArrayList<Order>) ois.readObject();
			int id = ois.readInt();
			Order.setIdInt(id);

			for (int i = 0; i < order.size(); i++) {
				System.out.println(order.get(i));
			}
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void change(String name, Order p) {
		int i;
		for (i = 0; i < order.size(); i++) {
			if(order.get(i).getEname().equals(name)){
				order.set(i, p);
				
				break;
			}
		}
	}
	
	public Order getOrder(int i){
		return order.get(i);
	}
	
	public int getSize(){
		return order.size();
	}

}
