package model;

public class Club {
	private String name;
	private Address address;
	public String phone;
	public String email;
//	private InventoryBag iBag;
	public Club(String name, Address address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Club [name=" + name + ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	
	

}
