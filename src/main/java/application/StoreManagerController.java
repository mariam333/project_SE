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

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.control.TableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;


public class StoreManagerController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="Reports"
    private TableView<Data> Reports= new TableView<>(); // Value injected by FXMLLoader

    private final ObservableList<Data> tvObservableList = FXCollections.observableArrayList();//??
    
    @FXML // fx:id="OrderReport"
    private TableColumn<String, Void> OrderReport =new TableColumn("Order Report"); // Value injected by FXMLLoader

    @FXML // fx:id="ComplaintReport"
    private TableColumn<String, Void> ComplaintReport =new TableColumn("Complaint Report"); // Value injected by FXMLLoader

    @FXML // fx:id="PaymentReport"
    private TableColumn<String, Void> PaymentReport =new TableColumn("Payment Report"); // Value injected by FXMLLoader

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
    	 String message = "DateOfAllReports#" + store;
  		Connect.client.handleMessageFromClientUI(message);
  		String[] Msg = Connect.client.servermsg.split("@");
  		String[] Order_rep = Msg[0].split("#");
  		String[] Complaint_rep = Msg[1].split("#");
  		String[] Pay_rep = Msg[2].split("#");
  		
  		for(int i=0; i<Order_rep.length;i++) {
//  			Button date= new Button();
//  			date.setText(Order_rep[i]);
//  			date.setOnAction("ord"+String.valueOf(i));
//  			OrderReport.add(date);
  			
  			Callback<TableColumn<String, Void>, TableCell<String, Void>> cellFactory = new Callback<TableColumn<String, Void>, TableCell<String, Void>>() {
  	            @Override
  	          public TableCell<String, Void> call(final TableColumn<String, Void> param) {
  	           final TableCell<String, Void> cell = new TableCell<String, Void>() {
  	        	 private final Button date = new Button(Order_rep[i]);
  	        	 
  	        	 {date.setOnAction((ActionEvent event) ->{
  	        		FXMLLoader loader = new FXMLLoader(getClass().getResource("OrderReport.fxml"));
  	      		AnchorPane root = (AnchorPane) loader.load();
  	      		OrderReport user = loader.getController();
//  	      		Image im = new Image("images/background.jpg");info to hala
      		    user.ordersdata(Order_rep[i],Store);
  	      		Scene regist = new Scene(root);
  	      		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
  	      		app_stage.setScene(regist);
  	      		app_stage.show();
  	        	 }}
  	        	 @Override
                 public void updateItem(Void item, boolean empty) {
                     super.updateItem(item, empty);
                     if (empty) {
                         setGraphic(null);
                     } else {
                         setGraphic(date);
                     }
                 }
             };
             return cell;
         }
     };
     OrderReport.setCellFactory(cellFactory);

    Reports.getColumns().add(OrderReport);
  		}
     
  	        	 
  	        	 
  	        	 
  			
  		
  		for(int i=0; i<Complaint_rep.length;i++) {
//  			Button date= new Button();
//  			date.setText(Complaint_rep[i]);
//  			date.setOnAction("comp"+String.valueOf(i));
//  			PaymentReport.add(date);
  			Callback<TableColumn<String, Void>, TableCell<String, Void>> cellFactory = new Callback<TableColumn<String, Void>, TableCell<String, Void>>() {
  	            @Override
  	          public TableCell<String, Void> call(final TableColumn<String, Void> param) {
  	           final TableCell<String, Void> cell = new TableCell<String, Void>() {
  	        	 private final Button date = new Button(Order_rep[i]);
  	        	 
  	        	 {date.setOnAction((ActionEvent event) ->{
  	        		FXMLLoader loader = new FXMLLoader(getClass().getResource("ComplaintReport.fxml"));
  	      		AnchorPane root = (AnchorPane) loader.load();
  	      		ComplaintReport user = loader.getController();
//  	      		Image im = new Image("images/background.jpg");info to hala
      		    user.comlaintsdata(Complaint_rep[i],Store);
  	      		Scene regist = new Scene(root);
  	      		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
  	      		app_stage.setScene(regist);
  	      		app_stage.show();
  	        	 }}
  	        	 @Override
                 public void updateItem(Void item, boolean empty) {
                     super.updateItem(item, empty);
                     if (empty) {
                         setGraphic(null);
                     } else {
                         setGraphic(date);
                     }
                 }
             };
             return cell;
         }
     };
     ComplaintReport.setCellFactory(cellFactory);

    Reports.getColumns().add(ComplaintReport);
//  			
  		}
  		for(int i=0; i<Pay_rep.length;i++) {
//  			Button date= new Button();
//  			date.setText(Pay_rep[i]);
//  			date.setOnAction("pay"+String.valueOf(i));
//  			ComplaintReport.add(date);
//  			
  			Callback<TableColumn<String, Void>, TableCell<String, Void>> cellFactory = new Callback<TableColumn<String, Void>, TableCell<String, Void>>() {
  	            @Override
  	          public TableCell<String, Void> call(final TableColumn<String, Void> param) {
  	           final TableCell<String, Void> cell = new TableCell<String, Void>() {
  	        	 private final Button date = new Button(Pay_rep[i]);
  	        	 
  	        	 {date.setOnAction((ActionEvent event) ->{
  	        		FXMLLoader loader = new FXMLLoader(getClass().getResource("PaymentReport.fxml"));
  	      		AnchorPane root = (AnchorPane) loader.load();
  	      	PaymentReport user = loader.getController();
//  	      		Image im = new Image("images/background.jpg");info to hala
      		    user.paymentdata(Pay_rep[i],Store);
  	      		Scene regist = new Scene(root);
  	      		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
  	      		app_stage.setScene(regist);
  	      		app_stage.show();
  	        	 }}
  	        	 @Override
                 public void updateItem(Void item, boolean empty) {
                     super.updateItem(item, empty);
                     if (empty) {
                         setGraphic(null);
                     } else {
                         setGraphic(date);
                     }
                 }
             };
             return cell;
         }
     };
     PaymentReport.setCellFactory(cellFactory);

    Reports.getColumns().add(PaymentReport);
  		}
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
