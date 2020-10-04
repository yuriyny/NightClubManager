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
import model.EventBag;
import model.Owner;
import model.PeopleBag;
import model.TextFieldCheck;

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
	
	
	private HBox hPane;
	
	public NewClubInfo(PeopleBag pBag, Owner o){
		titleTxt = new Text("Please Add New Club Information Here");
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
			try {
				TextFieldCheck.checkName(name);
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
			String phone = phoneFld.getText();
			try {
				TextFieldCheck.checkPhone(phone);
			} catch (Exception e2) {
				return;
			}
			String email = emailFld.getText();
			try {
				TextFieldCheck.checkEmail(email);
			} catch (Exception e2) {
				return;
			}
			
			Address address = new Address(stName, stNumber, city, state, zip);
			EventBag eb = new EventBag();
			Club club = new Club(name, address, phone, email, eb);
			o.setClub(club);
			pBag.change(o.getId(), o);
			pBag.save();
			new InfoClass();
		});
		
		
	}
	
	public VBox getPane(){
		return vPane;
	}
	

}
