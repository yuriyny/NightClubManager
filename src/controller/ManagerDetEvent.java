package controller;

import java.util.EventObject;

import model.Manager;
import model.Owner;
import model.PeopleBag;

public class ManagerDetEvent extends EventObject {
	private PeopleBag pBag;
	private Owner o;
	private Manager m;

	public ManagerDetEvent(Object source, PeopleBag pBag, Owner o, Manager m) {
		super(source);
		this.pBag = pBag;
		this.o = o;
		this.m = m;
	}
	
	public Owner getO(){
		return o;
	}
	
	public Manager getM(){
		return m;
	}
	public PeopleBag getPBag(){
		return pBag;
	}
	

}
