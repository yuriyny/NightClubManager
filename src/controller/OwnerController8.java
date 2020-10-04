package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.AddManager;
import view.OwnerWindow;

public class OwnerController8 {

	
	public OwnerController8(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener8(new OwnerListener8(){

			@Override
			public void click(AddManagerEve ame) {
				AddManager am = new AddManager(ame.getPBag(), ame.getO());
				ow.getBPane().setCenter(am.getPane());
//				bPane.setCenter(am.getPane());
			}
			
		});
	}
}
