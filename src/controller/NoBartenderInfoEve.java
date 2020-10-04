package controller;

import java.util.EventObject;

import model.Manager;
import model.PeopleBag;

public class NoBartenderInfoEve extends EventObject {
	
	private PeopleBag pBag;
	private Manager m;

	public NoBartenderInfoEve(Object source, PeopleBag pBag, Manager m) {
		super(source);
		this.m = m;
		this.pBag = pBag;
	}
	
	public Manager getM(){
		return m;
	}
	public PeopleBag getPBag(){
		return pBag;
	}

}
