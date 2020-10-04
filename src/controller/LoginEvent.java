package controller;

import java.util.EventObject;

public class LoginEvent extends EventObject{
	
	private String id;
	private String password;

	public LoginEvent(Object source, String id, String password) {
		super(source);
		this.id = id;
		this.password = password;
		
	}
	
	public String getId(){
		return id;
	}
	
	public String getPassword(){
		return password;
	}

}
