package view;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class InfoClass {
	public InfoClass(){
		
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Success!");
			alert.setHeaderText("You Successfully Saved Your Data.");
			alert.setContentText("Information Saved.");

			alert.showAndWait();
		
	}
}
