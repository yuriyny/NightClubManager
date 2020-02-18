package view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

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
	
	public OwnerClubPane(){
		titleTxt = new Text("Club Information");
		gPane = new GridPane();
		
		vPane = new VBox(30);
		hPane = new HBox(20);
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
		
		phoneFld = new TextField();
		emailFld = new TextField();
		
		
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
		
		vPane.getChildren().addAll(titleTxt, hPane, gPane);
		
		
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
