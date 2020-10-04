package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.BartenderInfoBox;
import view.OwnerWindow;

public class OwnerController10 {
	
	public OwnerController10(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener10(new OwnerListener10(){

			@Override
			public void click(BartenderInfoEvent bie) {
				BartenderInfoBox bib = new BartenderInfoBox(bie.getO());
				ow.getBPane().setCenter(bib.getPane());
//				bPane.setCenter(bib.getPane());
			}
			
		});
	}

}
