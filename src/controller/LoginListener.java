package controller;

import java.util.EventListener;

public interface LoginListener extends EventListener {
	public void clicked(LoginEvent le);

}
