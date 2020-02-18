package view;

import controller.OwnerController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.ManagerBag;
import model.PeopleBagV2;

public class TestApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		PeopleBagV2 pBag = new PeopleBagV2();
//		ManagerBag mBag = new ManagerBag();
		pBag.load();
		LoginWindow loginWindow = new LoginWindow(stage);
		OwnerController oc = new OwnerController(loginWindow, pBag);
		
	}

}
