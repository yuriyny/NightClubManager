package controller;

import java.util.EventObject;

import model.EventBag;
import model.Owner;
import model.PeopleBag;

public class ExpEvent extends EventObject{
	
	private PeopleBag pBag;
	private Owner o;
	private EventBag eBag;

	public ExpEvent(Object source, PeopleBag pBag, Owner o, EventBag eBag) {
		super(source);
		this.pBag = pBag;
		this.o = o;
		this.eBag = eBag;
	}
	
	public Owner getO(){
		return o;
	}
	public PeopleBag getPBag(){
		return pBag;
	}
	public EventBag geteBag(){
		return eBag;
	}

}
