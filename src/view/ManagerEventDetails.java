package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.ClubEvent;

public class ManagerEventDetails {
	
	private VBox mPane;
	private GridPane gPane;
	private Label nameLbl;
	private Label managerLbl;
	private Label dateLbl;
	private Label timeLbl;
	private Label tableLbl;
	private Label wineLbl;
	private Label chamLbl;
	private Label sodaLbl;
	private Label vodkaLbl;
	private Label priceLbl;
	
	private TextField nameFld;
	private TextField managerFld;
	private TextField dateFld;
	private TextField timeFld;
	private TextField tableFld;
	private TextField wineFld;
	private TextField chamFld;
	private TextField sodaFld;
	private TextField vodkaFld;
	
	private TextField priceFld;
	//private Button editBtn;
	
	//private HBox buttonPane;
	
	
	public ManagerEventDetails(ClubEvent e){
		//buttonPane = new HBox(10);
		mPane = new VBox(10);
		mPane.setAlignment(Pos.CENTER);
		gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		nameLbl = new Label("Event Name:");
		managerLbl = new Label("Manager:");
		dateLbl = new Label("Date:");
		timeLbl = new Label("Time:");
		tableLbl = new Label("Table Price:");
		wineLbl = new Label("Wine Price:");
		chamLbl = new Label("Champagne Price:");
		sodaLbl = new Label("Soda Price:");
		vodkaLbl = new Label("Vodka Price:");
		priceLbl = new Label("Price:");
		
		
		nameFld = new TextField();
		managerFld = new TextField();
		dateFld = new TextField();
		timeFld = new TextField();
		tableFld = new TextField();
		wineFld = new TextField();
		chamFld = new TextField();
		sodaFld = new TextField();
		vodkaFld = new TextField();
		
		priceFld = new TextField();
		
		//editBtn = new Button("Change Event Details");
		//buttonPane.getChildren().add(editBtn);
		gPane.add(nameLbl, 0, 0);
		gPane.add(nameFld, 1, 0);
		gPane.add(managerLbl, 0, 1);
		gPane.add(managerFld, 1, 1);
		gPane.add(dateLbl, 0, 2);
		gPane.add(dateFld, 1, 2);
		gPane.add(timeLbl, 0, 3);
		gPane.add(timeFld, 1, 3);
		gPane.add(tableLbl, 0, 4);
		gPane.add(tableFld, 1, 4);
		gPane.add(wineLbl, 0, 5);
		gPane.add(wineFld, 1, 5);
		gPane.add(chamLbl, 0, 6);
		gPane.add(chamFld, 1, 6);
		gPane.add(sodaLbl, 0, 7);
		gPane.add(sodaFld, 1, 7);
		gPane.add(vodkaLbl, 0, 8);
		gPane.add(vodkaFld, 1, 8);
		
		gPane.add(priceLbl, 0, 9);
		gPane.add(priceFld, 1, 9);
		
		nameFld.setText(e.getName());
		managerFld.setText(e.getManager().getfName()+ " "+ e.getManager().getlName());
		dateFld.setText(e.getDate());
		timeFld.setText(e.getTime());
		tableFld.setText(e.getTb().getPrice());
		wineFld.setText(e.getWb().getPrice());
		chamFld.setText(e.getCb().getPrice());
		sodaFld.setText(e.getSb().getPrice());
		vodkaFld.setText(e.getVb().getPrice());
		priceFld.setText(e.getTicketPrice());
		
		
		mPane.getChildren().addAll(gPane);
		
	}
	
	public VBox getPane(){
		return mPane;
	}
	
}
