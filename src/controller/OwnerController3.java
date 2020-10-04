package controller;

import model.EventBag;
import model.Owner;
import model.PeopleBag;
import view.OwnerClubPane;
import view.OwnerWindow;

public class OwnerController3 {
	
	public OwnerController3(OwnerWindow ow, PeopleBag pBag, EventBag eBag, Owner o){
		ow.setListener3(new OwnerListener3(){

			@Override
			public void click(OwnerClubPaneEve ocp) {
				OwnerClubPane ocp2 = new OwnerClubPane(pBag, o);
				ocp2.getNameFld().setText(o.getClub().getName());
				ocp2.getStNameFld().setText(o.getClub().getAddress().getStName());
				ocp2.getStNumberFld().setText(o.getClub().getAddress().getStNumber());
				ocp2.getCityFld().setText(o.getClub().getAddress().getCity());
				ocp2.getStateFld().setText(o.getAddress().getState());
				ocp2.getZipFld().setText(o.getClub().getAddress().getZip());
				ocp2.getPhoneFld().setText(o.getClub().getPhone());
				ocp2.getEmailFld().setText(o.getClub().getEmail());
				ow.getBPane().setCenter(ocp2.getPane());
			}
			
		});
		
	}

}
