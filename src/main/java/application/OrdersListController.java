/**
 * Sample Skeleton for 'OrdersList.fxml' Controller Class
 */

package src.main.java.application;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OrdersListController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Back2CatalogBtn"
    private Button Back2CatalogBtn; // Value injected by FXMLLoader

    @FXML // fx:id="CanselOrderBtn"
    private Button CanselOrderBtn; // Value injected by FXMLLoader

    @FXML // fx:id="OrdersTable"
    private TableView<Order> OrdersTable; // Value injected by FXMLLoader

    @FXML // fx:id="OrderIdCol"
    private TableColumn<Order, Integer> OrderIdCol; // Value injected by FXMLLoader

    @FXML // fx:id="ContentsCol"
    private TableColumn<Order, String> ContentsCol; // Value injected by FXMLLoader

    @FXML // fx:id="StatusCol"
    private TableColumn<Order, String> StatusCol; // Value injected by FXMLLoader
    private String Email;
    private String Name;
    public void setEmail(String myEmail) {
		Email=myEmail;
		
	}
	public void setName(String name) {
		Name=name;
		
	}

    @FXML
    void Back2catalog(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		HomePageController home = loader.getController();
		home.setEmail(Email);
		home.setName(Name);
		Scene SignUp = new Scene(root);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(SignUp);
		app_stage.show();

    }

    @FXML
    void CanselOrder(ActionEvent event) {
    	ObservableList<Order> allItems,singalItem;
    	allItems= OrdersTable.getItems();
    	singalItem= OrdersTable.getSelectionModel().getSelectedItems();
    	Date ptime=singalItem.get(0).getPurchesTime();
    	long time=ptime.getTime();
    	time=TimeUnit.MILLISECONDS.toHours(time);
    	if(time <= 3) {
    		int i=0;
    		while(!singalItem.isEmpty()) {
    		singalItem.remove(i);
    		i++;
    		}
    		if(time <= 2) {//get's %0% refund
    			
    			
    		}else {// cancel Order without refund
    			
    		}
    	}else {// send message you can't cancel
    		
    	}

    }
    
    
    


    @FXML
    void EnableCansel(MouseEvent event) {
    	ObservableList<Order> allItems,singalItem;
    	allItems= OrdersTable.getItems();
    	singalItem= OrdersTable.getSelectionModel().getSelectedItems();
    	Date ptime=singalItem.get(0).getPurchesTime();
    	long time=ptime.getTime();
    	time=TimeUnit.MILLISECONDS.toHours(time);
    	if(time <= 3) {
    		CanselOrderBtn.setDisable(false);
    		if(time <= 2) {//get's %0% refund
    			
    		}else {// cancel Order without refund
    			
    		}
    	}else {// send message you can't cancel
    		
    	}
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert Back2CatalogBtn != null : "fx:id=\"Back2CatalogBtn\" was not injected: check your FXML file 'OrdersList.fxml'.";
        assert CanselOrderBtn != null : "fx:id=\"CanselOrderBtn\" was not injected: check your FXML file 'OrdersList.fxml'.";
        assert OrdersTable != null : "fx:id=\"OrdersTable\" was not injected: check your FXML file 'OrdersList.fxml'.";
        assert OrderIdCol != null : "fx:id=\"OrderIdCol\" was not injected: check your FXML file 'OrdersList.fxml'.";
        assert ContentsCol != null : "fx:id=\"ContentsCol\" was not injected: check your FXML file 'OrdersList.fxml'.";
        assert StatusCol != null : "fx:id=\"StatusCol\" was not injected: check your FXML file 'OrdersList.fxml'.";

    }
}
