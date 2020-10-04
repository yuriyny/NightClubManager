package view;

import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.EventBag;
import model.Owner;
import model.PeopleBag;

public class ExpWindow {
	
	
	private Text infoTxt;
	private ComboBox<String> cBox;
	private VBox mPane;
	
	private GridPane gpane;
	private VBox subPane;
	
	private Label manLbl;
	private Label barLbl;
	private Label djLbl;
	private Label waiterLbl;
	private Label cookLbl;
	private Label cashierLbl;
	private Label totalLbl;
	
	private TextField manFld;
	private TextField barFld;
	private TextField djFld;
	private TextField waiterFld;
	private TextField cookFld;
	private TextField cashierFld;
	private TextField totalFld;
	
	
	
	
	
	public ExpWindow(PeopleBag pBag, Owner o, EventBag ebag){
		mPane = new VBox(10);
		mPane.setAlignment(Pos.CENTER);
		infoTxt = new Text("Choose an Event:");
		cBox = new ComboBox<String>();
		
		for(int i = 0; i < o.getClub().geteBag().getSize(); i++){
			cBox.getItems().add(o.getClub().geteBag().getEvent(i).getName());
		}
		
		cBox.setOnAction(e->{
			subPane.getChildren().clear();
			double totalMan = Double.parseDouble(o.getClub().geteBag().findByName(cBox.getValue()).getManager().getSalary())*8;
			double totalBar = Double.parseDouble(o.getClub().geteBag().findByName(cBox.getValue()).getBartender().getSalary())*8;
			double totalDj = Double.parseDouble(o.getClub().geteBag().findByName(cBox.getValue()).getDj().getSalary())*8;
			double totalWt = Double.parseDouble(o.getClub().geteBag().findByName(cBox.getValue()).getWaiter().getSalary())*8;
			double totalco = Double.parseDouble(o.getClub().geteBag().findByName(cBox.getValue()).getCook().getSalary())*8;
			double totalca = Double.parseDouble(o.getClub().geteBag().findByName(cBox.getValue()).getCashier().getSalary())*8;
			double total = totalMan + totalBar + totalDj + totalWt + totalco + totalca;
			
			
			manFld.setText("$"+Double.toString(totalMan));
			barFld.setText("$"+Double.toString(totalBar));
			djFld.setText("$"+Double.toString(totalDj));
			waiterFld.setText("$"+Double.toString(totalWt));
			cookFld.setText("$"+Double.toString(totalco));
			cashierFld.setText("$"+Double.toString(totalca));
			totalFld.setText("$"+Double.toString(total));
			subPane.getChildren().add(gpane);
		});
		
		
		gpane = new GridPane();
		gpane.setAlignment(Pos.CENTER);
		subPane = new VBox();
		subPane.setAlignment(Pos.CENTER);
		manLbl = new Label("Manager Expenses:");
		barLbl = new Label("Bartender Expences:");
		djLbl = new Label("DJ Expences:");
		waiterLbl = new Label("Waiter Expences:");
		cookLbl = new Label("Cook Expences:");
		cashierLbl = new Label("Cashier Expences:");
		totalLbl = new Label("Total:");
		 
		
		manFld = new TextField();
		barFld = new TextField();
		djFld = new TextField();
		waiterFld = new TextField();
		cookFld = new TextField();
		cashierFld = new TextField();
		totalFld = new TextField();
		
		gpane.add(manLbl, 0, 0);
		gpane.add(manFld, 1, 0);
		gpane.add(barLbl, 0, 1);
		gpane.add(barFld, 1, 1);
		gpane.add(djLbl, 0, 2);
		gpane.add(djFld, 1, 2);
		gpane.add(waiterLbl, 0, 3);
		gpane.add(waiterFld, 1, 3);
		gpane.add(cookLbl, 0, 4);
		gpane.add(cookFld, 1, 4);
		gpane.add(cashierLbl, 0, 5);
		gpane.add(cashierFld, 1, 5);
		gpane.add(totalLbl, 0, 6);
		gpane.add(totalFld, 1, 6);
		
		
		mPane.getChildren().addAll(infoTxt, cBox, subPane);
		
	}
	
	public VBox getPane(){
		return mPane;
	}

}
