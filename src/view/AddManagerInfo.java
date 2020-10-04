package view;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.Address;
import model.EventBag;
import model.Manager;
import model.Owner;
import model.PeopleBag;

public class AddManagerInfo {
	private Label salaryLbl;
	private TextField salaryFld;
	private VBox mPane;
	
	public AddManagerInfo(PeopleBag pBag, Owner o){
		
		salaryLbl = new Label("Salary:");
		salaryFld = new TextField();
		salaryFld.setMaxSize(200, 50);
		BasicInfoPane bip = new BasicInfoPane();
		bip.getPane().getChildren().remove(bip.getSaveBtn());
		bip.getPane().getChildren().addAll(salaryLbl, salaryFld);
		bip.getPane().getChildren().add(bip.getSaveBtn());
		bip.getPane().getChildren().add(bip.getEditBtn());
		
		bip.getSaveBtn().setOnAction(e->{
			String fname = bip.getfNameFld().getText();
			String lname = bip.getlNameFld().getText();
			String phone = bip.getPhoneFld().getText();
			String stName = bip.getStNameFld().getText();
			String stNumber = bip.getStNumberFld().getText();
			String city = bip.getCityFld().getText();
			String state = bip.getStateFld().getText();
			String zip = bip.getZipFld().getText();
			String login = bip.getLoginFld().getText();
			String password = null;
			String salary = salaryFld.getText();
			EventBag eb = new EventBag();
			PeopleBag employees = new PeopleBag();
			Address a = new Address(stName, stNumber, city, state, zip);
			Manager m = new Manager(fname, lname, phone, a, login, password, salary, eb, o, employees);
			System.out.println(o);
			o.getpBag().add(m);
			pBag.add(m);//adding to bag just in case
			pBag.change(o.getId(), o);
			pBag.save();
		}); 
		
		
		
		
		
		this.mPane = bip.getPane();
	}
	
	public VBox getPane(){
		return mPane;
	}

}
