package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.EventBag;
import model.Manager;
import model.PeopleBag;

public class ManagerEventInfo {
	
	private Text infoTxt;
	private ComboBox<String> ebox;
	private VBox mPane;
	private VBox subPane;
	private HBox subPane2;
	private Button assighnBtn;
	private HBox root;
	
	public ManagerEventInfo(PeopleBag pBag, Manager m, EventBag eBag){
		root = new HBox(10);
		root.setAlignment(Pos.CENTER);
		infoTxt = new Text("Select an Event");
		subPane = new VBox(10);
		subPane.setAlignment(Pos.CENTER);
		subPane2 = new HBox(30);
		subPane.setAlignment(Pos.CENTER);
		assighnBtn = new Button("Assighn Employees");
		ebox = new ComboBox<String>();
		for(int i = 0; i < m.geteBag().getSize(); i++){
			ebox.getItems().add(m.geteBag().getEvent(i).getName());
		}
		System.out.println(m.geteBag().getSize());
		mPane = new VBox(20);
		mPane.setAlignment(Pos.CENTER);
		//continue here
		ebox.setOnAction(e->{
			if(m.geteBag().findByName(ebox.getValue()).getBartender() == null){
			subPane2.getChildren().clear();
			subPane.getChildren().clear();
			ManagerEventDetails mid = new ManagerEventDetails(m.geteBag().findByName(ebox.getValue()));
			subPane.getChildren().addAll(mid.getPane(), assighnBtn );
			} else {
			subPane.getChildren().clear();
			subPane2.getChildren().clear();
			ManagerEventDetails mid2 = new ManagerEventDetails(m.geteBag().findByName(ebox.getValue()));
			AssighnedEmployees ae = new AssighnedEmployees(pBag, m, eBag, m.geteBag().findByName(ebox.getValue()));//club event
			subPane2.getChildren().addAll(mid2.getPane(), ae.getPane());
			}
		});
		
		assighnBtn.setOnAction(e->{
			root.getChildren().clear();
			EmployeesForEvent efe = new EmployeesForEvent(pBag, m, eBag, m.geteBag().findByName(ebox.getValue()));
			root.getChildren().addAll(mPane, efe.getPane());
		});
		
		mPane.getChildren().addAll(infoTxt, ebox, subPane, subPane2);
		root.getChildren().addAll(mPane);
	}
	
	public HBox getmPane(){
		return root;
	}
}
