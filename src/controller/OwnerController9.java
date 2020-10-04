package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.NewEventWindow;
import view.OwnerWindow;

public class OwnerController9 {
	
	public OwnerController9(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener9(new OwnerListener9(){

			@Override
			public void click(NewEventEvent nee) {
				NewEventWindow ne = new NewEventWindow(nee.getEBag(), o, pBag);
				
				ow.getBPane().setCenter(ne.getPane());
//				bPane.setCenter(ne.getPane());
			}
			
		});
	}

}
