package controller;

import java.util.EventObject;

import model.Owner;

public class WTInfoEvent extends EventObject {

	private Owner o;

	public WTInfoEvent(Object source, Owner o) {
		super(source);
		this.o = o;
	}
	
	public Owner getO(){
		return o;
	}

}
