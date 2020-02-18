package view;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class OwnerNoClubPane {
	private VBox vPane;
	private Text infoTxt;
	private Button addBtn;
	
	public OwnerNoClubPane(){
		vPane = new VBox(60);
		infoTxt = new Text("Currently there are no clubs added");
		addBtn = new Button("Add a Club");
		
		addBtn.setOnAction(e->{
			//?????????????????????
			NewClubInfo nClub = new NewClubInfo();
			vPane.getChildren().removeAll(infoTxt, addBtn);// nClub.getPane();
			vPane.getChildren().add(nClub.getPane());
			System.out.println("XHeck");
		});
		
		vPane.getChildren().addAll(infoTxt, addBtn);	
	}
	
	public VBox getPane(){
		return vPane;
	}
	

}
