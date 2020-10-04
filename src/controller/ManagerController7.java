package controller;

import model.EventBag;
import model.Manager;
import model.PeopleBag;
import view.DJDetails;
import view.ManagerWindow;

public class ManagerController7 {
	public ManagerController7(ManagerWindow mw,PeopleBag pBag,EventBag eBag,Manager m){
		mw.setListener7(new ManagerListener7(){

			@Override
			public void click(DJDetailsEvent de) {
				DJDetails djd = new DJDetails(de.getPBag(), de.getM(), de.getDj());
				mw.getDjlistBox().getChildren().addAll(mw.getDjlist(),djd.getPane(),mw.getRemoveDjBtn());
				
				
				
//				djlistBox.getChildren().addAll(djlist, djd.getPane(), removeDjBtn);
//				bPane.setCenter(djlistBox);
			}
			
		});
		
	}
}
