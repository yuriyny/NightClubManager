package model;

import java.util.ArrayList;

public class ClubBag {
	ArrayList<Club> arr;
	
	public ClubBag(){
		arr = new ArrayList<Club>();
	}
	public void add(Club club){
		arr.add(club);
	}

}
