package controller;

import java.util.EventListener;

public interface OwnerLoginListener extends EventListener {
	public void clicked(OwnerLoginEvent ev);
	public void clicked2(OwnerRegisterEvent ev);
	public void addClubEvent(ClubRegisterEvent ev);

}
