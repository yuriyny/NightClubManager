package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.BoughtTickets;
import view.OwnerWindow;

public class OwnerController15 {
	
	public OwnerController15(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener15(new OwnerListener15(){

			@Override
			public void click(BoughtTicketsEvent bte) {

				BoughtTickets bt = new BoughtTickets(bte.getO());
				
				ow.getBPane().setCenter(bt.getPane());
				
//				bPane.setCenter(bt.getPane());
			}
			
		});
	}

}
