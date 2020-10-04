package view;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.Manager;
import model.Owner;
import model.PeopleBag;

public class ManagerDetails {
	private Label salaryLbl;
	private TextField salaryFld;
	private VBox mPane;

	
	public ManagerDetails(PeopleBag pBag, Owner o, Manager m){
		BasicInfoPane bip = new BasicInfoPane();
		mPane = bip.getPane();
		mPane.setAlignment(Pos.CENTER);
		mPane.getChildren().remove(bip.getSaveBtn());
		
		salaryLbl = new Label("Salary:");
		salaryFld = new TextField();
		salaryFld.setMaxSize(200, 50);
		
		bip.getfNameFld().setText(m.getfName());
		bip.getlNameFld().setText(m.getlName());
		bip.getPhoneFld().setText(m.getPhone());
		bip.getStNameFld().setText(m.getAddress().getStName());
		bip.getStNumberFld().setText(m.getAddress().getStNumber());
		bip.getCityFld().setText(m.getAddress().getCity());
		bip.getStateFld().setText(m.getAddress().getState());
		bip.getZipFld().setText(m.getAddress().getZip());
		bip.getLoginFld().setText(m.getLogin());
		bip.getPane().getChildren().remove(bip.getSaveBtn());
		bip.getPane().getChildren().addAll(salaryLbl, salaryFld);
		
		
	}
	
	public VBox getPane(){
		return mPane;
	}
}
