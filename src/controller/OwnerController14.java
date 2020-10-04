package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.CashierInfoBox;
import view.OwnerWindow;

public class OwnerController14 {
	
	public OwnerController14(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener14(new OwnerListener14(){

			@Override
			public void click(CashierInfoEvent cie) {

				CashierInfoBox bib = new CashierInfoBox(cie.getO());
				ow.getBPane().setCenter(bib.getPane());
//				bPane.setCenter(bib.getPane());
			}
			
		});
	}

}
