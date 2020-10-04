package model;

import java.io.Serializable;

public class Wine implements Serializable {
	private String price;

	public Wine(String price) {
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
		return "Wine [price=" + price + "]";
	}
	
	
	

}
