package model;

public class Manager extends Person implements IEmployee {
	private double salary;
	private String dateHired;

	public Manager(String fName, String lName, String phone, Address address, String login, String password,
			double salary) {
		super(fName, lName, phone, address, login, password);
	}

	public double getSalary() {
		return salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	@Override
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Manager [salary=" + salary + ", dateHired=" + dateHired + "]";
	}
	

}
