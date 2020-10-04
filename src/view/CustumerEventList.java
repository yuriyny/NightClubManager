package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Custumer;
import model.EventBag;
import model.Order;
import model.OrderBag;
import model.PeopleBag;

public class CustumerEventList {
	private ComboBox<String> listBox;
	private Text infoTxt;
	private VBox mPane;
	private GridPane gpane;

	////////////////////////////////////////////////
	private Label nameLbl;
	private Label dateLbl;
	private Label timeLbl;
	private Label priceLbl;

	private TextField nameFld;
	private TextField dateFld;
	private TextField timeFld;
	private TextField priceFld;

	private HBox buttonPane;
	private VBox detailPane;
	///////////////////////////////////////////////////

	private Button buyBtn;
	/////////////////////////////////////////////////////
	private GridPane addPane;
	private Label tableLbl;
	private Label wineLbl;
	private Label chamLbl;
	private Label vodkaLbl;
	private Label sodaLbl;

	private TextField tableFld;
	private TextField wineFld;
	private TextField chamFld;
	private TextField vodkaFld;
	private TextField sodaFld;

	// quantity

	private Label qLabel;
	private Label qLabel1;
	private Label qLabel2;
	private Label qLabel3;
	private Label qLabel4;

	private ComboBox<String> qFld;
	private ComboBox<String> qFld1;
	private ComboBox<String> qFld2;
	private ComboBox<String> qFld3;
	private ComboBox<String> qFld4;

	private ComboBox<String> ticketCount;
	private Label tickNumLbl;
	private Text packTxt;

	private Label orderLbl;
	private TextField orderFld;
	private Button totalBtn;

	private HBox totalBox;

	private VBox forAddPane;

	public CustumerEventList(PeopleBag pBag, EventBag eBag, Custumer c) {
//		OrderBag oBag = new OrderBag();
//		oBag.load();
		c.getOb().load();
		forAddPane = new VBox(10);
		forAddPane.setAlignment(Pos.CENTER);
		gpane = new GridPane();
		gpane.setAlignment(Pos.CENTER);
		mPane = new VBox(10);
		mPane.setAlignment(Pos.CENTER);
		infoTxt = new Text("Select an Event For Details");
		listBox = new ComboBox<String>();
		for (int i = 0; i < eBag.getSize(); i++) {
			listBox.getItems().add(eBag.getEvent(i).getName());
		}

		///////////////////////////////////////////////////////////
		buttonPane = new HBox(10);
		buttonPane.setAlignment(Pos.CENTER);
		detailPane = new VBox(10);
		detailPane.setAlignment(Pos.CENTER);
		nameLbl = new Label("Event Name:");
		dateLbl = new Label("Event Time");
		timeLbl = new Label("Time:");
		priceLbl = new Label("Price:");
		totalBtn = new Button("Next");
		packTxt = new Text("Additional Packages:");
		nameFld = new TextField();
		dateFld = new TextField();
		timeFld = new TextField();
		priceFld = new TextField();

		orderLbl = new Label("Order Total");
		orderFld = new TextField();

		ticketCount = new ComboBox<String>();
		ticketCount.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		ticketCount.getSelectionModel().selectFirst();
		tickNumLbl = new Label("Quantity:");
		///////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////
		buyBtn = new Button("Buy");
		buyBtn.setAlignment(Pos.BASELINE_RIGHT);
		gpane.add(nameLbl, 0, 0);
		gpane.add(nameFld, 1, 0);
		gpane.add(dateLbl, 0, 1);
		gpane.add(dateFld, 1, 1);
		gpane.add(timeLbl, 0, 2);
		gpane.add(timeFld, 1, 2);
		gpane.add(priceLbl, 0, 3);
		gpane.add(priceFld, 1, 3);
		gpane.add(tickNumLbl, 2, 3);
		gpane.add(ticketCount, 3, 3);
		gpane.add(packTxt, 0, 5);

		totalBox = new HBox();
		totalBox.setAlignment(Pos.CENTER);

		////////////////////// TOTAL BTN///////////////////////////////////
		totalBtn.setOnAction(e -> {
			totalBox.getChildren().clear();
			String ename = eBag.findByName(nameFld.getText()).getName();
			int tickNum = Integer.parseInt(ticketCount.getValue());
			double ticketPrice = Double.parseDouble(priceFld.getText());
			double tablePrice = Double.parseDouble(tableFld.getText());
			int tableNum = Integer.parseInt(qFld.getValue());
			double winePrice = Double.parseDouble(wineFld.getText());
			int wineNum = Integer.parseInt(qFld1.getValue());
			double chamPrice = Double.parseDouble(chamFld.getText());
			int chamNum = Integer.parseInt(qFld2.getValue());
			double vodkaPrice = Double.parseDouble(vodkaFld.getText());
			int vodkaNum = Integer.parseInt(qFld3.getValue());
			double sodaPrice = Double.parseDouble(sodaFld.getText());
			int sodaNum = Integer.parseInt(qFld4.getValue());
			double totalPrice = (tickNum * ticketPrice) + (tableNum * tablePrice) + (winePrice * wineNum)
					+ (chamPrice * chamNum) + (vodkaPrice * vodkaNum) + (sodaPrice * sodaNum);
			orderFld.setText(Double.toString(totalPrice));
			totalBox.getChildren().addAll(orderLbl, orderFld, buyBtn);

		});

		///////////////////// BUY BTN///////////////////////
		buyBtn.setOnAction(e -> {

			////////// test
			String ename = eBag.findByName(nameFld.getText()).getName();
			int tickNum = Integer.parseInt(ticketCount.getValue());
			double ticketPrice = Double.parseDouble(priceFld.getText());
			double tablePrice = Double.parseDouble(tableFld.getText());
			int tableNum = Integer.parseInt(qFld.getValue());
			double winePrice = Double.parseDouble(wineFld.getText());
			int wineNum = Integer.parseInt(qFld1.getValue());
			double chamPrice = Double.parseDouble(chamFld.getText());
			int chamNum = Integer.parseInt(qFld2.getValue());
			double vodkaPrice = Double.parseDouble(vodkaFld.getText());
			int vodkaNum = Integer.parseInt(qFld3.getValue());
			double sodaPrice = Double.parseDouble(sodaFld.getText());
			int sodaNum = Integer.parseInt(qFld4.getValue());
			double totalPrice = (tickNum * ticketPrice) + (tableNum * tablePrice) + (winePrice * wineNum)
					+ (chamPrice * chamNum) + (vodkaPrice * vodkaNum) + (sodaPrice * sodaNum);
			String date = dateFld.getText();
			String time = timeFld.getText();

			c.getOb().addOrder(new Order(ename, tickNum, ticketPrice, tableNum, tablePrice, totalPrice, date, time,
					wineNum, winePrice, chamNum, chamPrice, vodkaNum, vodkaPrice, sodaNum, sodaPrice));
			c.getOb().save();
//			oBag.addOrder(new Order(ename, tickNum, ticketPrice, tableNum, tablePrice, totalPrice, date, time,
//					wineNum, winePrice, chamNum, chamPrice, vodkaNum, vodkaPrice, sodaNum, sodaPrice));
			///////////////////////////////// end of test
			if (eBag.findByName(nameFld.getText()).getCustumers().findPerson(c.getId()) != null) {
				eBag.findByName(nameFld.getText()).getCustumers().removeByID(c.getId());
			} else {
				eBag.findByName(nameFld.getText()).getCustumers().add(c);
			}
			if (eBag.findByName(nameFld.getText()).getOwner().getClub().geteBag().findByName(nameFld.getText())
					.getCustumers().findPerson(c.getId()) != null) {
				eBag.findByName(nameFld.getText()).getOwner().getClub().geteBag().findByName(nameFld.getText())
						.getCustumers().removeByID(c.getId());
			} else {
				eBag.findByName(nameFld.getText()).getOwner().getClub().geteBag().findByName(nameFld.getText())
						.getCustumers().add(c);
			}

			pBag.findCustumer(c.getId()).geteBag().add(eBag.findByName(nameFld.getText()));
			// adding custumer to the owner club

			if (pBag.findManager(eBag.findByName(nameFld.getText()).getManager().getId()).getOwner().getClub().geteBag()
					.findByName(nameFld.getText()).getCustumers().findCustumer(c.getId()) != null) {
				pBag.findManager(eBag.findByName(nameFld.getText()).getManager().getId()).getOwner().getClub().geteBag()
						.findByName(nameFld.getText()).getCustumers().removeByID(c.getId());
			}
			pBag.findManager(eBag.findByName(nameFld.getText()).getManager().getId()).getOwner().getClub().geteBag()
					.findByName(nameFld.getText()).getCustumers().add(c);
			// ticket

			for (int i = 0; i < Integer.parseInt(ticketCount.getValue()); i++) {
				pBag.findManager(eBag.findByName(nameFld.getText()).getManager().getId()).getOwner().getClub().geteBag()
						.findByName(nameFld.getText()).getTicketb().remove();
			}

			/// table
			for (int i = 0; i < Integer.parseInt(qFld.getValue()); i++) {
				pBag.findManager(eBag.findByName(nameFld.getText()).getManager().getId()).getOwner().getClub().geteBag()
						.findByName(nameFld.getText()).getTb().remove();
			}
			// wine
			for (int i = 0; i < Integer.parseInt(qFld1.getValue()); i++) {
				pBag.findManager(eBag.findByName(nameFld.getText()).getManager().getId()).getOwner().getClub().geteBag()
						.findByName(nameFld.getText()).getWb().remove();
			}
			// other drinks use for loop here for counting
			////////////////////
			////////////////////
			///////////////
			for (int i = 0; i < Integer.parseInt(qFld2.getValue()); i++) {
				pBag.findManager(eBag.findByName(nameFld.getText()).getManager().getId()).getOwner().getClub().geteBag()
						.findByName(nameFld.getText()).getCb().remove();
			}
			for (int i = 0; i < Integer.parseInt(qFld3.getValue()); i++) {
				pBag.findManager(eBag.findByName(nameFld.getText()).getManager().getId()).getOwner().getClub().geteBag()
						.findByName(nameFld.getText()).getVb().remove();
			}
			for (int i = 0; i < Integer.parseInt(qFld4.getValue()); i++) {
				pBag.findManager(eBag.findByName(nameFld.getText()).getManager().getId()).getOwner().getClub().geteBag()
						.findByName(nameFld.getText()).getSb().remove();
			}
			
			eBag.save();
			pBag.save();
			//oBag.save();

			new PurchaseInfo();

		});

		/////////////////////////// details

		addPane = new GridPane();
		addPane.setAlignment(Pos.CENTER);
		tableLbl = new Label("Table");
		wineLbl = new Label("Wine");
		chamLbl = new Label("Champagne");
		vodkaLbl = new Label("Vodka");
		sodaLbl = new Label("Soda");

		tableFld = new TextField();
		wineFld = new TextField();
		chamFld = new TextField();
		vodkaFld = new TextField();
		sodaFld = new TextField();

		qLabel = new Label("Quantity:");
		qLabel1 = new Label("Quantity:");
		qLabel2 = new Label("Quantity:");
		qLabel3 = new Label("Quantity:");
		qLabel4 = new Label("Quantity:");

		qFld = new ComboBox<String>();
		qFld1 = new ComboBox<String>();
		qFld2 = new ComboBox<String>();
		qFld3 = new ComboBox<String>();
		qFld4 = new ComboBox<String>();

		qFld.getItems().addAll("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		qFld1.getItems().addAll("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		qFld2.getItems().addAll("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		qFld3.getItems().addAll("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		qFld4.getItems().addAll("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		qFld.getSelectionModel().selectFirst();
		qFld1.getSelectionModel().selectFirst();
		qFld2.getSelectionModel().selectFirst();
		qFld3.getSelectionModel().selectFirst();
		qFld4.getSelectionModel().selectFirst();

		addPane.add(tableLbl, 0, 0);
		addPane.add(tableFld, 1, 0);
		addPane.add(qLabel, 2, 0);
		addPane.add(qFld, 3, 0);
		addPane.add(wineLbl, 0, 1);
		addPane.add(wineFld, 1, 1);
		addPane.add(qLabel1, 2, 1);
		addPane.add(qFld1, 3, 1);
		addPane.add(chamLbl, 0, 2);
		addPane.add(chamFld, 1, 2);
		addPane.add(qLabel2, 2, 2);
		addPane.add(qFld2, 3, 2);
		addPane.add(vodkaLbl, 0, 3);
		addPane.add(vodkaFld, 1, 3);
		addPane.add(qLabel3, 2, 3);
		addPane.add(qFld3, 3, 3);
		addPane.add(sodaLbl, 0, 4);
		addPane.add(sodaFld, 1, 4);
		addPane.add(qLabel4, 2, 4);
		addPane.add(qFld4, 3, 4);
		// addPane.add(orderLbl, 0, 5);
		// addPane.add(orderFld, 1, 5);
		addPane.add(totalBtn, 0, 5);

		////////////////////// action

		listBox.setOnAction(e -> {
			detailPane.getChildren().clear();
			forAddPane.getChildren().clear();
			mPane.getChildren().removeAll(detailPane);
			nameFld.setText(eBag.findByName(listBox.getValue()).getName());
			dateFld.setText(eBag.findByName(listBox.getValue()).getDate());
			timeFld.setText(eBag.findByName(listBox.getValue()).getTime());
			priceFld.setText(eBag.findByName(listBox.getValue()).getTicketPrice());
			tableFld.setText(eBag.findByName(listBox.getValue()).getTb().getPrice());
			wineFld.setText(eBag.findByName(listBox.getValue()).getWb().getPrice());
			chamFld.setText(eBag.findByName(listBox.getValue()).getCb().getPrice());
			vodkaFld.setText(eBag.findByName(listBox.getValue()).getVb().getPrice());
			sodaFld.setText(eBag.findByName(listBox.getValue()).getSb().getPrice());

			detailPane.getChildren().addAll(gpane);
			forAddPane.getChildren().addAll(addPane);
			mPane.getChildren().addAll(detailPane, addPane, totalBox);
		});

		mPane.getChildren().addAll(infoTxt, listBox, detailPane, forAddPane);
	}

	public VBox getPane() {
		return mPane;
	}

}
