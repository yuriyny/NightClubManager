package view;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PurchaseInfo {
	public PurchaseInfo(){
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Success!");
		alert.setHeaderText("Your Purchase is Successful.");
		alert.setContentText("Information Saved.");

		alert.showAndWait();
	
}
}
