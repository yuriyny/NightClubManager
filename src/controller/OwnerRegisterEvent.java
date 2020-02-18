package controller;

import java.util.EventObject;

import model.Address;
import model.Owner;

public class OwnerRegisterEvent extends EventObject {
	private Owner owner;
	private Address address;

	public OwnerRegisterEvent(Object sourse) {
		super(sourse);
	}
	
	public OwnerRegisterEvent(Object sourse, Owner o, Address a) {
		super(sourse);
		this.owner = o;
		this.address = a;
	}
	
	public Owner getOwner(){
		return owner;
	}
	public Address getAddreass(){
		return address;
	}

}
