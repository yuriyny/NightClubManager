package controller;

import model.Club;
import model.Owner;
import model.PeopleBagV2;
import view.LoginWindow;
import view.NewClubInfo;
import view.OwnerInfoPane;
import view.OwnerNoClubPane;
import view.OwnerWindow;

public class OwnerController {
	private Owner o;
	private Club club;
	private NewClubInfo newClub;

	public OwnerController(LoginWindow view, PeopleBagV2 pBag) {
		newClub = new NewClubInfo();
		view.setOwnerLoginListener(new OwnerLoginListener() {
			// do action after pressing login window
			
			@Override
			public void clicked(OwnerLoginEvent ev) {
				if (pBag.findPerson(ev.getLogin()) instanceof Owner) {
					o = (Owner) pBag.findPerson(ev.getLogin());
					//new OwnerWindow(pBag);
					OwnerWindow ow = new OwnerWindow();
					OwnerInfoPane oip = new OwnerInfoPane();
					ow.setOwnerWindowPane(oip);
					oip.getfNameFld().setText(o.getfName());
					oip.getlNameFld().setText(o.getlName());
					oip.getPhoneFld().setText(o.getPhone());
					oip.getStNameFld().setText(o.getAddress().getStName());
					oip.getStNumberFld().setText(o.getAddress().getStNumber());
					oip.getCityFld().setText(o.getAddress().getCity());
					oip.getStateFld().setText(o.getAddress().getState());
					oip.getZipFld().setText(o.getAddress().getZip());
					oip.getLoginFld().setText(o.getLogin());
					oip.getPasswordFld().setText(o.getPassword());
					///////////////////////////////////////////////////////
					
					OwnerNoClubPane oncp = new OwnerNoClubPane();
					if(o.getClub() == null){
						ow.setClubPane(oncp.getPane());
					}
//					if(pBag.getManagers().length == 0){
//					ow.setClubPane(oncp.getPane());
//					}
//					}else{
//						OwnerClubPane ocp = new OwnerClubPane();
//						///code here.....
//						ocp.getNameFld().setText();
//						
//						
//						
//						
//						ow.setClubPane(ocp.getPane());
//					}
					
					
					
				} else {
					System.out.println("It's not owner");
				}

			}

			@Override
			public void clicked2(OwnerRegisterEvent ev) {
				pBag.add(ev.getOwner());
				pBag.save();
				
			}

			@Override
			public void addClubEvent(ClubRegisterEvent ev) {
				club = ev.getClub();
				o.setClub(club);
				pBag.save();
				System.out.println("Club saved");
				
			}


		});
		
		newClub.setClubListener(new ClubListener(){

			@Override
			public void click(ClubRegisterEvent ev) {
				System.out.println("Clicked new club");
				
			}
			
		});

	}

}
