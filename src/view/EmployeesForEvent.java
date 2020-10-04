package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import model.Bartender;
import model.Cashier;
import model.ClubEvent;
import model.Cook;
import model.DJ;
import model.EventBag;
import model.Manager;
import model.PeopleBag;
import model.Waiter;

public class EmployeesForEvent {

	private GridPane gpane;
	private Label bartenderLbl;
	private ComboBox<String> bartenderBox;
	
	private Label djLbl;
	private ComboBox<String> djBox;
	private Label waiterLbl;
	private ComboBox<String> waiterBox;
	private Label cookLbl;
	private ComboBox<String> cookBox;
	private Label cashierLbl;
	private ComboBox<String> cashierBox;
	private Button confirmBtn;
	
	private VBox mPane;
	
	public EmployeesForEvent(PeopleBag pBag, Manager m, EventBag eBag, ClubEvent ce) {
		mPane = new VBox();
		mPane.setAlignment(Pos.CENTER);
		gpane = new GridPane();
		gpane.setVgap(10);
		gpane.setAlignment(Pos.CENTER);
		bartenderLbl = new Label("Bartender:");
		bartenderBox = new ComboBox<String>();
		djLbl = new Label("DJ:");
		djBox = new ComboBox<String>();
		waiterLbl = new Label("Waiter:");
		waiterBox = new ComboBox<String>();
		cookLbl = new Label("Cook:");
		cookBox = new ComboBox<String>();
		cashierLbl = new Label("Cashier:");
		cashierBox = new ComboBox<String>();
		confirmBtn = new Button("Confirm");
		confirmBtn.setAlignment(Pos.BASELINE_RIGHT);
		
		gpane.add(bartenderLbl, 0, 0);
		gpane.add(bartenderBox, 1, 0);
		gpane.add(djLbl, 0, 1);
		gpane.add(djBox, 1, 1);
		gpane.add(waiterLbl, 0, 2);
		gpane.add(waiterBox, 1, 2);
		gpane.add(cookLbl, 0, 3);
		gpane.add(cookBox, 1, 3);
		gpane.add(cashierLbl, 0, 4);
		gpane.add(cashierBox, 1, 4);
		gpane.add(confirmBtn, 0, 5);
		
		for(int i = 0; i < m.getEmployees().getBartenders().length; i++){
			bartenderBox.getItems().add(m.getEmployees().getBartenders()[i].getfName()+
					" "+m.getEmployees().getBartenders()[i].getlName()+" "+m.getEmployees().getBartenders()[i].getId());
		}
		
		for(int i = 0; i < m.getEmployees().getDJs().length; i++){
			djBox.getItems().add(m.getEmployees().getDJs()[i].getfName()+
					" "+m.getEmployees().getDJs()[i].getlName()+
					" "+m.getEmployees().getDJs()[i].getId());
		}
		
		for(int i = 0; i < m.getEmployees().getwts().length; i++){
			waiterBox.getItems().add(m.getEmployees().getwts()[i].getfName()+
					" "+m.getEmployees().getwts()[i].getlName()+
					" "+m.getEmployees().getwts()[i].getId());
		}
		for(int i = 0; i < m.getEmployees().getcks().length; i++){
			cookBox.getItems().add(m.getEmployees().getcks()[i].getfName()+
					" "+m.getEmployees().getcks()[i].getlName()+
					" "+m.getEmployees().getcks()[i].getId());
		}
		
		for(int i = 0; i < m.getEmployees().getcas().length; i++){
			cashierBox.getItems().add(m.getEmployees().getcas()[i].getfName()+
					" "+m.getEmployees().getcas()[i].getlName()+
					" "+m.getEmployees().getcas()[i].getId());
		}
		
		
		
		
		confirmBtn.setOnAction(e->{
			String bname[] = bartenderBox.getValue().split(" ");
			String bfname = bname[0];
			String blname = bname[1];
			Bartender bt = (m.getEmployees().findBartenderByName(bfname, blname));
			ce.setBartender(m.getEmployees().findBartenderByName(bfname, blname));
			String wtname[] = waiterBox.getValue().split(" ");
			Waiter wt = (Waiter) m.getEmployees().findPerson(wtname[2]);
			ce.setWaiter(wt);
			///////
			String ckname[] = cookBox.getValue().split(" ");
			Cook ck = (Cook) m.getEmployees().findPerson(ckname[2]);
			ce.setCook(ck);
			///////////////////
			String djname[] = djBox.getValue().split(" ");
			DJ dj = (DJ) m.getEmployees().findPerson(djname[2]);
			ce.setDj(dj);
			/////////////////////////////////
			String caname[] = cashierBox.getValue().split(" ");
			Cashier ca = (Cashier) m.getEmployees().findPerson(caname[2]);
			ce.setCashier(ca);
			/////////////
			eBag.save();// saving ebag changes
			m.geteBag().findByName(ce.getName()).setBartender(bt);
			m.geteBag().findByName(ce.getName()).setDj(dj);
			m.getOwner().getClub().geteBag().findByName(ce.getName()).setBartender(bt);
			m.getOwner().getClub().geteBag().findByName(ce.getName()).setDj(dj);
			pBag.save();
			new ChangeInfo();
			
		});
		mPane.getChildren().addAll(gpane);
	}
	
	public VBox getPane(){
		return mPane;
	}
}
