package view;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class NoFoundInfo {
	public NoFoundInfo(){
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Not Found!");
		alert.setHeaderText("Your Login/Password Is Not Found!");
		alert.setContentText("Try Again!");

		alert.showAndWait();
	}
}
