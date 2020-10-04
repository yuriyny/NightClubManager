package view;

import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Custumer;
import model.PeopleBag;

public class OrderHistory {
	private Text infoTxt;
	private ComboBox<String> orderBox;
	private VBox mPane;
	
	private Label enameLbl;
	private Label eDateLbl;
	private Label eTimeLbl;
	private Label totalPriceLbl;
	
	private TextField enameFld;
	private TextField eDateFld;
	private TextField eTimeFld;
	private TextField totralPriceFld;
	
	
	
	private GridPane gpane;
	private VBox subPane;
	
	public OrderHistory(PeopleBag pBag, Custumer c){
		subPane = new VBox(10);
		subPane.setAlignment(Pos.CENTER);
		mPane = new VBox(20);
		mPane.setAlignment(Pos.CENTER);
		infoTxt = new Text("Select Your Order From The List:");
		orderBox = new ComboBox<String>();
		
		
		for(int i = 0; i < c.getOb().getSize(); i++){
			orderBox.getItems().add(c.getOb().getOrder(i).getEname() + "##" + c.getOb().getOrder(i).getId());
		}
		
		orderBox.setOnAction(e->{
			subPane.getChildren().clear();
			String data[] = orderBox.getValue().split("##");
			enameFld.setText(c.getOb().findOrderID(data[1]).getEname());
			eDateFld.setText(c.getOb().findOrderID(data[1]).getDate());
			eTimeFld.setText(c.getOb().findOrderID(data[1]).getTime());
			totralPriceFld.setText(Double.toString(c.getOb().findOrderID(data[1]).getTotalPrice()));
			subPane.getChildren().add(gpane);
			
		});
		
		
		gpane = new GridPane();
		gpane.setAlignment(Pos.CENTER);
		
		enameLbl = new Label("Event Name:");
		eDateLbl = new Label("Date:");
		eTimeLbl = new Label("Time:");
		totalPriceLbl = new Label("Total Price Paid:");
		
		enameFld = new TextField();
		eDateFld = new TextField();
		eTimeFld = new TextField();
		totralPriceFld = new TextField();
		
		gpane.add(enameLbl, 0, 0);
		gpane.add(enameFld, 1, 0);
		gpane.add(eDateLbl, 0, 1);
		gpane.add(eDateFld, 1, 1);
		gpane.add(eTimeLbl, 0, 2);
		gpane.add(eTimeFld, 1, 2);
		gpane.add(totalPriceLbl, 0, 3);
		gpane.add(totralPriceFld, 1, 3);
		
		
		
		
		
		
		
		mPane.getChildren().addAll(infoTxt, orderBox, subPane);
		
	}
	
	public VBox getPane(){
		return mPane;
	}

}
