package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Bartender;
import model.Owner;

public class BartenderInfoBox {
	private Text infoTxt;
	private ComboBox<String> bartenderBox;
	
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
	private Label salaryLbl;
	
	private TextField fNameFld;
	private TextField lNameFld;
	private TextField phoneFld;
	private TextField stNameFld;
	private TextField stNumberFld;
	private TextField cityFld;
	private TextField stateFld;
	private TextField zipFld;
	
	private TextField salaryFld;
	
	
	private VBox rootPane;
	private VBox subrootPane;
	
	private Bartender bt;
	
	public BartenderInfoBox(Owner o){
		rootPane = new VBox(10);
		rootPane.setAlignment(Pos.CENTER);
		subrootPane = new VBox(10);
		subrootPane.setAlignment(Pos.CENTER);
		infoTxt = new Text("Select a Bartender For Details");
		
		
		
		bartenderBox = new ComboBox<String>();
		for(int i = 0; i < o.getpBag().getSize(); i++){
			for(int j = 0; j < o.getpBag().getManagers()[i].getEmployees().getBartenders().length; j++){
				bartenderBox.getItems().add(o.getpBag().getManagers()[i].getEmployees().getBartenders()[j].getfName() + 
						" " + o.getpBag().getManagers()[i].getEmployees().getBartenders()[j].getlName() + " " + 
						o.getpBag().getManagers()[i].getEmployees().getBartenders()[j].getId());
			}
		}
		
		
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
		
		bartenderBox.setOnAction(e->{
			String arr[] = bartenderBox.getValue().split(" ");
			for(int i = 0; i < o.getpBag().getSize(); i++){
				for(int j = 0; j < o.getpBag().getManagers()[i].getEmployees().getSize(); j++){
					if(o.getpBag().getManagers()[i].getEmployees().findPerson(arr[2]) != null){
						bt = (Bartender) o.getpBag().getManagers()[i].getEmployees().findPerson(arr[2]);
						//System.out.println(bt);
						addPane(bt);
						break;
					}
				}
			}
			
		});
		
		rootPane.getChildren().addAll(infoTxt, bartenderBox, subrootPane);
		
	}
	
	public VBox getPane(){
		return rootPane;
	}
	
	private void addPane(Bartender bt){
		subrootPane.getChildren().clear();
		fNameFld.setText( bt.getfName());
		lNameFld.setText(bt.getlName());
		phoneFld.setText(bt.getPhone());
		stNameFld.setText(bt.getAddress().getStName());
		stNumberFld.setText(bt.getAddress().getStNumber());
		cityFld.setText(bt.getAddress().getCity());
		stateFld.setText(bt.getAddress().getState());
		zipFld.setText(bt.getAddress().getZip());
		salaryFld.setText(bt.getSalary());
		subrootPane.getChildren().addAll(pInfoTxt,gPane, addressTxt, gPane2, accountTxt, gPane3);
		
	}

}
