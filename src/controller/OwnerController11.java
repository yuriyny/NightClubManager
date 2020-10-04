package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.DJInfoBox;
import view.OwnerWindow;

public class OwnerController11 {
	
	public OwnerController11(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener11(new OwnerListener11(){

			@Override
			public void click(DJInfoEvent die) {
				DJInfoBox bib = new DJInfoBox(die.getO());
				ow.getBPane().setCenter(bib.getPane());
				
//				bPane.setCenter(bib.getPane());
			}
			
		});
	}

}
