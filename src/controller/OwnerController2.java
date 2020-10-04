package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.OwnerNoClubEvent;
import view.OwnerNoClubPane;
import view.OwnerWindow;

public class OwnerController2 {

	public OwnerController2(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o) {
		ow.setListener2(new OwnerListener2(){

			@Override
			public void click(OwnerNoClubEvent once) {
				OwnerNoClubPane onp = new OwnerNoClubPane(pBag, o);
				ow.getBPane().setCenter(onp.getPane());
			}
			
		});
	}
}
