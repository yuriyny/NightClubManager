package model;

public class DJ extends Person{
	
	private String salary;
	private EventBag eBag;
	
	public DJ(String fName, String lName, String phone, Address address, String login, String password, String salary, EventBag eBag) {
		super(fName, lName, phone, address, login, password);
		this.salary = salary;
		this.eBag = eBag;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public EventBag geteBag() {
		return eBag;
	}

	public void seteBag(EventBag eBag) {
		this.eBag = eBag;
	}

	@Override
	public String toString() {
		return "DJ [getfName()=" + getfName() + ", getlName()=" + getlName() + ", getId()=" + getId() + ", salary="
				+ salary + ", eBag=" + eBag + "]";
	}
	
	

}
