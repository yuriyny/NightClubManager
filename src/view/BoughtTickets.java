package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Owner;

public class BoughtTickets {
	
	private Text infoTxt;
	private ComboBox<String> eventBox;
	private VBox mPane;
	
	
/////////////////////////////////////
	private GridPane gPane;
	private Label enameLbl;
	private TextField enameFld;
	private Label ticketBoughtLbl;
	private TextField ticketBoughtFld;
	private Label wineBoughtLbl;
	private TextField tableBoughtFld;
	private Label tableBoughtLbl;
	private TextField wineBoughtFld;
	private Label chamBoughtLbl;
	private TextField chamBoughtFld;
	private Label vodkaBoughtLbl;
	private TextField vodkaBoughtFld;
	private Label sodaBoughtLbl;
	private TextField sodaBoughtFld;
	private Label earnedOnTicketsLbl;
	private TextField earnedOnTicketsFld;
	
	private GridPane subPane;
	private VBox subVbox;
	
	private VBox sPane;
	
	public BoughtTickets(Owner o){
		sPane = new VBox(10);
		sPane.setAlignment(Pos.CENTER);
		infoTxt = new Text("Choose Event For Details");
		
		eventBox = new ComboBox<String>();
		
		
		for(int i = 0; i < o.getClub().geteBag().getSize(); i ++){
			eventBox.getItems().add(o.getClub().geteBag().getEvent(i).getName());
		}
		mPane = new VBox(10);
		
		mPane.getChildren().addAll(infoTxt, eventBox, sPane);
		mPane.setAlignment(Pos.CENTER);
		/////////action part
		eventBox.setOnAction(e->{
			sPane.getChildren().clear();
			
			enameFld.setText(o.getClub().geteBag().findByName(eventBox.getValue()).getName());
			//number of customers
			//ticketBoughtFld.setText(Integer.toString((o.getClub().geteBag().findByName(eventBox.getValue()).getCustumers().getSize())));
			ticketBoughtFld.setText(Integer.toString((o.getClub().geteBag().findByName(eventBox.getValue()).getTicketb().getBought())));
			tableBoughtFld.setText(Integer.toString((o.getClub().geteBag().findByName(eventBox.getValue()).getTb().getBought())));
			wineBoughtFld.setText(Integer.toString((o.getClub().geteBag().findByName(eventBox.getValue()).getWb().getBought())));
			chamBoughtFld.setText(Integer.toString((o.getClub().geteBag().findByName(eventBox.getValue()).getCb().getBought())));
			vodkaBoughtFld.setText(Integer.toString((o.getClub().geteBag().findByName(eventBox.getValue()).getVb().getBought())));
			sodaBoughtFld.setText(Integer.toString((o.getClub().geteBag().findByName(eventBox.getValue()).getSb().getBought())));
			
			//Total Here
			double total = 0;
			for(int i = 0; i < o.getClub().geteBag().findByName(eventBox.getValue()).getCustumers().getSize(); i++){
				for(int j = 0; j < o.getClub().geteBag().findByName(eventBox.getValue()).getCustumers().getCustumerAt()[i].getOb().getSize(); j++){
					 total = total + o.getClub().geteBag().findByName(eventBox.getValue()).getCustumers().getCustumerAt()[i].getOb().getOrder(j).getTotalPrice();
					System.out.println(o.getClub().geteBag().findByName(eventBox.getValue()).getCustumers().getCustumerAt()[i].getOb().getOrder(j).getTotalPrice());
				}
			}
			//System.out.println(o.getClub().geteBag().findByName(eventBox.getValue()).getCustumers().getSize());
			
			
			earnedOnTicketsFld.setText(Double.toString(total));
			
			
			sPane.getChildren().add(subPane);
			
			
			
		});
		enameLbl = new Label("Event Name:");
		enameFld = new TextField();
		
		ticketBoughtLbl = new Label("Number Of bought Tickets:");
		ticketBoughtFld = new TextField();
		
		tableBoughtLbl = new Label("Number Of Tables Reserved:");
		tableBoughtFld = new TextField();
		
		wineBoughtLbl = new Label("Number Of Wine Purchased:");
		wineBoughtFld = new TextField();
		chamBoughtLbl = new Label("Number Of Champagne Purchased:");
		chamBoughtFld = new TextField();
		vodkaBoughtLbl = new Label("Number Of Vodka Purchased:");
		vodkaBoughtFld = new TextField();
		sodaBoughtLbl = new Label("Number Of Soda Purchased:");
		sodaBoughtFld = new TextField();
		
		
		earnedOnTicketsLbl = new Label("Money Earned ($):");
		earnedOnTicketsFld = new TextField();
		subPane = new GridPane();
		subPane.setAlignment(Pos.CENTER);
		subVbox = new VBox(10);
		subVbox.setAlignment(Pos.CENTER);
		
		subPane.add(enameLbl, 0, 0);
		subPane.add(enameFld, 1, 0);
		subPane.add(ticketBoughtLbl, 0, 1);
		subPane.add(ticketBoughtFld, 1, 1);
		subPane.add(tableBoughtLbl, 0, 2);
		subPane.add(tableBoughtFld, 1, 2);
		subPane.add(wineBoughtLbl, 0, 3);
		subPane.add(wineBoughtFld, 1, 3);
		subPane.add(chamBoughtLbl, 0, 4);
		subPane.add(chamBoughtFld, 1, 4);
		subPane.add(vodkaBoughtLbl, 0, 5);
		subPane.add(vodkaBoughtFld, 1, 5);
		subPane.add(sodaBoughtLbl, 0, 6);
		subPane.add(sodaBoughtFld, 1, 6);
		
		subPane.add(earnedOnTicketsLbl, 0, 7);
		subPane.add(earnedOnTicketsFld, 1, 7);
		
		subVbox.getChildren().add(subPane);
		mPane.setPadding(new Insets(15,15,15,15));
		
		
		
	}
	
	public VBox getPane(){
		return mPane;
	}

}
