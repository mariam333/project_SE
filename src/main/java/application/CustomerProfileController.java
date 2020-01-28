/**
 * Sample Skeleton for 'CustomerProfile.fxml' Controller Class
 */

package src.main.java.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//import src.application.Image;

public class CustomerProfileController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Myorders"
    private Button Myorders; // Value injected by FXMLLoader

    @FXML // fx:id="filling_a_complaint"
    private Button filling_a_complaint; // Value injected by FXMLLoader

    @FXML // fx:id="Change_pass"
    private Button Change_pass; // Value injected by FXMLLoader

    @FXML // fx:id="email"
    private TextField email; // Value injected by FXMLLoader

    @FXML // fx:id="ID"
    private TextField ID; // Value injected by FXMLLoader

    @FXML // fx:id="refund"
    private TextField refund; // Value injected by FXMLLoader

    @FXML // fx:id="phone"
    private TextField phone; // Value injected by FXMLLoader

    @FXML // fx:id="back"
    private Button back; // Value injected by FXMLLoader

    @FXML // fx:id="SaveChanges"
    private Button SaveChanges; // Value injected by FXMLLoader

    @FXML // fx:id="password"
    private TextField password; // Value injected by FXMLLoader

    @FXML // fx:id="Name"
    private TextField Name; // Value injected by FXMLLoader

    @FXML // fx:id="Visa_number"
    private TextField Visa_number; // Value injected by FXMLLoader

    @FXML // fx:id="CVV"
    private TextField CVV; // Value injected by FXMLLoader

    @FXML // fx:id="Date"
    private TextField Date; // Value injected by FXMLLoader

//    public void setID(String ID1) {
//    	ID.setText(ID1);
//    }
    public void setID() {
    ID.setText("hh");}
    public void setName(String Name1) {
    	Name.setText(Name1);
    }
    public void setphone(String phone1) {
    	phone.setText(phone1);
    }
    public void setemail(String email1) {
    	email.setText(email1);
    }
    public void setpassword(String password1) {
    	password.setText(password1);
    }
    public void setVisa_number(String Visa_number1) {
    	Visa_number.setText(Visa_number1);
    }
    public void setCVV(String CVV1) {
    	CVV.setText(CVV1);
    }
    public void setDate(String Date1) {
    	Date.setText(Date1);
    }
    public void setrefund(String refund1) {
    	refund.setText(refund1);
    }
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Myorders != null : "fx:id=\"Myorders\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert filling_a_complaint != null : "fx:id=\"filling_a_complaint\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert Change_pass != null : "fx:id=\"Change_pass\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert ID != null : "fx:id=\"ID\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert refund != null : "fx:id=\"refund\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert phone != null : "fx:id=\"phone\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert SaveChanges != null : "fx:id=\"SaveChanges\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert Name != null : "fx:id=\"Name\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert Visa_number != null : "fx:id=\"Visa_number\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert CVV != null : "fx:id=\"CVV\" was not injected: check your FXML file 'CustomerProfile.fxml'.";
        assert Date != null : "fx:id=\"Date\" was not injected: check your FXML file 'CustomerProfile.fxml'.";

    }
}
