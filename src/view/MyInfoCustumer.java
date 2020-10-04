package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Address;
import model.Custumer;
import model.PeopleBag;
import model.TextFieldCheck;

public class MyInfoCustumer {
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

	private VBox btnBox;

	public MyInfoCustumer(PeopleBag pBag, Custumer c) {
		Insets insets = new Insets(10, 10, 10, 50);
		mPane = new VBox(10);
		mPane.setAlignment(Pos.CENTER);
		mPane.setPadding(insets);
		gPane = new GridPane();
		gPane.setVgap(5);
		gPane.setAlignment(Pos.CENTER);
		gPane2 = new GridPane();
		gPane2.setVgap(5);
		gPane2.setAlignment(Pos.CENTER);
		gPane3 = new GridPane();
		gPane3.setVgap(5);
		gPane3.setAlignment(Pos.CENTER);
		btnBox = new VBox();
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
		fNameFld.setEditable(false);
		lNameFld = new TextField();
		lNameFld.setEditable(false);
		phoneFld = new TextField();
		phoneFld.setEditable(false);
		stNameFld = new TextField();
		stNameFld.setEditable(false);
		stNumberFld = new TextField();
		stNumberFld.setEditable(false);
		cityFld = new TextField();
		cityFld.setEditable(false);
		stateFld = new TextField();
		stateFld.setEditable(false);
		zipFld = new TextField();
		zipFld.setEditable(false);
		loginFld = new TextField();
		loginFld.setEditable(false);
		passwordFld = new TextField();
		passwordFld.setEditable(false);
		saveBtn = new Button("Save");
		// Pane for Info
		gPane.add(fNameLbl, 0, 0);
		gPane.add(fNameFld, 1, 0);
		gPane.add(lNameLbl, 0, 1);
		gPane.add(lNameFld, 1, 1);
		gPane.add(phoneLbl, 0, 2);
		gPane.add(phoneFld, 1, 2);
		// Pane for address
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
		// Pane for account
		gPane3.add(loginLbl, 0, 1);
		gPane3.add(loginFld, 1, 1);
		gPane3.add(passwordLbl, 0, 2);
		gPane3.add(passwordFld, 1, 2);

		editBtn = new Button("Edit");
		btnBox.getChildren().add(editBtn);
		btnBox.setAlignment(Pos.CENTER);
		editBtn.setOnAction(e -> {
			btnBox.getChildren().clear();
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
			btnBox.getChildren().add(saveBtn);

		});

		fNameFld.setText(c.getfName());
		lNameFld.setText(c.getlName());
		phoneFld.setText(c.getPhone());
		stNameFld.setText(c.getAddress().getStName());
		stNumberFld.setText(c.getAddress().getStNumber());
		cityFld.setText(c.getAddress().getCity());
		stateFld.setText(c.getAddress().getState());
		zipFld.setText(c.getAddress().getZip());
		loginFld.setText(c.getLogin());
		passwordFld.setText(c.getPassword());

		saveBtn.setOnAction(e -> {
			System.out.println("BOOOOOOOOOOOOOOO");
			String fname = fNameFld.getText();
			try {
				TextFieldCheck.checkfName(fname);
			} catch (Exception e2) {
				return;
			}
			String lname = lNameFld.getText();
			try {
				TextFieldCheck.checklName(lname);
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
			String stNumber = stNumberFld.getText();
			try {
				TextFieldCheck.checkSNumber(stNumber);
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
			String loginz = loginFld.getText();
//			System.out.println(loginz);
			try {
				TextFieldCheck.checkLoginCusInfo(pBag,loginz, c);
			} catch (Exception e2) {
				return;
			}
			String password = passwordFld.getText();
			try {
				TextFieldCheck.checkPassword(password);
			} catch (Exception e2) {
				return;
			}
			Address a = new Address(stName, stNumber, city, state, zip);
			c.setfName(fname);
			c.setlName(lname);
			c.setPhone(phone);
			c.setAddress(a);
			c.setLogin(loginz);
			c.setPassword(password);
			
			pBag.save();
		});

		mPane.getChildren().addAll(pInfoTxt, gPane, addressTxt, gPane2, accountTxt, gPane3, btnBox);
	}
	
	public VBox getPane(){
		return mPane;
	}

}
