package controller;

import java.util.EventListener;

public interface ClubListener extends EventListener {
	public void click(ClubRegisterEvent ev);
}
