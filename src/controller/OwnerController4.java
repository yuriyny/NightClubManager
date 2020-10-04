package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.AddEventWindow;
import view.OwnerWindow;

public class OwnerController4 {
	
	public OwnerController4(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener4(new OwnerListener4(){

			@Override
			public void click(AddEventEve aee) {
				AddEventWindow amw = new AddEventWindow(eBag, o, pBag);
				ow.getBPane().setCenter(amw.getPane());
			}
			
		});
	}

}
