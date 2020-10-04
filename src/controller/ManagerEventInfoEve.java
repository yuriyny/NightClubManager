package controller;

import java.util.EventObject;

import model.EventBag;
import model.Manager;
import model.PeopleBag;

public class ManagerEventInfoEve extends EventObject {
	private PeopleBag pBag;
	private Manager m;
	private EventBag eBag;

	public ManagerEventInfoEve(Object source, PeopleBag pBag, Manager m, EventBag eBag) {
		super(source);
		this.pBag = pBag;
		this.m = m;
		this.eBag = eBag;
	}
	
	public PeopleBag getPBag(){
		return pBag;
	}
	public Manager getM(){
		return m;
	}
	public EventBag geteBag(){
		return eBag;
	}

}
