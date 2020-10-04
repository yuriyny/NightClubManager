package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.AddManagerWindow;
import view.OwnerWindow;

public class OwnerController6 {
	
	public OwnerController6(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener6(new OwnerListener6(){

			@Override
			public void click(AddManagerEvent ame) {
				
				AddManagerWindow amw = new AddManagerWindow(pBag, o);
				ow.getBPane().setCenter(amw.getPane());
			}
			
		});
	}

}
