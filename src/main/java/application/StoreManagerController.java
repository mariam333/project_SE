/**
 * Sample Skeleton for 'StoreManager.fxml' Controller Class
 */

package src.main.java.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.io.IOException;
import javax.swing.JOptionPane;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class StoreManagerController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Reports"
    private TableView<?> Reports; // Value injected by FXMLLoader

    @FXML // fx:id="OrderReport"
    private TableColumn<?, ?> OrderReport; // Value injected by FXMLLoader

    @FXML // fx:id="ComplaintReport"
    private TableColumn<?, ?> ComplaintReport; // Value injected by FXMLLoader

    @FXML // fx:id="PaymentReport"
    private TableColumn<?, ?> PaymentReport; // Value injected by FXMLLoader

    @FXML // fx:id="Pranch"
    private Label Pranch; // Value injected by FXMLLoader

   
    @FXML
	void Backtologin(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		Login user = loader.getController();
//		Image im = new Image("images/background.jpg");info to hala
//		user.setimage(im);
//		user.set(MyEmail);
		Scene regist = new Scene(root);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(regist);
		app_stage.show();
	}
    
    void FullTable(String Store)
    {
    	Pranch.setText(Store);
    	
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Reports != null : "fx:id=\"Reports\" was not injected: check your FXML file 'StoreManager.fxml'.";
        assert OrderReport != null : "fx:id=\"OrderReport\" was not injected: check your FXML file 'StoreManager.fxml'.";
        assert ComplaintReport != null : "fx:id=\"ComplaintReport\" was not injected: check your FXML file 'StoreManager.fxml'.";
        assert PaymentReport != null : "fx:id=\"PaymentReport\" was not injected: check your FXML file 'StoreManager.fxml'.";
        assert Pranch != null : "fx:id=\"Pranch\" was not injected: check your FXML file 'StoreManager.fxml'.";

    }
}
