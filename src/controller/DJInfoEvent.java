package controller;

import java.util.EventObject;

import model.Owner;

public class DJInfoEvent extends EventObject {
	
	private Owner o;

	public DJInfoEvent(Object source, Owner o) {
		super(source);
		this.o = o;
	}
	
	public Owner getO(){
		return o;
	}

}
