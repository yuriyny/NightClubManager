package controller;

import java.util.EventObject;

import model.EventBag;

public class NewEventEvent extends EventObject{
	private EventBag eBag;

	public NewEventEvent(Object source, EventBag eBag) {
		super(source);
		this.eBag = eBag;
	}
	
	public EventBag getEBag(){
		return eBag;
	}

}
