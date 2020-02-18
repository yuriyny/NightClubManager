package view;

import controller.OwnerLoginListener;
import controller.OwnerRegisterEvent;
import controller.OwnerRegisterListener;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Address;
import model.Owner;
import model.PeopleBag;
import model.PeopleBagV2;


public class NewOwnerWindow {
	private PeopleBagV2 pBag;
	private Stage stage;
	private Scene scene;
//	private PeopleBag peopleBag;
	private VBox owPane;
//	private HBox buttonPane;

	private TextField fNameFld;
	private TextField lNameFld;
	private TextField idFld;
	private TextField phoneFld;

	private TextField nameFld;
	private TextField numberFld;
	private TextField cityFld;
	private ComboBox<String> stateBox;
	private TextField zipFld;
	
	// club info

	private TextField clNameFld;
	private TextField clNumberFld;
	private TextField clCityFld;
	private ComboBox<String> clStateBox;
	private TextField clZipFld;
	
	// Account Info
	
	private TextField loginFld;
	private TextField passwordFld;
	private TextField repasswordFld;
	private HBox accPane;

	private Button registerBtn;
	
//	private OwnerLoginListener listener;
	private Address address;
	private Owner owner;

	public NewOwnerWindow(OwnerLoginListener listener) {
		//this.pBag = pBag;
//		pBag.load();
		Label fNameLbl = new Label("First Name:");
		Label lNameLbl = new Label("Last Name:");
		Label idLbl = new Label("ID:");
		Label phoneLbl = new Label("Phone number:");

		Text addressText = new Text("Home address:");
		Text clubAddressText = new Text("-------------Club Info:--------------");
		Text accountText = new Text("Account Info:");

		fNameFld = new TextField();
		lNameFld = new TextField();
		idFld = new TextField();
		idFld.setEditable(false);
		phoneFld = new TextField();
		nameFld = new TextField();
		nameFld.setPromptText("Street Name");
		numberFld = new TextField();
		numberFld.setPromptText("Street Number");
		cityFld = new TextField();
		cityFld.setPromptText("City");
		stateBox = new ComboBox<String>();
		stateBox.getItems().addAll("AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID",
				"IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH",
				"NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA",
				"WI", "WV", "WY");
		stateBox.setPromptText("State");
		stateBox.setMinSize(100, 20);
		zipFld = new TextField();
		zipFld.setPromptText("ZIP Code");
		
		// club info 
		clNameFld = new TextField();
		clNameFld.setPromptText("Street Name");
		clNumberFld = new TextField();
		clNumberFld.setPromptText("Street Number");
		clCityFld = new TextField();
		clCityFld.setPromptText("City");
		clStateBox = new ComboBox<String>();
		clStateBox.getItems().addAll("AK", "AL", "AR", "AZ", "CA", "CO", "CT", "DC", "DE", "FL", "GA", "HI", "IA", "ID",
				"IL", "IN", "KS", "KY", "LA", "MA", "MD", "ME", "MI", "MN", "MO", "MS", "MT", "NC", "ND", "NE", "NH",
				"NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VA", "VT", "WA",
				"WI", "WV", "WY");
		clStateBox.setPromptText("State");
		clStateBox.setMinSize(100, 20);
		clZipFld = new TextField();
		clZipFld.setPromptText("ZIP Code");
		// Account Info
		accPane = new HBox(10);
		accPane.setAlignment(Pos.CENTER);
		loginFld = new TextField();
		loginFld.setPromptText("Login");
		passwordFld = new TextField();
		passwordFld.setPromptText("Password");
		accPane.getChildren().addAll(loginFld,passwordFld);

		/////////////////////////////////////////////////////////////////

		// Pane section

		////////////////////////////////////////////////////////////////
		owPane = new VBox(10);
		Insets insets = new Insets(10, 10, 10, 10);
		GridPane owNamePane = new GridPane();
		owNamePane.setAlignment(Pos.CENTER);
		owNamePane.setPadding(insets);
		owNamePane.setHgap(10);
		HBox owAddressPane = new HBox(10);
		owAddressPane.setAlignment(Pos.CENTER);
		owAddressPane.setPadding(insets);
		
		HBox clAddressPane = new HBox(10);
		clAddressPane.setAlignment(Pos.CENTER);
		clAddressPane.setPadding(insets);
		GridPane clRecordsPane1 = new GridPane();
		clRecordsPane1.setAlignment(Pos.CENTER);
		clRecordsPane1.setPadding(insets);
		clRecordsPane1.setHgap(10);
		GridPane clRecordsPane2 = new GridPane();
		clRecordsPane2.setAlignment(Pos.CENTER);
		clRecordsPane2.setPadding(insets);
		clRecordsPane2.setHgap(10);

		// Personal Info Fields
		owNamePane.add(fNameLbl, 0, 0);
		owNamePane.add(lNameLbl, 1, 0);
		owNamePane.add(phoneLbl, 2, 0);
		owNamePane.add(idLbl, 3, 0);
		owNamePane.add(fNameFld, 0, 1);
		owNamePane.add(lNameFld, 1, 1);
		owNamePane.add(phoneFld, 2, 1);
		owNamePane.add(idFld, 3, 1);

		// Address Fields
		owAddressPane.getChildren().addAll(nameFld, numberFld, cityFld, stateBox, zipFld);
		clAddressPane.getChildren().addAll(clNameFld, clNumberFld, clCityFld, clStateBox, clZipFld);
		
		// button
		registerBtn = new Button("Register");
		
		registerBtn.setOnAction(e->{
			String fName = fNameFld.getText();
			String lName = lNameFld.getText();
			String phone = phoneFld.getText();
			String street = nameFld.getText();
			String stNumber = numberFld.getText();
			String town = cityFld.getText();
			String state = stateBox.getValue();
			String zip = zipFld.getText();
//			String clSreet = nameFld.getText();
//			String clNumber = numberFld.getText();
//			String clTown = cityFld.getText();
//			String clState = stateBox.getValue();
//			String clZip = zipFld.getText();
			String login = loginFld.getText();
			String password = passwordFld.getText();
			
			address = new Address(street, stNumber, town, state, zip);
			
			owner = new Owner(fName,lName, phone, address, login, password,null, null);
			//System.out.println(owner);
			
			
			OwnerRegisterEvent ev = new OwnerRegisterEvent(this, owner, address);
			if(listener != null){
				listener.clicked2(ev);
				
				
			}
			
//			pBag.add(owner);
//			pBag.save();
			
			//pBag.load();
		
		});
		//OwnerController oc = new OwnerController(this);

		// VBox

		owPane.getChildren().addAll(new Text("Personal Information:"), owNamePane, addressText, owAddressPane,clubAddressText, clAddressPane, 
				accountText, accPane, registerBtn);
		owPane.setAlignment(Pos.TOP_CENTER);

		stage = new Stage();
		stage.setScene(new Scene(owPane, 700, 400));
		stage.show();
	}
	
//	public void setOwnerEventListener(OwnerRegisterListener listener){
//		this.listener = listener;
//	}
	
	public Address getAddress(){ 
		return address;
	}
	public Owner getOwner(){
		return owner;
	}
	
	

}
