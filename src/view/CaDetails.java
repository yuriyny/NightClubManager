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
import model.Cashier;
import model.Manager;
import model.PeopleBag;

public class CaDetails {
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
//	private TextField loginFld;
//	private TextField passwordFld;
	
	private Label salaryLbl;
	private TextField salaryFld;
	
	
	private Button saveBtn;
	private Button editBtn;
	private HBox btnPane;
	
	
	public CaDetails(PeopleBag pBag, Manager m, Cashier ca){
		Insets insets = new Insets(10,10,10,50);
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
		
		fNameFld.setEditable(false);
		lNameFld.setEditable(false);
		phoneFld.setEditable(false);
		stNameFld.setEditable(false);
		stNumberFld.setEditable(false);
		cityFld.setEditable(false);
		stateFld.setEditable(false);
		zipFld.setEditable(false);
		salaryFld.setEditable(false);
		saveBtn = new Button("Save");
		
		btnPane = new HBox();
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
//		gPane3.add(passwordLbl, 0, 1);
//		gPane3.add(passwordFld, 1, 1);
		fNameFld.setText(ca.getfName());
		lNameFld.setText(ca.getlName());
		phoneFld.setText(ca.getPhone());
		stNameFld.setText(ca.getAddress().getStName());
		stNumberFld.setText(ca.getAddress().getStNumber());
		cityFld.setText(ca.getAddress().getCity());
		stateFld.setText(ca.getAddress().getState());
		zipFld.setText(ca.getAddress().getZip());
		salaryFld.setText(ca.getSalary());
		
		
		
		
		editBtn = new Button("Edit");
		btnPane.getChildren().add(editBtn);
		editBtn.setOnAction(e->{
			fNameFld.setEditable(true);
			lNameFld.setEditable(true);
			phoneFld.setEditable(true);
			stNameFld.setEditable(true);
			stNumberFld.setEditable(true);
			cityFld.setEditable(true);
			stateFld.setEditable(true);
			zipFld.setEditable(true);
			salaryFld.setEditable(true);
			btnPane.getChildren().remove(editBtn);
			btnPane.getChildren().add(saveBtn);
			
		});
		
		saveBtn.setOnAction(e->{
			String fname = fNameFld.getText();
			String lname = lNameFld.getText();
			String phone = phoneFld.getText();
			String stname = stNameFld.getText();
			String stnumber = stNumberFld.getText();
			String city = cityFld.getText();
			String state = stateFld.getText();
			String zip = zipFld.getText();
			Address a = new Address(stname,stnumber,city,state,zip);
			String salary = salaryFld.getText();
			ca.setfName(fname);
			ca.setlName(lname);
			ca.setPhone(phone);
			ca.setAddress(a);
			ca.setSalary(salary);
			pBag.save();
			
		});
		
		
		
		
		mPane.getChildren().addAll(pInfoTxt, gPane, addressTxt, gPane2, accountTxt, gPane3, btnPane);
	}
	
	public VBox getPane(){
		return mPane;
	}

}
