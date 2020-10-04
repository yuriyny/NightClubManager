package model;

public class Manager extends Person implements IEmployee {
	private String salary;
	private String dateHired;
	private EventBag eBag;
	private PeopleBag employees;
	

	private Owner o;

	public Manager(String fName, String lName, String phone, Address address, String login, String password,
			String salary, EventBag eBag, Owner o, PeopleBag employees) {
		super(fName, lName, phone, address, login, password);
		this.eBag = eBag;
		this.salary = salary;
		this.o = o;
		this.employees = employees;
	}

	public String getSalary() {
		return salary;
	}

	public EventBag geteBag() {
		return eBag;
	}

	public void seteBag(EventBag eBag) {
		this.eBag = eBag;
	}

	public String getDateHired() {
		return dateHired;
	}

	@Override
	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	
	
	@Override
	public String toString() {
		return "Manager [salary=" + salary + ", dateHired=" + dateHired + ", eBag=" + eBag + ", o=" + o
				+ ", getLogin()=" + getLogin() + ", getPassword()=" + getPassword() + ", getfName()=" + getfName()
				+ ", getlName()=" + getlName() + ", getId()=" + getId() + ", getPhone()=" + getPhone()
				+ ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public Owner getOwner() {
		return o;
	}

	public void setOwner(Owner o) {
		this.o = o;
	}

	public PeopleBag getEmployees() {
		return employees;
	}

	public void setEmployees(PeopleBag employees) {
		this.employees = employees;
	}
	
	

	

	

	
	

}
