package controller;

import model.EventBag;
import model.Manager;
import model.PeopleBag;
import view.ManagerWindow;
import view.MyInfoManager;

public class ManagerController {
	
	public ManagerController(ManagerWindow mw,PeopleBag pBag,EventBag eBag,Manager m){
		mw.setListener(new ManagerListener(){

			@Override
			public void click(MyInfoManagerEvent me) {
				MyInfoManager mim = new MyInfoManager(me.getPBag(), me.getM());
				mw.getbPane().setCenter(mim.getPane());
//				
//				bPane.setCenter(mim.getPane());
			}

			
			
		});
		
	
	}

}
