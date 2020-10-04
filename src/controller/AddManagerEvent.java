package controller;

import java.util.EventObject;

import model.Owner;
import model.PeopleBag;

public class AddManagerEvent extends EventObject {
	private PeopleBag pBag;
	private Owner o;

	public AddManagerEvent(Object source, PeopleBag pBag, Owner o) {
		super(source);
		this.pBag = pBag;
		this.o = o;
	}
	
	public PeopleBag getPBag(){
		return pBag;
	}
	
	public Owner getO(){
		return o;
	}

}
