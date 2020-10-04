package controller;

import java.util.EventObject;

import model.Bartender;
import model.Manager;
import model.PeopleBag;

public class BartenderDetailsEvent extends EventObject{
	private PeopleBag pBag;
	private Manager m;
	private Bartender b;
	
	public BartenderDetailsEvent(Object source, PeopleBag pBag, Manager m, Bartender b) {
		super(source);
		this.pBag = pBag;
		this.m = m;
		this.b = b;
	}
	
	public PeopleBag getPBag(){
		return pBag;
	}
	public Manager getM(){
		return m;
	}
	public Bartender getB(){
		return b;
	}

}
