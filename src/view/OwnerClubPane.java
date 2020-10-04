package view;

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

public class OwnerClubPane {
	private Text titleTxt;
//	private ListView theList;
	private GridPane gPane;
	//private GridPane gPane2;
	private VBox vPane;
	private Label nameLbl;
	private Label stNameLbl;
	private Label stNumberLbl;
	private Label cityLbl;
	private Label stateLbl;
	private Label zipLbl;
	
	private Label phoneLbl;
	private Label emailLbl;
	
	private TextField nameFld;
	private TextField stNameFld;
	private TextField stNumberFld;
	private TextField cityFld;
	private TextField stateFld;
	private TextField zipFld;
	
	private TextField phoneFld;
	private TextField emailFld;
	
	private HBox hPane;
	private HBox buttonPane;
	private Button changeBtn;
	private Button saveBtn;
	
	public OwnerClubPane(PeopleBag pBag, Owner o){
		titleTxt = new Text("Club Information");
		gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		vPane = new VBox(30);
		vPane.setAlignment(Pos.CENTER);
		hPane = new HBox(20);
		hPane.setAlignment(Pos.CENTER);
		
		nameLbl = new Label("Club Name:");
		stNameLbl = new Label("Street Name:");
		stNumberLbl = new Label("Street Number:");
		cityLbl = new Label("City:");
		stateLbl = new Label("State:");
		zipLbl = new Label("ZIP Code:");
		phoneLbl = new Label("Phone:");
		emailLbl = new Label("Email:");
		
		nameFld = new TextField();
		stNameFld = new TextField();
		stNumberFld = new TextField();
		cityFld = new TextField();
		stateFld = new TextField();
		zipFld = new TextField();
		nameFld.setEditable(false);
		stNameFld.setEditable(false);
		stNumberFld.setEditable(false);
		cityFld.setEditable(false);
		stateFld.setEditable(false);
		zipFld.setEditable(false);
		
		phoneFld = new TextField();
		phoneFld.setEditable(false);
		emailFld = new TextField();
		emailFld.setEditable(false);
		
		hPane.getChildren().addAll(nameLbl, nameFld);
		
		gPane.add(stNameLbl, 0, 0);
		gPane.add(stNumberLbl, 0, 1);
		gPane.add(cityLbl, 0, 2);
		gPane.add(stateLbl, 0, 3);
		gPane.add(zipLbl, 0, 4);
		gPane.add(phoneLbl, 0, 5);
		gPane.add(emailLbl, 0, 6);
		
		gPane.add(stNameFld, 1, 0);
		gPane.add(stNumberFld, 1, 1);
		gPane.add(cityFld, 1, 2);
		gPane.add(stateFld, 1, 3);
		gPane.add(zipFld, 1, 4);
		gPane.add(phoneFld, 1, 5);
		gPane.add(emailFld, 1, 6);
		
		buttonPane = new HBox();
		buttonPane.setAlignment(Pos.CENTER);
		changeBtn = new Button("Change");
		saveBtn = new Button("Save Changes");
		buttonPane.getChildren().addAll(changeBtn);
		buttonPane.setAlignment(Pos.CENTER);
		changeBtn.setOnAction(e->{
			buttonPane.getChildren().remove(changeBtn);
			phoneFld.setEditable(true);
			emailFld.setEditable(true);
			nameFld.setEditable(true);
			stNameFld.setEditable(true);
			stNumberFld.setEditable(true);
			cityFld.setEditable(true);
			stateFld.setEditable(true);
			zipFld.setEditable(true);
			phoneFld.setEditable(true);
			emailFld.setEditable(true);
			buttonPane.getChildren().add(saveBtn);
		});
		saveBtn.setOnAction(e->{
			System.out.println("Save pressed");
			String name = nameFld.getText();
			String stName = stNameFld.getText();
			String stNumber = stNumberFld.getText();
			String city = cityFld.getText();
			String state = stateFld.getText();
			String zip = zipFld.getText();
			String phone = phoneFld.getText();
			String email = emailFld.getText();
			Address a = new Address(stName, stNumber, city, state,zip);
			Club c = new Club(name, a, phone, email, o.getClub().geteBag());
			o.setClub(c);
			pBag.change(o.getId(), o);
			pBag.save();
			new InfoClass();
			
		});
		
		vPane.getChildren().addAll(titleTxt, hPane, gPane, buttonPane);
		
		
	}
	
	
	public TextField getPhoneFld() {
		return phoneFld;
	}


	public void setPhoneFld(TextField phoneFld) {
		this.phoneFld = phoneFld;
	}


	public TextField getEmailFld() {
		return emailFld;
	}


	public void setEmailFld(TextField emailFld) {
		this.emailFld = emailFld;
	}


	public VBox getPane(){
		return vPane;
	}


	public TextField getNameFld() {
		return nameFld;
	}


	public void setNameFld(TextField nameFld) {
		this.nameFld = nameFld;
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
	
	
}
