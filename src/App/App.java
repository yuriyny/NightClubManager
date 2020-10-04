package App;

import controller.LoginController;
import controller.OwnerInfoController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.EventBag;
import model.PeopleBag;
import view.LoginWindow;
/*
 * Yuriy Burshtyko
 * CST242 Final Project
 * LOGIN AND PASSWORD IS NOW REQUIRED TO HAVE ACCES TO THE FEATUREs OF THE PROGRAM
 * You can use LOGIN: "ws" Password: "ws" for the Owner Window
 * Login: "qa", Password: "qa" for the Manager Window
 * Login:"za" Password:"za" for the Custumer Window
 * 
 * 
 * PLEASE, READ COMMENTS IN
 * OWNER WINDOW
 * MANAGER WINDOW
 * CUSTUMER WINDOW
 * CLASSES
 */
public class App extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		PeopleBag pBag = new PeopleBag();
		pBag.load();
		EventBag eBag = new EventBag();
		eBag.load();
		//login start window
		LoginWindow loginWindow = new LoginWindow(stage, pBag, eBag);
		//main controller
		LoginController lc = new LoginController(loginWindow, pBag,eBag);

		
	}
}
