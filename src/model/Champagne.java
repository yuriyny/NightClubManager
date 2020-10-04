package model;

import java.io.Serializable;

public class Champagne implements Serializable {
	private String price;

	public Champagne(String price) {
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
		return "Champagne [price=" + price + "]";
	}
	
	
	


}
