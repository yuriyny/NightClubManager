package view;

import controller.OwnerLoginEvent;
import controller.OwnerLoginListener;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Owner;
import model.PeopleBagV2;

public class LoginWindow {
	private VBox vbox;
	private GridPane gpane;
	private Text text;
	private Button loginBtn;
	private Hyperlink newAccount;
	private TextField idFld;
	private TextField passwordFld;
	private Label idLbl;
	private Label passwordLbl;
	private Stage stage;
	private OwnerLoginListener listener;
	//private PeopleBagV2 pBag = new PeopleBagV2();
	
	
	public LoginWindow(Stage stage){
	//	pBag.load();
		this.stage = stage;
		vbox = new VBox(10);
		vbox.setAlignment(Pos.CENTER);
		gpane = new GridPane();
		gpane.setAlignment(Pos.CENTER);
		gpane.setHgap(10);
		gpane.setVgap(10);
		text = new Text("Night Club Account");
		loginBtn = new Button("Login");
		newAccount = new Hyperlink("New User");
		idFld = new TextField();
		passwordFld = new TextField();
		idLbl = new Label("ID");
		passwordLbl = new Label("Password");
		gpane.add(idLbl, 0, 0);
		gpane.add(passwordLbl, 0, 1);
		gpane.add(idFld, 1, 0);
		gpane.add(passwordFld, 1, 1);
		
		newAccount.setOnAction(e->{
			new SelectRegisterWindow(getListener());
			stage.close();
		});
		
		loginBtn.setOnAction(e->{
			String id = idFld.getText();
			String password = passwordFld.getText();
				OwnerLoginEvent ev = new OwnerLoginEvent(this, id, password);
				
				if(listener != null) {// if it exists or not
					listener.clicked(ev);
				}
				

//			System.out.println(o);

		});
		
		vbox.getChildren().addAll(text, gpane, loginBtn, newAccount);
		
		stage.setScene(new Scene(vbox, 300,190));
		
		stage.show();
		
		
		
		
		
		
	}
	public void setOwnerLoginListener(OwnerLoginListener listener){
		this.listener = listener;
	}
	public OwnerLoginListener getListener(){
		return listener;
	}
	
}
