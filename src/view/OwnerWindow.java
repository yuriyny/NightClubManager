package view;

import controller.AddEventEve;
import controller.AddManagerEve;
import controller.AddManagerEvent;
import controller.BartenderInfoEvent;
import controller.BoughtTicketsEvent;
import controller.CashierInfoEvent;
import controller.CookInfoEvent;
import controller.DJInfoEvent;
import controller.EventDetailsEve;
import controller.ExpEvent;
import controller.ManagerDetEvent;
import controller.NewEventEvent;
import controller.OwnerClubPaneEve;
import controller.OwnerInfoEvent;
import controller.OwnerListener;
import controller.OwnerListener10;
import controller.OwnerListener11;
import controller.OwnerListener12;
import controller.OwnerListener13;
import controller.OwnerListener14;
import controller.OwnerListener15;
import controller.OwnerListener16;
import controller.OwnerListener2;
import controller.OwnerListener3;
import controller.OwnerListener4;
import controller.OwnerListener5;
import controller.OwnerListener6;
import controller.OwnerListener7;
import controller.OwnerListener8;
import controller.OwnerListener9;
import controller.WTInfoEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.ClubEvent;
import model.EventBag;
import model.Manager;
import model.Owner;
import model.PeopleBag;

public class OwnerWindow {
	/**
	 * THIS IS OWNER MAIN WINDOW HERE YOU CAN FIND THE PANES CALLED ON EACH
	 * ACTION(WHEN SPECIFIC BTN IS PRESSED)
	 */
	private MenuBar menuBar;
	private BorderPane bPane;
	private VBox vbox;
	private Button myInfoBtn;
	private Button clubBtn;
	private Button managerBtn;
	private Button bartenderBtn;
	private Button djBtn;
	private Button waiterBtn;
	private Button cookBtn;
	private Button cashierBtn;
	private OwnerInfoPane oip;
	private VBox clubPane;

	private Button eventBtn;
	private Button addManagerBtn;
	private Button removeManagerBtn;
	private Button newEventBtn;
	private Button addEventBtn;
	private Button removeEventBtn;

	private ListView<String> list;
	private ObservableList<String> wordsList;

	private ListView<String> elist;
	private ObservableList<String> eventsList;
	private String idStr;
	private String eName;
	private VBox elistBox;
	private VBox blistBox;
	// Center Pane Fields
	// private

	// bartender list
	private ListView<String> blist;
	private ObservableList<String> bartndList;

	private Stage stage;

	///////////////////////////////////////////////////////////
	private Button ticketsBoughtBtn;
	////////////////////////////////////////////////
	private Button emplExpensesBtn;
	VBox listBox;
	//////
	private OwnerListener listener;
	private OwnerListener2 listener2;
	private OwnerListener3 listener3;
	private OwnerListener4 listener4;
	private OwnerListener5 listener5;
	private OwnerListener6 listener6;
	private OwnerListener7 listener7;
	private OwnerListener8 listener8;
	private OwnerListener9 listener9;
	private OwnerListener10 listener10;
	private OwnerListener11 listener11;
	private OwnerListener12 listener12;
	private OwnerListener13 listener13;
	private OwnerListener14 listener14;
	private OwnerListener15 listener15;
	private OwnerListener16 listener16;

	public OwnerWindow(PeopleBag pBag, Owner o, EventBag eBag) {
		Insets insets = new Insets(10, 10, 10, 10);
		Insets insetsZ = new Insets(30, 30, 30, 30);
		ticketsBoughtBtn = new Button("Tickets Bought");
		emplExpensesBtn = new Button("Employees Expenses");
		ticketsBoughtBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		emplExpensesBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		idStr = "";
		eName = "";
		listBox = new VBox(10);

		listBox.setAlignment(Pos.CENTER);
		listBox.setPadding(insetsZ);
		elistBox = new VBox();
		elistBox.setPadding(insetsZ);
		elistBox.setAlignment(Pos.CENTER);
		blistBox = new VBox();
		blistBox.setPadding(insetsZ);
		blistBox.setAlignment(Pos.CENTER);
		listBox.setAlignment(Pos.CENTER);
		addManagerBtn = new Button("Add New Manager");
		removeManagerBtn = new Button("Remove This Manager");
		newEventBtn = new Button("Assighn an Event");

		addEventBtn = new Button("Add New Event");
		removeEventBtn = new Button("Cancel The Event");
		////////////////////////////////////////////////////////////////////////////////////
		// Left pane options
		bPane = new BorderPane();
		bPane.setPadding(insets);
		vbox = new VBox(20);
		vbox.setAlignment(Pos.CENTER);
		myInfoBtn = new Button("My Info");
		myInfoBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		managerBtn = new Button("Managers");
		managerBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		bartenderBtn = new Button("Bertenders");
		bartenderBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		djBtn = new Button("DJs");
		djBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		waiterBtn = new Button("Waiters");
		waiterBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		cookBtn = new Button("Cooks");
		cookBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		cashierBtn = new Button("Cashier");
		cashierBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		clubBtn = new Button("My Club");
		clubBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		eventBtn = new Button("Events");
		eventBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		vbox.getChildren().addAll(myInfoBtn, clubBtn, eventBtn, managerBtn, bartenderBtn, djBtn, waiterBtn, cookBtn,
				cashierBtn, ticketsBoughtBtn, emplExpensesBtn);
		bPane.setLeft(vbox);
		// Left Pane Ends
		////////////////////////////////////////////////
		// Center Pane

		// DISPLAYING OWNERS INFORMATION
		myInfoBtn.setOnAction(e -> {
			OwnerInfoEvent oic = new OwnerInfoEvent(this, pBag, o);
			if (listener != null) {
				listener.click(oic);
			}
		});
		clubBtn.setOnAction(e -> {
			if (o.getClub().getName() == null) {

				OwnerNoClubEvent once = new OwnerNoClubEvent(this, pBag, o);

				if (listener2 != null) {
					listener2.click(once);
				}

			} else {
				OwnerClubPaneEve ocp = new OwnerClubPaneEve(this, pBag, o);
				if (listener3 != null) {
					listener3.click(ocp);
				}

			}

		});
// WHEN EVENT BTN IS PRESSED...
		eventBtn.setOnAction(e -> {
			//IF THERE IS NO EVENT, THE ACCORDING PANE ABOUT THAT WILL APPEAR
			if (o.getClub() == null || o.getClub().geteBag() == null || o.getClub().geteBag().isEmpty()) {
				EventBag eB = o.getClub().geteBag();
				//WINDOW WITH INFO ABOUT NOT HAVING EVENT
				AddEventEve aee = new AddEventEve(this, eB, o, pBag);

				if (listener4 != null) {
					listener4.click(aee);
				}


			} else {
// ELSE, DISPLAYING THE LIST OF EVENTS
				eventsList = FXCollections.observableArrayList();
				for (int i = 0; i < o.getClub().geteBag().getSize(); i++) {
					String eName = o.getClub().geteBag().getEvent(i).getName();
					eventsList.add(eName);
				}
				elist = new ListView<String>(eventsList);
				elistBox.getChildren().clear();
				elistBox.getChildren().addAll(elist, addEventBtn);
				elist.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
					public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
						elistBox.getChildren().clear();
						eName = new_val;
						ClubEvent e = o.getClub().geteBag().findByName(new_val);
						EventDetailsEve ede = new EventDetailsEve(this, e);
						if (listener5 != null) {
							listener5.click(ede);
						}
					}
				});

				bPane.setCenter(elistBox);
			}
		});
// MANAGER BTN PART
		managerBtn.setOnAction(e -> {
//IF THERE IS NO MANAGER, THE WINDOW ABOUT THAT WILL APPEAR
			if (o.getpBag().getManagers().length == 0) {
// ADDING MANAGER WINDOW
				AddManagerEvent ame = new AddManagerEvent(this, pBag, o);
				if (listener6 != null) {
					listener6.click(ame);
				}

			} else {
				//ELSE THERE WILL BE THE LIST OF MANAGERS HIRED BY OWNER
				wordsList = FXCollections.observableArrayList();
				// adding manager to the list from the bag
				for (int i = 0; i < o.getpBag().getManagers().length; i++) {
					String fName = o.getpBag().getManagers()[i].getfName();
					String lName = o.getpBag().getManagers()[i].getlName();
					String id = o.getpBag().getManagers()[i].getId();
					wordsList.add(fName + " " + lName + " ID: " + id);
				}

				list = new ListView<String>(wordsList);

				listBox.getChildren().clear();
				listBox.getChildren().addAll(list, addManagerBtn);
				list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

					public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
						listBox.getChildren().clear();
						String[] arr = new_val.split(" ");
						idStr = arr[3];
						Manager m = (Manager) o.getpBag().findPerson(arr[3]);

						ManagerDetEvent mde = new ManagerDetEvent(this, pBag, o, m);
						if (listener7 != null) {
							listener7.click(mde);
						}

					}
				});

				bPane.setCenter(listBox);

			}

		});
// ADDING NEW MANAGER
		addManagerBtn.setOnAction(e -> {
			AddManagerEve ame = new AddManagerEve(this, pBag, o);
			if (listener8 != null) {
				listener8.click(ame);
			}
		});
// REMOVING A MANAGER
		removeManagerBtn.setOnAction(e -> {
			o.getpBag().removeByID(idStr);
			pBag.removeByID(idStr);
			pBag.save();
		});
// ADDING NEW EVENT TO THE LIST
		addEventBtn.setOnAction(e -> {
			EventBag eB = o.getClub().geteBag();
			NewEventEvent nee = new NewEventEvent(this, eB);
			if (listener9 != null) {
				listener9.click(nee);
			}

		});
// REMOVING AN EVENT
		removeEventBtn.setOnAction(e -> {
			o.getClub().geteBag().remove(eName);
			eBag.remove(eName);
			eBag.save();
			pBag.save();
			new ChangeInfo();
		});

		// bartender part
// IF MANAGER DIDN'T HIRE ANY EMPLOYEES BELOW, THE INFORMATION ABOUT THAT WILL APPEAR AFTER CLICKING CORRESPONDING BTN
		// OTHRWISE THE COMBOBOX WITH EMPLOYEES WILL APPEAR
		bartenderBtn.setOnAction(e -> {
			int count = 0;
			for (int i = 0; i < o.getpBag().getSize(); i++) {
				for (int j = 0; j < o.getpBag().getManagers()[i].getEmployees().getBartenders().length; j++) {
					count++;
				}
			}

			if (o.getpBag() == null || o.getpBag().getSize() == 0 || count == 0) {
				infoAlert("Bartender");
			} else {

				BartenderInfoEvent bie = new BartenderInfoEvent(this, o);

				if (listener10 != null) {
					listener10.click(bie);
				}

				// BartenderInfoBox bib = new BartenderInfoBox(o);
				// bPane.setCenter(bib.getPane());
			}

		});
		//////////////////////////////////////////////////////////////////////////////////////
		// DJ part
		djBtn.setOnAction(e -> {
			int count = 0;
			for (int i = 0; i < o.getpBag().getSize(); i++) {
				for (int j = 0; j < o.getpBag().getManagers()[i].getEmployees().getDJs().length; j++) {
					count++;
				}
			}

			if (o.getpBag() == null || o.getpBag().getSize() == 0 || count == 0) {
				infoAlert("DJ");
			} else {
				DJInfoEvent die = new DJInfoEvent(this, o);
				if (listener11 != null) {
					listener11.click(die);
				}
				// DJInfoBox bib = new DJInfoBox(o);
				// bPane.setCenter(bib.getPane());
			}

		});

		// Waiter part
		waiterBtn.setOnAction(e -> {
			int count = 0;
			for (int i = 0; i < o.getpBag().getSize(); i++) {
				for (int j = 0; j < o.getpBag().getManagers()[i].getEmployees().getwts().length; j++) {
					count++;
				}
			}

			if (o.getpBag() == null || o.getpBag().getSize() == 0 || count == 0) {
				infoAlert("Waiter");
			} else {

				WTInfoEvent we = new WTInfoEvent(this, o);
				if (listener12 != null) {
					listener12.click(we);
				}

				// WTInfoBox bib = new WTInfoBox(o);
				// bPane.setCenter(bib.getPane());
			}

		});
		// Cook part
		cookBtn.setOnAction(e -> {
			int count = 0;
			for (int i = 0; i < o.getpBag().getSize(); i++) {
				for (int j = 0; j < o.getpBag().getManagers()[i].getEmployees().getcks().length; j++) {
					count++;
				}
			}

			if (o.getpBag() == null || o.getpBag().getSize() == 0 || count == 0) {
				infoAlert("Cook");
			} else {
				CookInfoEvent cie = new CookInfoEvent(this, o);
				if (listener13 != null) {
					listener13.click(cie);
				}
				// CookInfoBox bib = new CookInfoBox(o);
				// bPane.setCenter(bib.getPane());
			}

		});

		// Cashier part
		cashierBtn.setOnAction(e -> {
			int count = 0;
			for (int i = 0; i < o.getpBag().getSize(); i++) {
				for (int j = 0; j < o.getpBag().getManagers()[i].getEmployees().getcas().length; j++) {
					count++;
				}
			}

			if (o.getpBag() == null || o.getpBag().getSize() == 0 || count == 0) {
				infoAlert("Cashier");
			} else {
				CashierInfoEvent cie = new CashierInfoEvent(this, o);
				if (listener14 != null) {
					listener14.click(cie);
				}

				// CashierInfoBox bib = new CashierInfoBox(o);
				// bPane.setCenter(bib.getPane());
			}

		});
		///////////////// Tickets Bought btn/////////////////////////
//
	//THE INFORMATION ABOUT ALL TICKETS, TABLES, INVENTORIES THAT ANY CUSTUMER BOUGHT WILL APPEAR HERE	
		ticketsBoughtBtn.setOnAction(e -> {
			BoughtTicketsEvent bte = new BoughtTicketsEvent(this, o);
			if (listener15 != null) {
				listener15.click(bte);
			}
			//

		});
		
// THE LAST BTN WILL DISPLAY EVENTS AND HOW MUCH MONEY THE OWNER WILL HAVE TO SPEND FOR EACH EMPLOYEES

		/////////////// Empl Exp BTN
		emplExpensesBtn.setOnAction(e -> {

			ExpEvent ee = new ExpEvent(this, pBag, o, eBag);

			if (listener16 != null) {
				listener16.click(ee);
			}

			// ExpWindow w = new ExpWindow(pBag, o, eBag);
			// bPane.setCenter(w.getPane());
		});

		stage = new Stage();
		stage.setScene(new Scene(bPane, 1000, 800));
		stage.show();

	}

	public Button getRemoveManagerBtn() {
		return removeManagerBtn;
	}

	public void setRemoveManagerBtn(Button removeManagerBtn) {
		this.removeManagerBtn = removeManagerBtn;
	}

	public Button getTicketsBoughtBtn() {
		return ticketsBoughtBtn;
	}

	public void setTicketsBoughtBtn(Button ticketsBoughtBtn) {
		this.ticketsBoughtBtn = ticketsBoughtBtn;
	}

	public ListView<String> getList() {
		return list;
	}

	public void setList(ListView<String> list) {
		this.list = list;
	}

	public Button getAddManagerBtn() {
		return addManagerBtn;
	}

	public void setAddManagerBtn(Button addManagerBtn) {
		this.addManagerBtn = addManagerBtn;
	}

	public VBox getListBox() {
		return listBox;
	}

	public Button getAddEventBtn() {
		return addEventBtn;
	}

	public void setAddEventBtn(Button addEventBtn) {
		this.addEventBtn = addEventBtn;
	}

	public Button getRemoveEventBtn() {
		return removeEventBtn;
	}

	public void setRemoveEventBtn(Button removeEventBtn) {
		this.removeEventBtn = removeEventBtn;
	}

	public ListView<String> getElist() {
		return elist;
	}

	public void setElist(ListView<String> elist) {
		this.elist = elist;
	}

	public void setOwnerWindowPane(OwnerInfoPane oip) {
		this.oip = oip;
	}

	public void setClubPane(VBox pane) {
		this.clubPane = pane;
	}

	private void infoAlert(String info) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("No " + info + " Found");
		alert.setHeaderText("Currently You don't have " + info + " in Your Club");
		alert.setContentText("Press OK to exit.");

		alert.showAndWait();
	}

	public VBox getElistBox() {
		return elistBox;
	}

	public void setElistBox(VBox elistBox) {
		this.elistBox = elistBox;
	}

	public VBox getBlistBox() {
		return blistBox;
	}

	public void setBlistBox(VBox blistBox) {
		this.blistBox = blistBox;
	}

	public BorderPane getBPane() {
		return bPane;
	}

	public void setListener(OwnerListener listener) {
		this.listener = listener;
	}

	public void setListener2(OwnerListener2 listener2) {
		this.listener2 = listener2;
	}

	public void setListener3(OwnerListener3 listener3) {
		this.listener3 = listener3;
	}

	public void setListener4(OwnerListener4 listener4) {
		this.listener4 = listener4;
	}

	public void setListener5(OwnerListener5 listener5) {
		this.listener5 = listener5;
	}

	public void setListener6(OwnerListener6 listener6) {
		this.listener6 = listener6;
	}

	public void setListener7(OwnerListener7 listener7) {
		this.listener7 = listener7;
	}

	public void setListener8(OwnerListener8 listener8) {
		this.listener8 = listener8;
	}

	public void setListener9(OwnerListener9 listener9) {
		this.listener9 = listener9;
	}

	public void setListener10(OwnerListener10 listener10) {
		this.listener10 = listener10;
	}

	public void setListener11(OwnerListener11 listener11) {
		this.listener11 = listener11;
	}

	public void setListener12(OwnerListener12 listener12) {
		this.listener12 = listener12;
	}

	public void setListener13(OwnerListener13 listener13) {
		this.listener13 = listener13;
	}

	public void setListener14(OwnerListener14 listener14) {
		this.listener14 = listener14;
	}

	public void setListener15(OwnerListener15 listener15) {
		this.listener15 = listener15;
	}

	public void setListener16(OwnerListener16 listener16) {
		this.listener16 = listener16;
	}

}
