package model;

import java.io.Serializable;

public class Water implements Serializable{
	private String price;

	public Water(String price) {
		super();
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String toString() {
		return "Water [price=" + price + "]";
	}
	
	
	
	
	

}
