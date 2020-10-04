package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Address;
import model.Club;
import model.Owner;
import model.PeopleBag;
import model.TextFieldCheck;

public class OwnerInfoPane {
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
	
	private Button editBtn;
	private Button saveBtn;
	
	private HBox subBox;
	
	
	public OwnerInfoPane(PeopleBag pBag, Owner o){
		subBox = new HBox(10);
		subBox.setAlignment(Pos.CENTER);
		Insets insets = new Insets(10,10,10,50);
		mPane = new VBox(10);
		mPane.setPadding(insets);
		mPane.setAlignment(Pos.CENTER);
		mPane.setPadding(insets);
		gPane = new GridPane();
		gPane.setPadding(insets);
		gPane.setAlignment(Pos.CENTER);
		gPane2 = new GridPane();
		gPane2.setPadding(insets);
		gPane2.setAlignment(Pos.CENTER);
		gPane3 = new GridPane();
		gPane3.setPadding(insets);
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
		lNameFld = new TextField();
		phoneFld = new TextField();
		stNameFld = new TextField();
		stNumberFld = new TextField();
		cityFld = new TextField();
		stateFld = new TextField();
		zipFld = new TextField();
		loginFld = new TextField();
		passwordFld = new TextField();
		fNameFld.setEditable(false);
		lNameFld.setEditable(false);
		phoneFld.setEditable(false);
		stNameFld.setEditable(false);
		stNumberFld.setEditable(false);
		cityFld.setEditable(false);
		stateFld.setEditable(false);
		zipFld.setEditable(false);
		loginFld.setEditable(false);
		passwordFld.setEditable(false);
		saveBtn = new Button("Save");
		editBtn = new Button("Edit");
		subBox.getChildren().add(editBtn);
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
		
		
		fNameFld.setText(o.getfName());
		lNameFld.setText(o.getlName());
		phoneFld.setText(o.getPhone());
		stNameFld.setText(o.getAddress().getStName());
		stNumberFld.setText(o.getAddress().getStNumber());
		cityFld.setText(o.getAddress().getCity());
		stateFld.setText(o.getAddress().getState());
		zipFld.setText(o.getAddress().getZip());
		loginFld.setText(o.getLogin());
		passwordFld.setText(o.getPassword());
		
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
			subBox.getChildren().clear();
			subBox.getChildren().add(saveBtn);
			
		});
		
		saveBtn.setOnAction(e->{
			String fName = fNameFld.getText();
			try {
				TextFieldCheck.checkfName(fName);
			} catch (Exception e2) {
				return;
			}
			String lName = lNameFld.getText();
			try {
				TextFieldCheck.checklName(lName);
			} catch (Exception e2) {
				return;
			}
			String phone = phoneFld.getText();
			try {
				TextFieldCheck.checkPhone(phone);
			} catch (Exception e2) {
				return;
			}
			String stName = stNameFld.getText();
			try {
				TextFieldCheck.checkSName(stName);
			} catch (Exception e3) {
				return;
			}
			String stNum = stNumberFld.getText();
			try {
				TextFieldCheck.checkSNumber(stNum);
			} catch (Exception e3) {
				return;
			}
			String city = cityFld.getText();
			try {
				TextFieldCheck.checkCity(city);
			} catch (Exception e2) {
				return;
			}
			String state = stateFld.getText();
			String zip = zipFld.getText();
			try {
				TextFieldCheck.checkZip(zip);
			} catch (Exception e2) {
				return;
			}
			Address a = new Address(stName, stNum, city, state, zip);
			
			String login = loginFld.getText();
			try {
				TextFieldCheck.checkLoginOwnerInfo(pBag,login, o);
			} catch (Exception e2) {
				return;
			}
			String password = passwordFld.getText();
			try {
				TextFieldCheck.checkPassword(password);
			} catch (Exception e2) {
				return;
			}
			o.setAddress(a);
			o.setfName(fName);
			o.setlName(lName);
			o.setPhone(phone);
			o.setLogin(login);
			o.setPassword(password);
			
			pBag.save();
			new InfoClass();
		});
		
		
		mPane.getChildren().addAll(pInfoTxt, gPane, addressTxt, gPane2, accountTxt, gPane3, subBox);
		
		
		
		
	}
	public TextField getPasswordFld() {
		return passwordFld;
	}
	public Label getPasswordLbl() {
		return passwordLbl;
	}
	public VBox getPane(){
		return mPane;
	}
	
	public TextField getfNameFld() {
		return fNameFld;
	}
	public void setfNameFld(String s) {
		fNameFld.setText(s);
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
	public TextField getLoginFld() {
		return loginFld;
	}
	public void setLoginFld(TextField loginFld) {
		this.loginFld = loginFld;
	}
	public TextField getIdFld() {
		return passwordFld;
	}
	public void setIdFld(TextField idFld) {
		this.passwordFld = idFld;
	}

}
