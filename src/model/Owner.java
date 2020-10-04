package model;

public class Owner extends Person  {
	
	//private ClubBag clubBag;
//	private String test;
	private PeopleBag pBag;
	private Club club;

	public Owner(String fName, String lName, String phone, Address address, String login, String password, PeopleBag pBag, Club club) {
		super(fName, lName, phone, address, login, password);
		this.pBag = pBag;
		this.club = club;
	}

	public PeopleBag getpBag() {
		return pBag;
	}

	public void setpBag(PeopleBag pBag) {
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
		return "Owner [getLogin()=" + getLogin() + ", getPassword()=" + getPassword() + ", getfName()=" + getfName()
				+ ", getlName()=" + getlName() + ", getId()=" + getId() + ", getPhone()=" + getPhone()
				+ ", getAddress()=" + getAddress() + ", pBag=" + pBag + ", club=" + club + "]";
	}
	
	

	

	
	


	

	
		
	
	

}
