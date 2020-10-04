package controller;

import java.util.EventObject;

import model.Owner;

public class CookInfoEvent extends EventObject{
	
	private Owner o;

	public CookInfoEvent(Object source, Owner o) {
		super(source);
		this.o = o;
	}
	
	public Owner getO(){
		return o;
	}

}
