package controller;

import model.EventBag;
import model.Manager;
import model.PeopleBag;
import view.ManagerWindow;
import view.NewBartenderInfo;

public class ManagerController5 {
	
	public ManagerController5(ManagerWindow mw,PeopleBag pBag,EventBag eBag,Manager m){
		mw.setListener5(new ManagerListener5(){

			@Override
			public void click(NewBartenderEvent ne) {
				NewBartenderInfo _nbi = new NewBartenderInfo(ne.getpBag(), ne.getM());
				
				mw.getbPane().setCenter(_nbi.getPane());
//				bPane.setCenter(_nbi.getPane());
			}
			
		});
	}

}
