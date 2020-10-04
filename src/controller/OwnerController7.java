package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.ManagerDet;
import view.OwnerWindow;

public class OwnerController7 {
	
	public OwnerController7(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener7(new OwnerListener7(){

			@Override
			public void click(ManagerDetEvent mde) {
				
				ManagerDet md = new ManagerDet(mde.getPBag(), mde.getO(), mde.getM());
				
				ow.getListBox().getChildren().addAll(ow.getList(), md.getPane(),ow.getRemoveManagerBtn(), ow.getAddManagerBtn());
//				listBox.getChildren().addAll(list, md.getPane(), removeManagerBtn, addManagerBtn);
//				
//				bPane.setCenter(listBox);
			}
			
		});
	}

}
