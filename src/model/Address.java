package model;

import java.io.Serializable;

import javax.swing.JOptionPane;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Address implements Serializable {
	private String stNumber;
	private String stName;
	private String city;
	private String state;
	private String zip;

	public Address(String stName, String stNumber, String city, String state, String zip) {
		this.stNumber = stNumber;
		this.stName = stName;
		this.city = city;
		this.state = state;
		
		this.zip = zip;

	}

	public String getStNumber() {
		return stNumber;
	}

	public void setStNumber(String stNumber) {
		this.stNumber = stNumber;
	}
 
	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [stNumber=" + stNumber + ", stName=" + stName + ", city=" + city + ", state=" + state + ", zip="
				+ zip + "]";
	}
	
//	public void checkZip(String z) throws MyException{
//		int i;
//		for(i = 0; i < z.length(); i++){
//			if(!Character.isDigit(z.charAt(i)) || z.length() != 5 ){
//				throw new MyException("Wrong Zip Format!");
//			}
//
//		}
//		
//		
//		
//		
//	}

}
