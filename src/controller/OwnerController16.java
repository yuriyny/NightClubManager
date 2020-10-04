package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.ExpWindow;
import view.OwnerWindow;

public class OwnerController16 {
	
	public OwnerController16(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener16(new OwnerListener16(){

			@Override
			public void click(ExpEvent ee) {
				ExpWindow w = new ExpWindow(ee.getPBag(), ee.getO(), ee.geteBag());
				ow.getBPane().setCenter(w.getPane());
//				bPane.setCenter(w.getPane());
			}
			
		});
	}

}
