package controller;

import model.EventBag;
import model.Manager;
import model.PeopleBag;
import view.ManagerWindow;
import view.NoBartenderInfo;

public class ManagerController3 {
	
	
	public ManagerController3(ManagerWindow mw,PeopleBag pBag,EventBag eBag,Manager m){
		mw.setListener3(new ManagerListener3(){

			@Override
			public void click(NoBartenderInfoEve nb) {
				 NoBartenderInfo nbi = new NoBartenderInfo(nb.getPBag(), nb.getM());
				 
				 mw.getbPane().setCenter(nbi.getPane());
				 
//				 bPane.setCenter(nbi.getPane())
			}
			
		});
	}

}
