package model;

public class Wine implements IInventory {
	private String name;
	private String price;

	public Wine(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	@Override
	public void setPrice(String price) {

	}

	@Override
	public String getName() {
		
		return name;
	}
}
