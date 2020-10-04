package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.ClubEvent;
import model.EventBag;
import model.Manager;
import model.PeopleBag;

public class AssighnedEmployees {
	
	private GridPane gpane;
	private Label bartenderLbl;
	private TextField bartenderFld;
	private Label djLbl;
	private TextField djFld;
	private Label waiterLbl;
	private TextField waiterFld;
	private Label cookLbl;
	private TextField cookFld;
	private Label cashierLbl;
	private TextField cashierFld;
	private Button changeBtn;
	
	private HBox mPane;
	private VBox root;
	
	public AssighnedEmployees(PeopleBag pBag, Manager m, EventBag eBag, ClubEvent ce){
		mPane = new HBox();
		root = new VBox();
		mPane.setAlignment(Pos.CENTER);
		bartenderLbl = new Label("Bartender:");
		djLbl = new Label("DJ:");
		waiterLbl = new Label("Waiter:");
		cookLbl = new Label("Cook:");
		cashierLbl = new Label("Cashier:");
		bartenderFld = new TextField();
		djFld = new TextField();
		waiterFld = new TextField();
		cookFld = new TextField();
		cashierFld = new TextField();
		
		changeBtn = new Button("Change Workers");
		gpane = new GridPane();
		gpane.setAlignment(Pos.CENTER);
		gpane.add(bartenderLbl, 0, 0);
		gpane.add(bartenderFld, 1, 0);
		gpane.add(djLbl, 0, 1);
		gpane.add(djFld, 1, 1);
		gpane.add(waiterLbl, 0, 2);
		gpane.add(waiterFld, 1, 2);
		gpane.add(cookLbl, 0, 3);
		gpane.add(cookFld, 1, 3);
		gpane.add(cashierLbl, 0, 4);
		gpane.add(cashierFld, 1, 4);
		gpane.add(changeBtn, 0, 5);
		//gpane.getChildren().remove(changeBtn);
		
		changeBtn.setOnAction(e->{
			EmployeesForEvent efe = new EmployeesForEvent(pBag, m, eBag, ce);
			root.getChildren().add(efe.getPane());
			Stage stage = new Stage();
			stage.setScene(new Scene(root, 400,400));
			stage.show();
		});
		
		
		bartenderFld.setText(ce.getBartender().getfName() + " " +ce.getBartender().getlName());
		djFld.setText(ce.getDj().getfName() + " " +ce.getDj().getlName());
		waiterFld.setText(ce.getWaiter().getfName()+ " " +ce.getWaiter().getlName());
		cookFld.setText(ce.getCook().getfName()+ " " +ce.getCook().getfName());
		cashierFld.setText(ce.getCashier().getfName()+ " " +ce.getCashier().getfName());
		
		
		mPane.getChildren().addAll(gpane);
		
		
		
	}
	
	public HBox getPane(){
		return mPane;
	}
}
