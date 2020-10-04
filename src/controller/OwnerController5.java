package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.EventDetails;
import view.OwnerWindow;

public class OwnerController5 {
	
	public OwnerController5(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener5(new OwnerListener5(){

			@Override
			public void click(EventDetailsEve ede) {
				EventDetails ed = new EventDetails(ede.getClubEvent());
				
				ow.getElistBox().getChildren().addAll(ow.getElist(),ed.getPane(),ow.getAddEventBtn(), ow.getRemoveEventBtn());
				ow.getBPane().setCenter(ow.getElistBox());
			
			}
			
		});
		
	}

}
