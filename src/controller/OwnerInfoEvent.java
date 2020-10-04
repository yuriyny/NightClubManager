package controller;

import java.util.EventObject;

import model.Owner;
import model.PeopleBag;

public class OwnerInfoEvent extends EventObject {
	

	private PeopleBag pBag;
	private Owner o;
	
	public OwnerInfoEvent(Object source, PeopleBag pBag, Owner o) {
		super(source);
		this.pBag = pBag;
		this.o = o;
	}
	
	
	public PeopleBag getPbag(){
		return pBag;
	}
	
	public Owner getOwner(){
		return o;
	}

}
