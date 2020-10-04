package controller;

import java.util.EventObject;

import model.Owner;

public class BartenderInfoEvent extends EventObject {
	
	private Owner o;

	public BartenderInfoEvent(Object source, Owner o) {
		super(source);
		this.o = o;
	}
	
	public Owner getO(){
		return o;
	}

}
