package controller;

import model.Custumer;
import model.EventBag;
import model.Manager;
import model.Owner;
import model.PeopleBag;
import view.CustumerWindow;
import view.LoginWindow;
import view.ManagerWindow;
import view.NoFoundInfo;
import view.OwnerInfoPane;
import view.OwnerWindow;

public class LoginController {
	private LoginWindow lw;
	private PeopleBag pBag;
	private String id;
	private String password;
	
	public LoginController(LoginWindow lw, PeopleBag pBag, EventBag eBag){
		lw.setListener(new LoginListener(){

			@Override
			public void clicked(LoginEvent le) {
				id = le.getId();
				password = le.getPassword();
				// IF OWNER DATA FOUND THE OWNER WINDOW WILL BE OPENED
				if (pBag.findLnP(id, password) instanceof Owner ){
					Owner o = (Owner) pBag.findLnP(id, password);
					//new OwnerWindow(pBag);
					OwnerWindow ow = new OwnerWindow(pBag, o, eBag);
					OwnerInfoPane oip = new OwnerInfoPane(pBag, o);
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
					//CONTROLLERS FOR OWNER WINDOW
					OwnerInfoController oic = new OwnerInfoController(ow, pBag, eBag, o);
					OwnerController2 oc2 = new OwnerController2(ow, pBag, eBag, o);
					OwnerController3 oc3 = new OwnerController3(ow, pBag, eBag, o);
					OwnerController4 oc4 = new OwnerController4(ow, pBag, eBag, o);
					OwnerController5 oc5 = new OwnerController5(ow, pBag, eBag, o);
					OwnerController6 oc6 = new OwnerController6(ow, pBag, eBag, o);
					OwnerController7 oc7 = new OwnerController7(ow, pBag, eBag, o);
					OwnerController8 oc8 = new OwnerController8(ow, pBag, eBag, o);
					OwnerController9 oc9 = new OwnerController9(ow, pBag, eBag, o);
					OwnerController10 oc10 = new OwnerController10(ow, pBag, eBag, o);
					OwnerController11 oc11 = new OwnerController11(ow, pBag, eBag, o);
					OwnerController12 oc12 = new OwnerController12(ow, pBag, eBag, o);
					OwnerController13 oc13 = new OwnerController13(ow, pBag, eBag, o);
					OwnerController14 oc14 = new OwnerController14(ow, pBag, eBag, o);
					OwnerController15 oc15 = new OwnerController15(ow, pBag, eBag, o);
					OwnerController16 oc16 = new OwnerController16(ow, pBag, eBag, o);
					
				} else {
					// IF MANAGER DATA FOUND THE MANAGER WINDOW OPENS
					if (pBag.findLnP(id, password) instanceof Manager){
						Manager m = (Manager)pBag.findLnP(id, password);
						//ManagerWindowEvent mwe = new ManagerWindowEvent(this, m);
						//CONTROLLERS FOR MANAGER WINDOW
						ManagerWindow mw = new ManagerWindow(pBag, m, eBag);
						ManagerController mc = new ManagerController(mw, pBag, eBag, m);
						ManagerController2 mc2 = new ManagerController2(mw, pBag, eBag, m);
						ManagerController3 mc3 = new ManagerController3(mw, pBag, eBag, m);
						ManagerController4 mc4 = new ManagerController4(mw, pBag, eBag, m);
						ManagerController5 mc5 = new ManagerController5(mw, pBag, eBag, m);
						ManagerController6 mc6 = new ManagerController6(mw, pBag, eBag, m);
						ManagerController7 mc7 = new ManagerController7(mw, pBag, eBag, m);
						
					} else{
						//IF CUSTUMER DATA FOUND THE CUSTUMER WINDOW OPENS
						if(pBag.findLnP(id, password) instanceof Custumer){
							Custumer c =(Custumer) pBag.findLnP(id, password);
							CustumerWindow cw = new CustumerWindow(pBag, c, eBag);
							
						} else {
							
							// IF NOT FOUND THE INFO WINDOW WILL APPEAR
							new NoFoundInfo();
						}
					
					} 
					
					
				}
			}
			
		});
	}

}
