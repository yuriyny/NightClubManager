package model;

public class Water implements IInventory{
	private String name;
	private String price;
	public Water(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Water [name=" + name + ", price=" + price + "]";
	}
	@Override
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
