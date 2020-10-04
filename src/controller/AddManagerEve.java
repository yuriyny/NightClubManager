package controller;

import java.util.EventObject;

import model.Owner;
import model.PeopleBag;

public class AddManagerEve extends EventObject{
	public AddManagerEve(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	private PeopleBag pBag;
	private Owner o;

	public AddManagerEve(Object source, PeopleBag pBag, Owner o) {
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
