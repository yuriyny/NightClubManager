package view;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class NoEventWindow {
	
	
	
	public NoEventWindow(){
		infoAlert();
	}
	
	private void infoAlert(){
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("No Event");
		alert.setHeaderText("Currently There is no Event");
		alert.setContentText("Press OK to exit.");

		alert.showAndWait();
	}

}
