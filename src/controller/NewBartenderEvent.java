package controller;

import java.util.EventObject;

import model.Manager;
import model.PeopleBag;

public class NewBartenderEvent extends EventObject{
	private PeopleBag pBag;
	private Manager m;

	public NewBartenderEvent(Object source, PeopleBag pBag, Manager m) {
		super(source);
		this.pBag = pBag;
		this.m = m;
	}
	
	public Manager getM(){
		return m;
	}
	
	public PeopleBag getpBag(){
		return pBag;
	}

}
