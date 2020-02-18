package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OwnerWindow {
	private MenuBar menuBar;
	private BorderPane bPane;
	private VBox vbox;
	private ListView list;
	private Button myInfoBtn;
	private Button clubBtn;
	private Button managerBtn;
	private Button bartenderBtn;
	private Button djBtn;
	private Button waiterBtn;
	private Button cookBtn;
	private Button cashierBtn;
	private OwnerInfoPane oip;
	private VBox clubPane;
	//Center Pane Fields
	//private 
	
	private Stage stage;
	public OwnerWindow(){
		///////////////////////////////
		//Left pane options
		bPane = new BorderPane();
		vbox = new VBox(20);
		vbox.setAlignment(Pos.CENTER);
		myInfoBtn = new Button("My Info");
		myInfoBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		managerBtn = new Button("Managers");
		managerBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		bartenderBtn = new Button("Bertenders");
		bartenderBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		djBtn = new Button("DJs");
		djBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		waiterBtn = new Button("Waiters");
		waiterBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		cookBtn = new Button("Cooks");
		cookBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		cashierBtn = new Button("Cashier"); 
		cashierBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		clubBtn = new Button("My Club");
		clubBtn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		vbox.getChildren().addAll(myInfoBtn, clubBtn, managerBtn, bartenderBtn, djBtn, waiterBtn, cookBtn, cashierBtn);
		bPane.setLeft(vbox);
		// Left Pane Ends
		////////////////////////////////////
		// Center Pane
		
		
		////////////////////////////////
		
		myInfoBtn.setOnAction(e->{
			//OwnerInfoPane op = new OwnerInfoPane();
			bPane.setCenter(oip.getPane());
			//op.getfNameFld().setText("Check");
		});
		clubBtn.setOnAction(e->{
			bPane.setCenter(clubPane);
		});
		
		
		
		
		
		stage = new Stage();
		
		stage.setScene(new Scene(bPane, 700,500));
		stage.show();
//		list = new ListView();

		
		
	}
	
	public void setOwnerWindowPane(OwnerInfoPane oip){
		this.oip = oip;
	}
	
	public void setClubPane(VBox pane){
		this.clubPane = pane;
	}

}
