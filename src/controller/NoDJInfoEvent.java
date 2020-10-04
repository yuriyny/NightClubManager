package controller;

import java.util.EventObject;

import model.Manager;
import model.PeopleBag;

public class NoDJInfoEvent extends EventObject {
	
	private PeopleBag pBag;
	private Manager m;

	public NoDJInfoEvent(Object source, PeopleBag pBag, Manager m) {
		super(source);
		this.m = m;
		this.pBag = pBag;
	}
	
	public Manager getM(){
		return m;
	}
	
	public PeopleBag getpBag(){
		return pBag;
	}

}
