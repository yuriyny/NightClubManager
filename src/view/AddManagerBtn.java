package view;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Owner;
import model.PeopleBag;
///////////////////////////////not for now to do....
public class AddManagerBtn {
	private Button addManagerBtn;
	private HBox hbox;
	private VBox vbox;
	
	
	public AddManagerBtn(PeopleBag pBag, Owner o){
		addManagerBtn = new Button("Add New Manager");
		hbox = new HBox();
		vbox = new VBox();
		
		hbox.getChildren().add(addManagerBtn);
		
		addManagerBtn.setOnAction(e->{
			AddManagerInfo ami = new AddManagerInfo(pBag, o);
			vbox = ami.getPane();
		});
	}
	
	
}
