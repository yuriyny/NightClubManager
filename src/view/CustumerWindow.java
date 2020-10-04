package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Custumer;
import model.EventBag;
import model.PeopleBag;

public class CustumerWindow {

	private BorderPane bPane;
	private VBox btnPane;
	private Button myInfoBtn;
	private Button eveBtn;
	private Button myOrderBtn;
	private Stage stage;

	public CustumerWindow(PeopleBag pBag, Custumer c, EventBag eBag) {
		bPane = new BorderPane();
		bPane.setPadding(new Insets(10,10,10,10));
		btnPane = new VBox(10);
		myInfoBtn = new Button("My Info");
		myInfoBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		eveBtn = new Button("Events");
		eveBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		myOrderBtn = new Button("Order History");
		myOrderBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btnPane.getChildren().addAll(myInfoBtn, eveBtn, myOrderBtn);
		btnPane.setAlignment(Pos.CENTER);
		bPane.setLeft(btnPane);
////////////////MYINFO BTN
		myInfoBtn.setOnAction(e -> {
			// INFORMATION ABOUT CUSTUMER WILL APPEAR HERE
			MyInfoCustumer mic = new MyInfoCustumer(pBag, c);
			bPane.setCenter(mic.getPane());
		});
		
//////////////// ENDS/////////////////////////////////////////////
// THE LIST OF ALL EVENTS AVAILABLE AROUND
		eveBtn.setOnAction(e -> {
			if (eBag.getSize() == 0) {
				new NoEventWindow();
			} else {
				//HERE, CUSTUMER CHOOSE A TICKET AND BUYS SOME INVENTORY
				CustumerEventList cil = new CustumerEventList(pBag, eBag, c);
				bPane.setCenter(cil.getPane());
			}
		});
		/////////////////// MY ORDERS BTN/////////////////////////////////
// THE LIST OF ALL ORDERS CUSTUMER HAS MADE
		myOrderBtn.setOnAction(e -> {
			OrderHistory oh = new OrderHistory(pBag, c);
			bPane.setCenter(oh.getPane());
		});

		stage = new Stage();
		stage.setScene(new Scene(bPane, 700, 700));
		stage.show();

		/////////////////////////////////////////////////////////////////////////////

	}

}
