package model;

public class Owner extends Person {
	
	//private ClubBag clubBag;
//	private String test;
	private PeopleBagV2 pBag;
	private Club club;

	public Owner(String fName, String lName, String phone, Address address, String login, String password, PeopleBagV2 pBag, Club club) {
		super(fName, lName, phone, address, login, password);
		this.pBag = pBag;
		this.club = club;
	}

	public PeopleBagV2 getpBag() {
		return pBag;
	}

	public void setpBag(PeopleBagV2 pBag) {
		this.pBag = pBag;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "Owner [pBag=" + pBag + ", club=" + club + "]";
	}
	


	

	
		
	
	

}
