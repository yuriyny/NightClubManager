package model;

import java.io.Serializable;

public class Vodka  implements Serializable {
	private String price;

	public Vodka(String price) {
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
		return "Vodka [price=" + price + "]";
	}

	

	

}
