package controller;

import java.util.EventListener;

import model.PeopleBagV2;

public interface OwnerRegisterListener extends EventListener {

	public void buttonClicked(OwnerRegisterEvent ev);
}
