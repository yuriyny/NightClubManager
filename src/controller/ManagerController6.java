package controller;

import model.EventBag;
import model.Manager;
import model.PeopleBag;
import view.ManagerWindow;
import view.NoDJInfo;

public class ManagerController6 {
	
	public ManagerController6(ManagerWindow mw,PeopleBag pBag,EventBag eBag,Manager m){
		mw.setListener6(new ManagerListener6(){

			@Override
			public void click(NoDJInfoEvent ne) {
				NoDJInfo ndi = new NoDJInfo(ne.getpBag(), ne.getM());
				mw.getbPane().setCenter(ndi.getPane());
				// bPane.setCenter(ndi.getPane());
			}
			
		});
	}

}
