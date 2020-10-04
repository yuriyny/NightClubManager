package model;

import java.io.Serializable;

public class Club implements Serializable{
	private String name;
	private Address address;
	public String phone;
	public String email;
	private EventBag eBag;
//	private InventoryBag iBag;
	public Club(String name, Address address, String phone, String email, EventBag eBag) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.eBag = eBag;
	}
	
	public Club(){
		
	}
	public EventBag geteBag() {
		return eBag;
	}
	public void seteBag(EventBag eBag) {
		this.eBag = eBag;
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
