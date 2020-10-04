package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Owner;
import model.PeopleBag;

public class AddManagerWindow {
	//private VBox vPane;
	private Text infoTxt;
	private Button addBtn;
	private VBox myPane;
	public AddManagerWindow(PeopleBag pBag, Owner o){
		myPane = new VBox(40);
		myPane.setAlignment(Pos.CENTER);
		infoTxt = new Text("Currently there are no managers");
		addBtn = new Button("Add a Manager");
		
		addBtn.setOnAction(e->{
			AddManager mi = new AddManager(pBag, o);
			myPane.getChildren().removeAll(infoTxt, addBtn);
			myPane.getChildren().add(mi.getPane());
		});
		
		myPane.getChildren().addAll(infoTxt,addBtn);	
	}
	
	
	public VBox getPane(){
		return myPane;
	}
}
