package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.PeopleBag;

public class SelectRegisterWindow {
	private VBox mPane;
	private HBox sPane;
	private Button ownerBtn;
	//private Button managerBtn;
	private Button custumerBtn;
	private Text questionTxt;
	private Stage stage;
	
	public SelectRegisterWindow(PeopleBag pBag){
		mPane = new VBox(10);
		mPane.setAlignment(Pos.CENTER);
		sPane = new HBox(30);
		sPane.setAlignment(Pos.CENTER);
		ownerBtn = new Button("Owner");
		//managerBtn = new Button("Manager");
		custumerBtn = new Button("Custumer");
		questionTxt = new Text("Who Are You?");
		sPane.getChildren().addAll(ownerBtn, custumerBtn);
		mPane.getChildren().addAll(questionTxt, sPane);
		
		ownerBtn.setOnAction(e->{
			new NewOwnerWindow(pBag);
			stage.close(); 
			
		});
		
		custumerBtn.setOnAction(e->{
			new NewCustumerWindow(pBag);
			stage.close(); 
			
		});
		stage = new Stage();
		stage.setScene(new Scene(mPane, 200,100));
		stage.show();
		
	}
	


}
