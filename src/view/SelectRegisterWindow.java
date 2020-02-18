package view;

import controller.OwnerLoginListener;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.PeopleBagV2;

public class SelectRegisterWindow {
	private VBox mPane;
	private HBox sPane;
	private Button ownerBtn;
	private Button managerBtn;
	private Button employeeBtn;
	private Text questionTxt;
//	private PeopleBagV2 pBag;
	private Stage stage;
	
	public SelectRegisterWindow(OwnerLoginListener listener){
//		this.pBag = pBag;
		mPane = new VBox(10);
		sPane = new HBox(30);
		ownerBtn = new Button("Owner");
		managerBtn = new Button("Manager");
		employeeBtn = new Button("Employee");
		questionTxt = new Text("Who Are You?");
		sPane.getChildren().addAll(ownerBtn, managerBtn, employeeBtn);
		mPane.getChildren().addAll(questionTxt, sPane);
		
		ownerBtn.setOnAction(e->{
			new NewOwnerWindow(listener);
			stage.close(); 
			
		});
		stage = new Stage();
		stage.setScene(new Scene(mPane, 400,400));
		stage.show();
		
	}
	
//	public VBox getPane(){
//		return mPane;
//	}

}
