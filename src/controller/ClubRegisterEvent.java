package controller;

import java.util.EventObject;

import model.Club;

public class ClubRegisterEvent extends EventObject {
	
	private Club club;
	
	public ClubRegisterEvent(Object source, Club club) {
		super(source);
		this.club = club;
	}
	
	public Club getClub(){
		return club;
	}

}
