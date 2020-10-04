package model;

import java.io.Serializable;
import java.util.ArrayList;

public class TicketBag implements Serializable {
	
	ArrayList<Ticket> arr;
	private int size;
	private String price;
	private int bought = 0;

	public TicketBag(int size, String price){
		arr = new ArrayList<Ticket>(size);
		this.size = size;
		this.price = price;
		for(int i = 0; i < size; i++){
			arr.add(new Ticket(price));
		}
	}

	public void remove() {
		size--;
		arr.remove(size);
		bought ++;

	}

	public int getSize() {
		return arr.size();
	}

	public String getPrice() {
		return price;
	}
	public int getBought(){
		return bought;
	}

}
