package model;

import java.io.Serializable;

public class Ticket implements Serializable{
	String price;

	public Ticket(String price) {
		super();
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ticket [price=" + price + "]";
	}
	
	

}
