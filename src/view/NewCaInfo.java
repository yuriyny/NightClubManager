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
import model.Cashier;
import model.EventBag;
import model.Manager;
import model.PeopleBag;
import model.TextFieldCheck;

public class NewCaInfo {
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
	
	private Label salaryLbl;
	private TextField salaryFld;
	
	
	private Button saveBtn;
	private Button editBtn;
	
	
	public NewCaInfo(PeopleBag pBag, Manager m){
		Insets insets = new Insets(10,10,10,50);
		mPane = new VBox(10);
		mPane.setPadding(insets);
		gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		gPane2 = new GridPane();
		gPane2.setAlignment(Pos.CENTER);
		gPane3 = new GridPane();
		gPane3.setAlignment(Pos.CENTER);
		pInfoTxt = new Text("Personal Info:");
		addressTxt = new Text("Home Address:");
		accountTxt = new Text("Pay Data:");
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
		
		salaryLbl = new Label("Pay Rate (per/hour)");
		salaryFld = new TextField();
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
		gPane3.add(salaryLbl, 0, 0);
		gPane3.add(salaryFld, 1, 0);
		
		saveBtn.setOnAction(e->{
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
			String stname = stNameFld.getText();
			try {
				TextFieldCheck.checkSName(stname);
			} catch (Exception e3) {
				return;
			}
			String stnumber = stNumberFld.getText();
			try {
				TextFieldCheck.checkSNumber(stnumber);
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
			Address a = new Address(stname,stnumber,city,state,zip);
			String salary = salaryFld.getText();
			try {
				TextFieldCheck.checkSalary(salary);
			} catch (Exception e2) {
				return;
			}
			EventBag eb = new EventBag();
			Cashier b = new Cashier(fname,lname,phone,a,null,null,salary,eb);//null for login/password
			m.getEmployees().add(b);
			pBag.add(b);
			pBag.save();
			new InfoClass();
			
		});
		
		
		
		
		mPane.getChildren().addAll(pInfoTxt, gPane, addressTxt, gPane2, accountTxt, gPane3, saveBtn);
	}
	
	public VBox getPane(){
		return mPane;
	}

}
