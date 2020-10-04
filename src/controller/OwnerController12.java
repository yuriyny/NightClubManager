package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.OwnerWindow;
import view.WTInfoBox;

public class OwnerController12 {
	
	public OwnerController12(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener12(new OwnerListener12(){

			@Override
			public void click(WTInfoEvent we) {
				WTInfoBox bib = new WTInfoBox(we.getO());
				
				ow.getBPane().setCenter(bib.getPane());
			}
			
		});
	}

}
