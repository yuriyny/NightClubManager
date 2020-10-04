package controller;

import java.util.EventObject;

import model.Owner;
import model.PeopleBag;

public class OwnerClubPaneEve extends EventObject {
	private PeopleBag pBag;
	private Owner o;

	public OwnerClubPaneEve(Object source, PeopleBag pBag, Owner o) {
		super(source);
		this.pBag = pBag;
		this.o = o;
	}
	
	public Owner getOwner(){
		return o;
	}
	
	public PeopleBag getpBag(){
		return pBag;
	}

}
