package controller;

import model.EventBag;
import model.Manager;
import model.PeopleBag;
import view.BartenderDetails;
import view.ManagerWindow;

public class ManagerController4 {
	public ManagerController4(ManagerWindow mw,PeopleBag pBag,EventBag eBag,Manager m){
		mw.setListener4(new ManagerListener4(){

			@Override
			public void click(BartenderDetailsEvent be) {
				BartenderDetails btd = new BartenderDetails(be.getPBag(), be.getM(), be.getB());
				
				mw.getListBox().getChildren().addAll(mw.getList(),btd.getPane(),mw.getRemoveBartenderBtn());
				
//				listBox.getChildren().addAll(list, btd.getPane(), removeBartenderBtn);
//				bPane.setCenter(listBox)
			}
			
		});
	}

}
