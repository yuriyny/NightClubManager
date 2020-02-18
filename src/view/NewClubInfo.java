package view;

import controller.ClubListener;
import controller.ClubRegisterEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Address;
import model.Club;

public class NewClubInfo {
	private GridPane gPane;
	private Text titleTxt;
	private Button addBtn;
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
	
	private ClubListener listener;
	
	private HBox hPane;
	
	public NewClubInfo(){
		titleTxt = new Text("Please Add New Club Information Here");
		gPane = new GridPane();
		vPane = new VBox(30);
		hPane = new HBox(20);
		nameLbl = new Label("Club Name:");
		stNameLbl = new Label("Street Name:");
		stNumberLbl = new Label("Street Number:");
		cityLbl = new Label("City:");
		stateLbl = new Label("State:");
		zipLbl = new Label("ZIP Code:");
		phoneLbl = new Label("Phene:");
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
		addBtn = new Button("Add");
		vPane.getChildren().addAll(titleTxt, hPane, gPane, addBtn);
		
		addBtn.setOnAction(e->{
			String name = nameFld.getText();
			String stName = stNameFld.getText();
			String stNumber = stNumberFld.getText();
			String city = cityFld.getText(); 
			String state = stateFld.getText();
			String zip = zipFld.getText();
			String phone = phoneFld.getText();
			String email = emailFld.getText();
			Address address = new Address(stName, stNumber, city, state, zip);
			Club club = new Club(name, address, phone, email);
			ClubRegisterEvent ev = new ClubRegisterEvent(this, club);
			if(listener != null){
				listener.click(ev);
				System.out.println("sdfgefghfdhfd");
			}
			
		});
		System.out.println("Pressed");
		
	}
	
	public VBox getPane(){
		return vPane;
	}
	
	public void setClubListener(ClubListener listener){
		this.listener = listener;
	}

}
