package controller;

import java.util.EventObject;

import model.PeopleBagV2;

public class OwnerLoginEvent extends EventObject {
//	private PeopleBagV2 pBag;
	private String login;
	private String password;

	public OwnerLoginEvent(Object source, String login, String password) {
		super(source);
		this.login = login;
		this.password = password;
		
		
		//this.pBag = pBag;
		
	}
	
//	public PeopleBagV2 getPeopleBag(){
//		return pBag;
//	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
