package model;

public class Custumer extends Person {
	private String gender;
	private EventBag eBag;
	
	private OrderBag ob;
	
	
	//private Order
	public Custumer(String fName, String lName, String phone, Address address, String login, String password, String gender, EventBag eBag, OrderBag ob) {
		super(fName, lName, phone, address, login, password);
		this.gender = gender;
		this.eBag = eBag;
		this.ob = ob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public EventBag geteBag() {
		return eBag;
	}
	public void seteBag(EventBag eBag) {
		this.eBag = eBag;
	}
	
	
	
	public OrderBag getOb() {
		return ob;
	}
	public void setOb(OrderBag ob) {
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "Custumer [getLogin()=" + getLogin() + ", getPassword()=" + getPassword() + ", getfName()=" + getfName()
				+ ", getlName()=" + getlName() + ", getId()=" + getId() + ", getPhone()=" + getPhone() + ", eBag="
				+ eBag + "]";
	}
	
	
	
	

	

}
