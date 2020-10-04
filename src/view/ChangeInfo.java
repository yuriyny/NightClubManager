package view;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ChangeInfo {
	public ChangeInfo(){
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Success!");
		alert.setHeaderText("You Successfully Made Changes.");
		alert.setContentText("Information Saved.");

		alert.showAndWait();
	
}
}
