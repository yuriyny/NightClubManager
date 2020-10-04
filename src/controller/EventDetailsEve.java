package controller;

import java.util.EventObject;

import model.ClubEvent;

public class EventDetailsEve extends EventObject {
	private ClubEvent ce;

	public EventDetailsEve(Object source, ClubEvent ce) {
		super(source);
		this.ce = ce;
	}
	
	public ClubEvent getClubEvent(){
		return ce;
	}
	
}
