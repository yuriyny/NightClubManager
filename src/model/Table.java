package model;

import java.io.Serializable;

public class Table implements Serializable {
	private String price;

	public Table(String price) {
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
		return "Table [price=" + price + "]";
	}
	
	
}
