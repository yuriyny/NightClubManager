package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.OwnerInfoPane;
import view.OwnerWindow;

public class OwnerInfoController {
	
	
	
	public OwnerInfoController(OwnerWindow ow, PeopleBag pBag, EventBag ebag, Owner o){
		ow.setListener(new OwnerListener(){

			@Override
			public void click(OwnerInfoEvent oe) {
				OwnerInfoPane oip = new OwnerInfoPane(oe.getPbag(), oe.getOwner());
				ow.getBPane().setCenter(oip.getPane());
				
			}
			
		});
	}
}
