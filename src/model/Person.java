package model;

import java.io.Serializable;

public class Person implements Serializable {

	private static int idInt;

	private String fName;
	private String lName;
	private final String id;
	private String phone;
	private Address address;
	private String login;
	private String password;

	public Person(String fName, String lName, String phone, Address address, String login, String password) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.id = String.valueOf(++idInt);
		this.phone = phone;
		this.address = address;
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getId() {
		return id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public static void setIdInt(int id){
		idInt = id;
	}
	
	public static int getIdInt(){
		return idInt;
	}

	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", id=" + id + ", phone=" + phone + ", address="
				+ address + ", login=" + login + ", password=" + password + "]";
	}

	

}
