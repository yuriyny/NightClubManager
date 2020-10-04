package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Owner;
import model.PeopleBag;

public class BasicInfoPane {
	private VBox mPane;
	private GridPane gPane;
	private GridPane gPane2;
	private GridPane gPane3;
	private Text pInfoTxt;
	private Text addressTxt;
	private Text accountTxt;
	private Label fNameLbl;
	private Label lNameLbl;
	private Label phoneLbl;
	private Label stNameLbl;
	private Label stNumberLbl;
	private Label cityLbl;
	private Label stateLbl;
	
	private Label zipLbl;
	private Label loginLbl;
	private Label passwordLbl;
	
	
	private TextField fNameFld;
	private TextField lNameFld;
	private TextField phoneFld;
	private TextField stNameFld;
	private TextField stNumberFld;
	private TextField cityFld;
	private TextField stateFld;
	private TextField zipFld;
	private TextField loginFld;
	private TextField passwordFld;
	
	private Button saveBtn;
	private Button editBtn;
	
	
	public BasicInfoPane(){
		Insets insets = new Insets(10,10,10,50);
		mPane = new VBox(10);
		mPane.setAlignment(Pos.CENTER);
		mPane.setPadding(insets);
		gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		gPane2 = new GridPane();
		gPane2.setAlignment(Pos.CENTER);
		gPane3 = new GridPane();
		gPane3.setAlignment(Pos.CENTER);
		
		pInfoTxt = new Text("Personal Info:");
		addressTxt = new Text("Home Address:");
		accountTxt = new Text("Account Data:");
		fNameLbl = new Label("First Name:");
		lNameLbl = new Label("Last Name:");
		phoneLbl = new Label("Phone #:");
		stNameLbl = new Label("Street Name");
		stNumberLbl = new Label("Street Number");
		cityLbl = new Label("City");
		stateLbl = new Label("State");
		zipLbl = new Label("ZIP Code");
		loginLbl = new Label("Login");
		passwordLbl = new Label("Password");
		
		fNameFld = new TextField();
		//fNameFld.setEditable(false);
		lNameFld = new TextField();
		//lNameFld.setEditable(false);
		phoneFld = new TextField();
		//phoneFld.setEditable(false);
		stNameFld = new TextField();
		//stNameFld.setEditable(false);
		stNumberFld = new TextField();
		//stNumberFld.setEditable(false);
		cityFld = new TextField();
		//cityFld.setEditable(false);
		stateFld = new TextField();
		//stateFld.setEditable(false);
		zipFld = new TextField();
		//zipFld.setEditable(false);
		loginFld = new TextField();
		//loginFld.setEditable(false);
		passwordFld = new TextField();
		//passwordFld.setEditable(false);
		saveBtn = new Button("Save");
		// Pane for Info
		gPane.add(fNameLbl, 0, 0);
		gPane.add(fNameFld, 1, 0);
		gPane.add(lNameLbl, 0, 1);
		gPane.add(lNameFld, 1, 1);
		gPane.add(phoneLbl, 0, 2);
		gPane.add(phoneFld, 1, 2);
		//Pane for address
		gPane2.add(stNameLbl, 0, 0);
		gPane2.add(stNameFld, 1, 0);
		gPane2.add(stNumberLbl, 0, 1);
		gPane2.add(stNumberFld, 1, 1);
		gPane2.add(cityLbl, 0, 2);
		gPane2.add(cityFld, 1, 2);
		gPane2.add(stateLbl, 0, 3);
		gPane2.add(stateFld, 1, 3);
		gPane2.add(zipLbl, 0, 4);
		gPane2.add(zipFld, 1, 4);
		//Pane for account
		gPane3.add(loginLbl, 0, 0);
		gPane3.add(loginFld, 1, 0);
		gPane3.add(passwordLbl, 0, 1);
		gPane3.add(passwordFld, 1, 1);
		
		editBtn = new Button("Edit");
		
		editBtn.setOnAction(e->{
			fNameFld.setEditable(true);
			lNameFld.setEditable(true);
			phoneFld.setEditable(true);
			stNameFld.setEditable(true);
			stNumberFld.setEditable(true);
			cityFld.setEditable(true);
			stateFld.setEditable(true);
			zipFld.setEditable(true);
			loginFld.setEditable(true);
			passwordFld.setEditable(true);
			
		});
		
		
		
		
		mPane.getChildren().addAll(pInfoTxt, gPane, addressTxt, gPane2, gPane3, saveBtn);
		
		
	}
	public TextField getPasswordFld() {
		return passwordFld;
	}
	public void setPasswordFld(TextField passwordFld) {
		this.passwordFld = passwordFld;
	}
	public Button getEditBtn() {
		return editBtn;
	}
	public void setEditBtn(Button editBtn) {
		this.editBtn = editBtn;
	}
	public TextField getLoginFld() {
		return loginFld;
	}
	public void setLoginFld(TextField loginFld) {
		this.loginFld = loginFld;
	}
	public Text getpInfoTxt() {
		return pInfoTxt;
	}
	public void setpInfoTxt(Text pInfoTxt) {
		this.pInfoTxt = pInfoTxt;
	}
	public Text getAddressTxt() {
		return addressTxt;
	}
	public void setAddressTxt(Text addressTxt) {
		this.addressTxt = addressTxt;
	}
	public Text getAccountTxt() {
		return accountTxt;
	}
	public void setAccountTxt(Text accountTxt) {
		this.accountTxt = accountTxt;
	}
	public TextField getfNameFld() {
		return fNameFld;
	}
	public void setfNameFld(TextField fNameFld) {
		this.fNameFld = fNameFld;
	}
	public TextField getlNameFld() {
		return lNameFld;
	}
	public void setlNameFld(TextField lNameFld) {
		this.lNameFld = lNameFld;
	}
	public TextField getPhoneFld() {
		return phoneFld;
	}
	public void setPhoneFld(TextField phoneFld) {
		this.phoneFld = phoneFld;
	}
	public TextField getStNameFld() {
		return stNameFld;
	}
	public void setStNameFld(TextField stNameFld) {
		this.stNameFld = stNameFld;
	}
	public TextField getStNumberFld() {
		return stNumberFld;
	}
	public void setStNumberFld(TextField stNumberFld) {
		this.stNumberFld = stNumberFld;
	}
	public TextField getCityFld() {
		return cityFld;
	}
	public void setCityFld(TextField cityFld) {
		this.cityFld = cityFld;
	}
	public TextField getStateFld() {
		return stateFld;
	}
	public void setStateFld(TextField stateFld) {
		this.stateFld = stateFld;
	}
	public TextField getZipFld() {
		return zipFld;
	}
	public void setZipFld(TextField zipFld) {
		this.zipFld = zipFld;
	}
	public Button getSaveBtn() {
		return saveBtn;
	}
	public void setSaveBtn(Button saveBtn) {
		this.saveBtn = saveBtn;
	}
	public VBox getPane(){
		return mPane;
	}

}
