package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.EventBag;
import model.Owner;
import model.PeopleBag;

public class AddEventWindow {
	
	private VBox mPane;
	private Text infoTxt;
	private Button addBtn;
	
	
	
	public AddEventWindow(EventBag eBag, Owner o, PeopleBag pBag){
		
		mPane = new VBox(20);
		mPane.setAlignment(Pos.CENTER);
		
		infoTxt = new Text("Currently You Don't Have Events");
		
		addBtn = new Button("Add New Event");
		
		mPane.getChildren().addAll(infoTxt, addBtn);
		
		addBtn.setOnAction(e->{
			NewEventWindow ne = new NewEventWindow(eBag, o, pBag);
			ne.showStage();
		});
	}
	
	public VBox getPane(){
		return mPane;
	}
}
