package model;

public class Custumer extends Person {
	private String gender;
	public Custumer(String fName, String lName, String phone, Address address, String login, String password, String gender) {
		super(fName, lName, phone, address, login, password);
		this.gender = gender;
	}

	

}
