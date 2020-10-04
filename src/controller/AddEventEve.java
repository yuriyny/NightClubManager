package controller;

import java.util.EventObject;

import model.EventBag;
import model.Owner;
import model.PeopleBag;

public class AddEventEve extends EventObject {
	private EventBag eBag;
	private Owner o;
	private PeopleBag pBag;
	
	public AddEventEve(Object source, EventBag eBag, Owner o, PeopleBag pBag) {
		super(source);
		this.eBag = eBag;
		this.o = o;
		this.pBag = pBag;
	}
	
	public EventBag geteBag(){
		return eBag;
	}
	public Owner getO(){
		return o;
	}
	public PeopleBag getPBag(){
		return pBag;
	}

}
