package view;

import controller.BartenderDetailsEvent;
import controller.DJDetailsEvent;
import controller.ManagerEventInfoEve;
import controller.ManagerListener;
import controller.ManagerListener2;
import controller.ManagerListener3;
import controller.ManagerListener4;
import controller.ManagerListener5;
import controller.ManagerListener6;
import controller.ManagerListener7;
import controller.MyInfoManagerEvent;
import controller.NewBartenderEvent;
import controller.NoBartenderInfoEve;
import controller.NoDJInfoEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Bartender;
import model.Cashier;
import model.Cook;
import model.DJ;
import model.EventBag;
import model.Manager;
import model.PeopleBag;
import model.Waiter;

public class ManagerWindow {

	private BorderPane bPane;
	private VBox vInfo;
	private Label l;

	private VBox vbox;// for buttons
	private Button myInfoBtn;
	private Button bartenderBtn;
	private Button djBtn;
	private Button waiterBtn;
	private Button cookBtn;
	private Button cashierBtn;
	private Button eventBtn;
	private Stage stage;

	//// myinfo btns
	private Button editBtn;
	private Button saveBtn;
	private HBox btnPane;
	private VBox mBox;
	// List Data
	// 4 bartender
	private ListView<String> list;
	private ObservableList<String> wordsList;
	private VBox listBox;
	private Button addBartenderBtn;
	private Button removeBartenderBtn;
	private String idStr;
	
	// 4 DJ
	private ListView<String> djlist;
	private ObservableList<String> djwordsList;
	private VBox djlistBox;
	private Button addDjBtn;
	private Button removeDjBtn;
	//
	///waiter
	private ListView<String> wtlist;
	private ObservableList<String> wtwordsList;
	private VBox wtlistBox;
	private Button addwtBtn;
	private Button removewtBtn;
	
	// cook
	private ListView<String> cklist;
	private ObservableList<String> ckwordsList;
	private VBox cklistBox;
	private Button addckBtn;
	private Button removeckBtn;
	
	// cashier
	private ListView<String> calist;
	private ObservableList<String> cawordsList;
	private VBox calistBox;
	private Button addcaBtn;
	private Button removecaBtn;
	
	//listeners start here
	private ManagerListener listener;
	private ManagerListener2 listener2;
	private ManagerListener3 listener3;
	private ManagerListener4 listener4;
	private ManagerListener5 listener5;
	private ManagerListener6 listener6;
	private ManagerListener7 listener7;
	
	public ManagerWindow(PeopleBag pBag, Manager m, EventBag eBag) {
		Insets insets = new Insets(10, 10, 10, 10);
		Insets insetsZ = new Insets(30, 30, 30, 30);
		addBartenderBtn = new Button("Add New Bartender");
		addDjBtn = new Button("Add New DJ");
		addwtBtn = new Button("Add New Waiter");
		addckBtn = new Button("Add New Cook");
		addcaBtn = new Button("Add New Cashier");
		removeBartenderBtn = new Button("Remove");
		removeDjBtn = new Button("Remove");
		removewtBtn = new Button("Remove");
		removeckBtn = new Button("Remove");
		removecaBtn = new Button("Remove");
		listBox = new VBox(10);
		listBox.setPadding(insetsZ);
		listBox.setAlignment(Pos.CENTER);
		djlistBox = new VBox(10);
		djlistBox.setPadding(insetsZ);
		djlistBox.setAlignment(Pos.CENTER);
		wtlistBox = new VBox(10);
		wtlistBox.setPadding(insetsZ);
		wtlistBox.setAlignment(Pos.CENTER);
		cklistBox = new VBox(10);
		cklistBox.setPadding(insetsZ);
		cklistBox.setAlignment(Pos.CENTER);
		calistBox = new VBox(10);
		calistBox.setPadding(insetsZ);
		calistBox.setAlignment(Pos.CENTER);
		bPane = new BorderPane();
		bPane.setPadding(insets);
		vInfo = new VBox(20);
		vInfo.setAlignment(Pos.CENTER);
		editBtn = new Button("Edit");
		vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		myInfoBtn = new Button("My Info");
		myInfoBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
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
		eventBtn = new Button("Events");
		eventBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		vbox.getChildren().addAll(myInfoBtn,  eventBtn,  bartenderBtn, djBtn, waiterBtn, cookBtn,
				cashierBtn);
		bPane.setLeft(vbox);
		
		// button pane ends here
		
		// left panes starts here
		saveBtn = new Button("Save Changes");
		
		
///////////////MY INFO BTN	
		//AFTER CLICKING MY INFO BTN THE NEW WINDOW ON THE RIGHT WILL APPEAR
		myInfoBtn.setOnAction(e->{
			MyInfoManagerEvent me = new MyInfoManagerEvent(this, pBag, m);
			if(listener != null){
				listener.click(me);
			}

		});
/////////////////end of MY INFO BTN
		// EVENT BTN ACTION
		eventBtn.setOnAction(e->{
			//IF THERE IS NO EVENT CREATED THE INFO ABOUT THAT WILL APPEAR
			if(m.geteBag().isEmpty() || m.geteBag() == null){
				new NoEventWindow();
				
			} else{
				//IF THERE IS SOME EVENT, IT WILL APPEAR ON THE LIST
				ManagerEventInfoEve meve = new ManagerEventInfoEve(this,pBag, m, eBag);
				if(listener2 != null){
					listener2.click(meve);
				}
				

			}
		});
///////////////////End of Event btn//////////////////////////////////		
//////Bartender BTN////////////////////////////////////////////////////////		
		 bartenderBtn.setOnAction(e->{
			 // BARTENDER BTN
			 if(m.getEmployees().getBartenders().length == 0){
				 //IF MANAGER DIDN'T HIRE ANY BARTENDER, THE OWNER WILL SEE INFO ABOUT THAT 
				 NoBartenderInfoEve nb = new NoBartenderInfoEve(this,pBag, m);
				 if(listener3 != null){
						listener3.click(nb);
					}
				 

			 } else {
				 //lIST OF BARTENDERS APPEARS HERE
				 wordsList = FXCollections.observableArrayList();

					for (int i = 0; i < m.getEmployees().getBartenders().length; i++) {
						String fName = m.getEmployees().getBartenders()[i].getfName();
						String lName = m.getEmployees().getBartenders()[i].getlName();
						String id = m.getEmployees().getBartenders()[i].getId();
						wordsList.add(fName + " " + lName + " ID: " + id);

					}
					list = new ListView<String>(wordsList);
					
					listBox.getChildren().clear();
					listBox.getChildren().addAll(list, addBartenderBtn);
					list.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
						public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
							//bPane.setCenter(null);
							listBox.getChildren().clear();
							String[] arr = new_val.split(" ");
							idStr = arr[3];
							Bartender b = (Bartender) m.getEmployees().findPerson(arr[3]);
							BartenderDetailsEvent be = new BartenderDetailsEvent(this,pBag, m, b);
							if(listener4 != null){
								listener4.click(be);
							}
//							BartenderDetails btd = new BartenderDetails(pBag, m, b);
//							listBox.getChildren().addAll(list, btd.getPane(), removeBartenderBtn);
//							bPane.setCenter(listBox);

						}
					});
					
					bPane.setCenter(listBox);
			 }
		 });
		// ADDING NEW BARTENDER
		 addBartenderBtn.setOnAction(e->{
			 //PANE FOR ADDING NEW BARTENDER
			 NewBartenderEvent ne = new NewBartenderEvent(this,pBag, m);
			 if(listener5 != null){
					listener5.click(ne);
				}

		 });
		 //REMOVING BARTENDER
		 removeBartenderBtn.setOnAction(e -> {
			 m.getEmployees().removeByID(idStr);
				pBag.removeByID(idStr);
				pBag.save();
			});
		
///////////////////////End of Bartender Button///////////////////////////////////////////////		
		 
/////DJ btn//////////////////////////////////////////////////////
		 
		 //DJBUTTON ACTION
		 djBtn.setOnAction(e->{
			 //ALERT IF THERE IS NO DJ HIRED BY MANAGER
			 if(m.getEmployees().getDJs().length == 0){
				 NoDJInfoEvent ne = new NoDJInfoEvent(this, pBag, m);
				 if(listener6 != null){
						listener6.click(ne);
					}
			 } else {
				 //ELSE DISPLAYING DJ HIRE ON THE LIST
				 djwordsList = FXCollections.observableArrayList();

					for (int i = 0; i < m.getEmployees().getDJs().length; i++) {
						String fName = m.getEmployees().getDJs()[i].getfName();
						String lName = m.getEmployees().getDJs()[i].getlName();
						String id = m.getEmployees().getDJs()[i].getId();
						djwordsList.add(fName + " " + lName + " ID: " + id);

					}
					djlist = new ListView<String>(djwordsList);

					djlistBox.getChildren().clear();
					djlistBox.getChildren().addAll(djlist, addDjBtn);
					djlist.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
						public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
							//bPane.setCenter(null);
							djlistBox.getChildren().clear();
							String[] arr = new_val.split(" ");
							idStr = arr[3];
							DJ d = (DJ) m.getEmployees().findPerson(arr[3]);
							DJDetailsEvent de = new DJDetailsEvent(this, pBag, m, d);
							if(listener7 != null){
								listener7.click(de);
							}


						}
					});
					
					bPane.setCenter(djlistBox);
			 }
		 });
		 // ADDING NEW DJ
		 addDjBtn.setOnAction(e->{
			 NewDJInfo _nbi = new NewDJInfo(pBag, m);
			bPane.setCenter(_nbi.getPane());
		 });
		 //REMOVING DJ FROM THE LIST
		 removeDjBtn.setOnAction(e -> {
			 m.getEmployees().removeByID(idStr);
				pBag.removeByID(idStr);
				pBag.save();
			});
		 
////////////////////End of DJ Part///////////////////////////////////////////////////////////	
////////Waiter PART
		 
		 //SAME FOR WAITER AND OTHER EMPLOYEES BELOW
		 waiterBtn.setOnAction(e->{
			 if(m.getEmployees().getwts().length == 0){
				 NoWTInfo ndi = new NoWTInfo(pBag, m);
				 bPane.setCenter(ndi.getPane());
			 } else {
				 wtwordsList = FXCollections.observableArrayList();

					for (int i = 0; i < m.getEmployees().getwts().length; i++) {
						String fName = m.getEmployees().getwts()[i].getfName();
						String lName = m.getEmployees().getwts()[i].getlName();
						String id = m.getEmployees().getwts()[i].getId();
						wtwordsList.add(fName + " " + lName + " ID: " + id);

					}
					wtlist = new ListView<String>(wtwordsList);

					wtlistBox.getChildren().clear();
					wtlistBox.getChildren().addAll(wtlist, addwtBtn);
					wtlist.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
						public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
							//bPane.setCenter(null);
							wtlistBox.getChildren().clear();
							String[] arr = new_val.split(" ");
							idStr = arr[3];
							Waiter d = (Waiter) m.getEmployees().findPerson(arr[3]);
							WTDetails wtd = new WTDetails(pBag, m, d);
							wtlistBox.getChildren().addAll(wtlist, wtd.getPane(), removewtBtn);
							bPane.setCenter(wtlistBox);

						}
					});
					
					bPane.setCenter(wtlistBox);
			 }
		 });
		 
		 addwtBtn.setOnAction(e->{
			 NewWTInfo _nbi = new NewWTInfo(pBag, m);
			bPane.setCenter(_nbi.getPane());
		 });
		 
		 removewtBtn.setOnAction(e -> {
			 m.getEmployees().removeByID(idStr);
				pBag.removeByID(idStr);
				pBag.save();
			});
//////////////////////////////
/////////Cook Part
		 cookBtn.setOnAction(e->{
			 if(m.getEmployees().getcks().length == 0){
				 NoCkInfo ndi = new NoCkInfo(pBag, m);
				 bPane.setCenter(ndi.getPane());
			 } else {
				 ckwordsList = FXCollections.observableArrayList();

					for (int i = 0; i < m.getEmployees().getcks().length; i++) {
						String fName = m.getEmployees().getcks()[i].getfName();
						String lName = m.getEmployees().getcks()[i].getlName();
						String id = m.getEmployees().getcks()[i].getId();
						ckwordsList.add(fName + " " + lName + " ID: " + id);

					}
					cklist = new ListView<String>(ckwordsList);

					cklistBox.getChildren().clear();
					cklistBox.getChildren().addAll(cklist, addckBtn);
					cklist.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
						public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
							//bPane.setCenter(null);
							cklistBox.getChildren().clear();
							String[] arr = new_val.split(" ");
							idStr = arr[3];
							Cook d = (Cook) m.getEmployees().findPerson(arr[3]);
							CkDetails wtd = new CkDetails(pBag, m, d);
							cklistBox.getChildren().addAll(cklist, wtd.getPane(), removeckBtn);
							bPane.setCenter(cklistBox);

						}
					});
					
					bPane.setCenter(cklistBox);
			 }
		 });
		 
		 addckBtn.setOnAction(e->{
			 NewCkInfo _nbi = new NewCkInfo(pBag, m);
			bPane.setCenter(_nbi.getPane());
		 });
		 
		 removeckBtn.setOnAction(e -> {
			 m.getEmployees().removeByID(idStr);
				pBag.removeByID(idStr);
				pBag.save();
			});
/////////////////////////////////////////////////////////////////		 
/////////////Cashier Part
		 cashierBtn.setOnAction(e->{
			 if(m.getEmployees().getcas().length == 0){
				 NoCaInfo ndi = new NoCaInfo(pBag, m);
				 bPane.setCenter(ndi.getPane());
			 } else {
				 cawordsList = FXCollections.observableArrayList();

					for (int i = 0; i < m.getEmployees().getcas().length; i++) {
						String fName = m.getEmployees().getcas()[i].getfName();
						String lName = m.getEmployees().getcas()[i].getlName();
						String id = m.getEmployees().getcas()[i].getId();
						cawordsList.add(fName + " " + lName + " ID: " + id);

					}
					calist = new ListView<String>(cawordsList);

					calistBox.getChildren().clear();
					calistBox.getChildren().addAll(calist, addcaBtn);
					calist.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
						public void changed(ObservableValue<? extends String> ov, String old_val, String new_val) {
							//bPane.setCenter(null);
							calistBox.getChildren().clear();
							String[] arr = new_val.split(" ");
							idStr = arr[3];
							Cashier d = (Cashier) m.getEmployees().findPerson(arr[3]);
							CaDetails wtd = new CaDetails(pBag, m, d);
							calistBox.getChildren().addAll(calist, wtd.getPane(), removecaBtn);
							bPane.setCenter(calistBox);

						}
					});
					
					bPane.setCenter(calistBox);
			 }
		 });
		 
		 addcaBtn.setOnAction(e->{
			 NewCaInfo _nbi = new NewCaInfo(pBag, m);
			bPane.setCenter(_nbi.getPane());
		 });
		 
		 removecaBtn.setOnAction(e -> {
			 m.getEmployees().removeByID(idStr);
				pBag.removeByID(idStr);
				pBag.save();
			});
///////////////////////////////////////////////////////
		 
		 
		 
		 
		 
		stage = new Stage();
		stage.setScene(new Scene(bPane, 1200,800));
		
		stage.show();
		
	}

	public VBox getvInfo() {
		return vInfo;
	}

	public void setvInfo(VBox vInfo) {
		this.vInfo = vInfo;
	}

	public Label getL() {
		return l;
	}

	public void setL(Label l) {
		this.l = l;
	}

	public VBox getVbox() {
		return vbox;
	}

	public void setVbox(VBox vbox) {
		this.vbox = vbox;
	}

	public Button getMyInfoBtn() {
		return myInfoBtn;
	}

	public void setMyInfoBtn(Button myInfoBtn) {
		this.myInfoBtn = myInfoBtn;
	}

	public Button getBartenderBtn() {
		return bartenderBtn;
	}

	public void setBartenderBtn(Button bartenderBtn) {
		this.bartenderBtn = bartenderBtn;
	}

	public Button getDjBtn() {
		return djBtn;
	}

	public void setDjBtn(Button djBtn) {
		this.djBtn = djBtn;
	}

	public Button getWaiterBtn() {
		return waiterBtn;
	}

	public void setWaiterBtn(Button waiterBtn) {
		this.waiterBtn = waiterBtn;
	}

	public Button getCookBtn() {
		return cookBtn;
	}

	public void setCookBtn(Button cookBtn) {
		this.cookBtn = cookBtn;
	}

	public Button getCashierBtn() {
		return cashierBtn;
	}

	public void setCashierBtn(Button cashierBtn) {
		this.cashierBtn = cashierBtn;
	}

	public Button getEventBtn() {
		return eventBtn;
	}

	public void setEventBtn(Button eventBtn) {
		this.eventBtn = eventBtn;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Button getEditBtn() {
		return editBtn;
	}

	public void setEditBtn(Button editBtn) {
		this.editBtn = editBtn;
	}

	public Button getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn(Button saveBtn) {
		this.saveBtn = saveBtn;
	}

	public HBox getBtnPane() {
		return btnPane;
	}

	public void setBtnPane(HBox btnPane) {
		this.btnPane = btnPane;
	}

	public VBox getmBox() {
		return mBox;
	}

	public void setmBox(VBox mBox) {
		this.mBox = mBox;
	}

	public ListView<String> getList() {
		return list;
	}

	public void setList(ListView<String> list) {
		this.list = list;
	}

	public ObservableList<String> getWordsList() {
		return wordsList;
	}

	public void setWordsList(ObservableList<String> wordsList) {
		this.wordsList = wordsList;
	}

	public VBox getListBox() {
		return listBox;
	}

	public void setListBox(VBox listBox) {
		this.listBox = listBox;
	}

	public Button getAddBartenderBtn() {
		return addBartenderBtn;
	}

	public void setAddBartenderBtn(Button addBartenderBtn) {
		this.addBartenderBtn = addBartenderBtn;
	}

	public Button getRemoveBartenderBtn() {
		return removeBartenderBtn;
	}

	public void setRemoveBartenderBtn(Button removeBartenderBtn) {
		this.removeBartenderBtn = removeBartenderBtn;
	}

	public String getIdStr() {
		return idStr;
	}

	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	public ListView<String> getDjlist() {
		return djlist;
	}

	public void setDjlist(ListView<String> djlist) {
		this.djlist = djlist;
	}

	public ObservableList<String> getDjwordsList() {
		return djwordsList;
	}

	public void setDjwordsList(ObservableList<String> djwordsList) {
		this.djwordsList = djwordsList;
	}

	public VBox getDjlistBox() {
		return djlistBox;
	}

	public void setDjlistBox(VBox djlistBox) {
		this.djlistBox = djlistBox;
	}

	public Button getAddDjBtn() {
		return addDjBtn;
	}

	public void setAddDjBtn(Button addDjBtn) {
		this.addDjBtn = addDjBtn;
	}

	public Button getRemoveDjBtn() {
		return removeDjBtn;
	}

	public void setRemoveDjBtn(Button removeDjBtn) {
		this.removeDjBtn = removeDjBtn;
	}

	public ListView<String> getWtlist() {
		return wtlist;
	}

	public void setWtlist(ListView<String> wtlist) {
		this.wtlist = wtlist;
	}

	public ObservableList<String> getWtwordsList() {
		return wtwordsList;
	}

	public void setWtwordsList(ObservableList<String> wtwordsList) {
		this.wtwordsList = wtwordsList;
	}

	public VBox getWtlistBox() {
		return wtlistBox;
	}

	public void setWtlistBox(VBox wtlistBox) {
		this.wtlistBox = wtlistBox;
	}

	public Button getAddwtBtn() {
		return addwtBtn;
	}

	public void setAddwtBtn(Button addwtBtn) {
		this.addwtBtn = addwtBtn;
	}

	public Button getRemovewtBtn() {
		return removewtBtn;
	}

	public void setRemovewtBtn(Button removewtBtn) {
		this.removewtBtn = removewtBtn;
	}

	public ListView<String> getCklist() {
		return cklist;
	}

	public void setCklist(ListView<String> cklist) {
		this.cklist = cklist;
	}

	public ObservableList<String> getCkwordsList() {
		return ckwordsList;
	}

	public void setCkwordsList(ObservableList<String> ckwordsList) {
		this.ckwordsList = ckwordsList;
	}

	public VBox getCklistBox() {
		return cklistBox;
	}

	public void setCklistBox(VBox cklistBox) {
		this.cklistBox = cklistBox;
	}

	public Button getAddckBtn() {
		return addckBtn;
	}

	public void setAddckBtn(Button addckBtn) {
		this.addckBtn = addckBtn;
	}

	public Button getRemoveckBtn() {
		return removeckBtn;
	}

	public void setRemoveckBtn(Button removeckBtn) {
		this.removeckBtn = removeckBtn;
	}

	public ListView<String> getCalist() {
		return calist;
	}

	public void setCalist(ListView<String> calist) {
		this.calist = calist;
	}

	public ObservableList<String> getCawordsList() {
		return cawordsList;
	}

	public void setCawordsList(ObservableList<String> cawordsList) {
		this.cawordsList = cawordsList;
	}

	public VBox getCalistBox() {
		return calistBox;
	}

	public void setCalistBox(VBox calistBox) {
		this.calistBox = calistBox;
	}

	public Button getAddcaBtn() {
		return addcaBtn;
	}

	public void setAddcaBtn(Button addcaBtn) {
		this.addcaBtn = addcaBtn;
	}

	public Button getRemovecaBtn() {
		return removecaBtn;
	}

	public void setRemovecaBtn(Button removecaBtn) {
		this.removecaBtn = removecaBtn;
	}

	public ManagerListener getListener() {
		return listener;
	}

	public ManagerListener2 getListener2() {
		return listener2;
	}

	public ManagerListener3 getListener3() {
		return listener3;
	}

	public ManagerListener4 getListener4() {
		return listener4;
	}

	public BorderPane getbPane() {
		return bPane;
	}

	public void setbPane(BorderPane bPane) {
		this.bPane = bPane;
	}
	public void setListener(ManagerListener managerListener) {
		this.listener = managerListener;
		
	}
	public void setListener2(ManagerListener2 managerListener2) {
		this.listener2 = managerListener2;
		
	}
	public void setListener3(ManagerListener3 managerListener3) {
		this.listener3 = managerListener3;
		
	}
	public void setListener4(ManagerListener4 managerListener4) {
		this.listener4 = managerListener4;
		
	}
	public void setListener5(ManagerListener5 managerListener5) {
		this.listener5 = managerListener5;
		
	}
	public void setListener6(ManagerListener6 managerListener6) {
		this.listener6 = managerListener6;
		
	}
	public void setListener7(ManagerListener7 managerListener7) {
		this.listener7 = managerListener7;
		
	}

	

}
