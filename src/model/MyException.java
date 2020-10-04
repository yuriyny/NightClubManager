package model;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MyException extends Exception {
	
	public MyException(String s){
		super(s);
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error");
		alert.setHeaderText(s);
		alert.setContentText("Please enter correct format.");
		alert.showAndWait();
	}

}
