package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Owner;
import model.PeopleBag;

public class OwnerNoClubPane {
	private VBox vPane;
	private Text infoTxt;
	private Button addBtn;
	private VBox myPane;
	public OwnerNoClubPane(PeopleBag pBag, Owner o){
		
		vPane = new VBox(60);
		vPane.setAlignment(Pos.CENTER);
		infoTxt = new Text("Currently there are no clubs added");
		addBtn = new Button("Add a Club");
		
		addBtn.setOnAction(e->{
			NewClubInfo c = new NewClubInfo(pBag, o);
			vPane.getChildren().removeAll(infoTxt, addBtn);
			vPane.getChildren().add(c.getPane());
		});
		
		vPane.getChildren().addAll(infoTxt, addBtn);	
	}
	
	public VBox getPane(){
		return vPane;
	}
	
	public void setMyPane(VBox pane){
		this.myPane = pane;
		
	}
	
	public VBox getMyPane(){
		return myPane;
	}
	

}
