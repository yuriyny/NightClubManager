package controller;

import java.util.EventObject;

import model.Owner;

public class CashierInfoEvent extends EventObject{
	
	private Owner o;

	public CashierInfoEvent(Object source, Owner o) {
		super(source);
		this.o = o;
	}
	
	public Owner getO(){
		return o;
	}

}
