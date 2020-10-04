package controller;

import model.EventBag;
import model.Manager;
import model.PeopleBag;
import view.ManagerEventInfo;
import view.ManagerWindow;

public class ManagerController2 {
	
	public ManagerController2(ManagerWindow mw,PeopleBag pBag,EventBag eBag,Manager m){
		mw.setListener2(new ManagerListener2(){

			@Override
			public void click(ManagerEventInfoEve meve) {
				
				ManagerEventInfo mei = new ManagerEventInfo(meve.getPBag(), meve.getM(), meve.geteBag());
				
				mw.getbPane().setCenter(mei.getmPane());
//				bPane.setCenter(mei.getmPane());
			}
			
		});
	}

}
