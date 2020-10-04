package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Manager;
import model.PeopleBag;

public class NoWTInfo {
	private Text infoTxt;
	private Button addBtn;
	private VBox mPane;
	
	
	
	public NoWTInfo(PeopleBag pBag, Manager m){
		infoTxt = new Text("Currenly There Is No Waiter in Your Night Club");
		addBtn = new Button("Add");
		mPane = new VBox(30);
		mPane.getChildren().addAll(infoTxt, addBtn);
		mPane.setAlignment(Pos.CENTER);
		
		addBtn.setOnAction(e->{
			NewWTInfo nbi = new NewWTInfo(pBag, m);
			mPane.getChildren().clear();
			mPane.getChildren().add(nbi.getPane());
		});
		
	}
	
	public VBox getPane(){
		return mPane;
	}
}
