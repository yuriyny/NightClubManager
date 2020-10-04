package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.ChampagneBag;
import model.ClubEvent;
import model.EventBag;
import model.Manager;
import model.Owner;
import model.PeopleBag;
import model.SodaBag;
import model.TableBag;
import model.TextFieldCheck;
import model.TicketBag;
import model.VodkaBag;
import model.WineBag;

public class NewEventWindow {
	private VBox mPane;
	private GridPane gPane;
	private DatePicker checkInDatePicker;
	private Label eName;
	private Label managerLbl;
	private ComboBox<String> cBox;
	private Label timeLbl;
	private ComboBox<String> timeBox;
	private Label ticketPriceLbl;
	private Label dateLbl;
	
	private TextField nameFld;
	private TextField ticketFld;
	private Label ticketNumLbl;
	private TextField ticketNumFld;
	
	private Button addBtn;
	
	//additional
	
	private Label tableNumLbl;
	private Label tablePriceLbl;
	private TextField tableNumFld;
	private TextField tablePriceFld;
	private Text inventoryTxt;
	private Text wineTxt;
	private Text chamTxt;
	private Text vodTxt;
	private Text sodaTxt;
	private Text waterTxt; 
	private Label numOfWineLbl;
	private Label numOfChamLbl;
	private Label numOfVodkaLbl;
	private Label numOfSodaLbl;
	private Label numOfWaterLbl;
	private TextField numOfWineFld;
	private TextField numOfChamFld;
	private TextField numOfVodkaFld;
	private TextField numOfSodaFld;
	private TextField numOfWaterFld;
	
	private Label priceWineLbl;
	private Label priceChamLbl;
	private Label priceVodkaLbl;
	private Label priceSodaLbl;
	private Label priceWaterLbl;
	private TextField priceWineFld;
	private TextField priceChamFld;
	private TextField priceVodkaFld;
	private TextField priceSodaFld;
	private TextField priceWaterFld;
	
	
	
	public NewEventWindow(EventBag eBag, Owner o, PeopleBag pBag){
		mPane = new VBox(20);
		mPane.setAlignment(Pos.CENTER);
		gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		checkInDatePicker = new DatePicker();
		eName = new Label("Event Name:");
		managerLbl = new Label("Manager For Event:");
		cBox = new ComboBox<String>();
		timeLbl = new Label("Event Time:");
		timeBox = new ComboBox<String>();
		timeBox.getItems().addAll("12:00 AM", "1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", "6:00 AM", "7:00 AM",
				"8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM",
				"8:00 PM", "9:00 PM", "10:00 PM", "11:00 PM");
		ticketPriceLbl = new Label("Ticket Price:");
		nameFld = new TextField();
		ticketFld = new TextField();
		dateLbl = new Label("Event Date:");
		addBtn = new Button("Create Event");
		//////////////////////////////////////////////
		ticketNumLbl = new Label("Ticket Number:");
		ticketNumFld = new TextField();
		tableNumLbl = new Label("Number of Tables:");
		tablePriceLbl = new Label("Unit Price:");
		tableNumFld = new TextField();
		tablePriceFld = new TextField();
		inventoryTxt = new Text("Inventory");
		wineTxt = new Text("Wine:");
		chamTxt = new Text("Champagne:");
		vodTxt = new Text("Vodka");
		sodaTxt = new Text("Soda");
		waterTxt = new Text("Water");
		numOfWineLbl = new Label("Number of Wine:");
		numOfChamLbl = new Label("Number of Champagne:");
		numOfVodkaLbl = new Label("Number of Vodka:");
		numOfSodaLbl = new Label("Number of Soda:");
		numOfWaterLbl = new Label("Number of Water:");
		numOfWineFld = new TextField();
		numOfChamFld = new TextField();
		numOfVodkaFld = new TextField();
		numOfSodaFld = new TextField();
		numOfWaterFld = new TextField();
		
		priceWineLbl = new Label("Unit Price:");
		priceChamLbl = new Label("Unit Price:");
		priceVodkaLbl = new Label("Unit Price:");
		priceSodaLbl = new Label("Unit Price:");
		priceWaterLbl = new Label("Unit Price:");
		priceWineFld = new TextField();
		priceChamFld = new TextField();
		priceVodkaFld = new TextField();
		priceSodaFld = new TextField();
		priceWaterFld = new TextField();
		
		
		////////////////////////////////////////
		
		
		gPane.add(eName, 0, 0);
		gPane.add(nameFld, 1, 0);
		gPane.add(managerLbl, 0, 1);
		gPane.add(cBox, 1, 1);
		gPane.add(dateLbl, 0, 2);
		gPane.add(checkInDatePicker, 1, 2);
		gPane.add(timeLbl, 0, 3);
		gPane.add(timeBox, 1, 3);
		gPane.add(tableNumLbl, 0, 4);
		gPane.add(tableNumFld, 1, 4);
		gPane.add(tablePriceLbl, 2, 4);
		gPane.add(tablePriceFld, 3, 4);
		gPane.add(inventoryTxt, 0, 5);
		gPane.add(numOfWineLbl, 0, 6);
		gPane.add(numOfWineFld, 1, 6);
		gPane.add(priceWineLbl, 2, 6);
		gPane.add(priceWineFld, 3, 6);
		gPane.add(numOfChamLbl, 0, 7);
		gPane.add(numOfChamFld, 1, 7);
		gPane.add(priceChamLbl, 2, 7);
		gPane.add(priceChamFld, 3, 7);
		gPane.add(numOfVodkaLbl, 0, 8);
		gPane.add(numOfVodkaFld, 1, 8);
		gPane.add(priceVodkaLbl, 2, 8);
		gPane.add(priceVodkaFld, 3, 8);
		gPane.add(numOfSodaLbl, 0, 9);
		gPane.add(numOfSodaFld, 1, 9);
		gPane.add(priceSodaLbl, 2, 9);
		gPane.add(priceSodaFld, 3, 9);
//		gPane.add(numOfWaterLbl, 0, 10);
//		gPane.add(numOfWaterFld, 1, 10);
//		gPane.add(priceWaterLbl, 2, 10);
//		gPane.add(priceWaterFld, 3, 10);
		
		
		gPane.add(ticketPriceLbl, 0, 11);
		gPane.add(ticketFld, 1, 11);
		gPane.add(ticketNumLbl, 2, 11);
		gPane.add(ticketNumFld, 3, 11);
		gPane.add(addBtn, 1, 12);
		
		
		for(int i = 0; i < o.getpBag().getManagers().length; i++){
			cBox.getItems().addAll(o.getpBag().getManagers()[i].getfName()+ " "+o.getpBag().getManagers()[i].getlName());
		}
		
		addBtn.setOnAction(e->{
			String name = nameFld.getText();
			try {
				TextFieldCheck.checkName(name);
			} catch (Exception e2) {
				return;
			}
			String[] temp = cBox.getValue().split(" ");
			Manager m = o.getpBag().findByName(temp[0], temp[1]);
			String date = checkInDatePicker.getValue().toString();
			try {
				TextFieldCheck.checkEmpty(date);
			} catch (Exception e2) {
				return;
			}
			String time = timeBox.getValue();
			try {
				TextFieldCheck.checkEmpty(time);
			} catch (Exception e2) {
				return;
			}
			String price = ticketFld.getText();
			try {
				TextFieldCheck.checkPrice(price);
			} catch (Exception e2) {
				return;
			}
//exceptions
			
			try {
				TextFieldCheck.checkDigit(tableNumFld.getText());
			} catch (Exception e2) {
				return;
			}
			try {
				TextFieldCheck.checkDigit(tablePriceFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(numOfWineFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(priceWineFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(numOfChamFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(priceChamFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(numOfVodkaFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(priceVodkaFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(priceSodaFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(numOfSodaFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(ticketNumFld.getText());
			} catch (Exception e2) {
				return;
			}try {
				TextFieldCheck.checkDigit(ticketFld.getText());
			} catch (Exception e2) {
				return;
			}
			
			
			
			PeopleBag custumers = new PeopleBag();
			//Table table = new Table(tablePriceFld.getText());
			TableBag tb = new TableBag(Integer.parseInt(tableNumFld.getText()), tablePriceFld.getText());
			WineBag wb = new WineBag(Integer.parseInt(numOfWineFld.getText()), priceWineFld.getText());
			ChampagneBag cb = new ChampagneBag(Integer.parseInt(numOfChamFld.getText()), priceChamFld.getText());
			VodkaBag vb = new VodkaBag(Integer.parseInt(numOfVodkaFld.getText()), priceVodkaFld.getText());
			SodaBag sb = new SodaBag(Integer.parseInt(numOfSodaFld.getText()), priceSodaFld.getText());
			TicketBag ticketb = new TicketBag(Integer.parseInt(ticketNumFld.getText()), ticketFld.getText());
			
			
			
			// bartender null
			// dj null
			ClubEvent eve = new ClubEvent(name, m, null, date, time, price, o, custumers, null, null, tb, wb,cb,vb,sb, ticketb, null, null, null);
			m.geteBag().add(eve);
			o.getClub().geteBag().add(eve);
			o.getClub().geteBag().save();// saving in order to see events in different file SAVES ALL WHAT OWNER HAS(EVENTS)
			
			pBag.change(o.getId(), o);
			pBag.save();
			new InfoClass();
			
			
			
		});
		
		mPane.getChildren().addAll(gPane);
		
	}
	
	public VBox getPane(){
		return mPane;
	}
	
	public void showStage(){
		Stage st = new Stage();
		st.setScene(new Scene(mPane, 1000,500));
		st.show();
	}
	
	
}
