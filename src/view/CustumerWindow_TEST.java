package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Custumer;
import model.EventBag;
import model.PeopleBag;

public class CustumerWindow_TEST {
	private VBox mPane;
	
	private ComboBox<String> box;
	
	private Button buyBtn;
	private Button detailBtn;
	
	public CustumerWindow_TEST(PeopleBag pBag, Custumer c, EventBag eBag){
		
		mPane = new VBox(10);
		
		box = new ComboBox<String>();
		
		buyBtn = new Button("Buy");
		detailBtn = new Button("Details");
		
		for(int i = 0; i < eBag.getSize(); i++){
			box.getItems().add(eBag.getEvent(i).getName());
		}
		detailBtn.setOnAction(e->{
			String price = eBag.findByName(box.getValue()).getOwner().getClub().geteBag().findByName(box.getValue()).getTicketPrice();
			System.out.println(eBag.findByName(box.getValue()).getOwner().getClub().geteBag().findByName(box.getValue()));
		});
		
		
		mPane.getChildren().addAll(box, detailBtn, buyBtn);
		
		Stage stage = new Stage();
		stage.setScene(new Scene(mPane, 400,400));
		stage.show();
	}
	
	
}
