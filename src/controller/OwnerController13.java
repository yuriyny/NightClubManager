package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.CookInfoBox;
import view.OwnerWindow;

public class OwnerController13 {
	
	public OwnerController13(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener13(new OwnerListener13(){

			@Override
			public void click(CookInfoEvent cie) {
				CookInfoBox bib = new CookInfoBox(cie.getO());
				ow.getBPane().setCenter(bib.getPane());
				//bPane.setCenter(bib.getPane());
			}
			
		});
	}

}
