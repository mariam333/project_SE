/**
 * Sample Skeleton for 'Order.fxml' Controller Class
 */
package src.main.java.application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.glass.events.MouseEvent;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class OrderController implements Initializable {
	private String Email;
	private String Name;
	//private ItemClient selectedItem;
	ObservableList<ItemClient> Items = FXCollections.observableArrayList();
	
	public void addItem(ItemClient item){
		Items.add(item);
	}

	public void setEmail(String myEmail) {
		Email=myEmail;
		
	}
	public void setName(String name) {
		Name=name;
		
	}

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="catalogBtn"
    private Button catalogBtn; // Value injected by FXMLLoader

    @FXML // fx:id="purchesbtn"
    private Button purchesbtn; // Value injected by FXMLLoader

    @FXML // fx:id="itemsTable"
    private TableView<ItemClient> itemsTable; // Value injected by FXMLLoader

    @FXML // fx:id="name_col"
    private TableColumn<ItemClient, String> name_col; // Value injected by FXMLLoader

    @FXML // fx:id="price_col"
    private TableColumn<ItemClient, Double> price_col; // Value injected by FXMLLoader

    @FXML // fx:id="color_col"
    private TableColumn<ItemClient, String> color_col; // Value injected by FXMLLoader

    @FXML // fx:id="type_col"
    private TableColumn<ItemClient, String> type_col; // Value injected by FXMLLoader
    


    @FXML // fx:id="RemoveBtn"
    private Button RemoveBtn; // Value injected by FXMLLoader

    @FXML // fx:id="totalPriceTxt"
    private TextField totalPriceTxt; // Value injected by FXMLLoader
    
    
    private String shoperID;
    private String storeID;
    
    public void setshoperID(String id) {
    	shoperID=id;
    }
    public void setstoreID(String id) {
    	storeID=id;
    }

    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		name_col.setCellValueFactory(new PropertyValueFactory<ItemClient, String>("name"));
		price_col.setCellValueFactory(new PropertyValueFactory<ItemClient, Double>("price"));
		color_col.setCellValueFactory(new PropertyValueFactory<ItemClient, String>("color"));
		type_col.setCellValueFactory(new PropertyValueFactory<ItemClient, String>("type"));
		
		
		/* add column to the tableview and set its items */
		itemsTable.getColumns().add(name_col);
		itemsTable.getColumns().add(price_col);
		itemsTable.getColumns().add(color_col);
		itemsTable.getColumns().add(type_col);
	
		itemsTable.setItems(Items);
		
	}

    @FXML
    void PurchesOrder(ActionEvent event) {//storeid,shopperid,date(22/3/1998),currentdate(time22:45),delevery1/0,deliveryadd,\
    	//reciptionName,suppoesedTimeDouble,totalPrice ,array(itemID,quantity)%,%@%array(personale(typ,color,price)
    	//halastore=1 main=2
    	
    	
    }

    @FXML
    void go2catalog(ActionEvent event) throws IOException {
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
    void inableRemove(MouseEvent event) {
    	RemoveBtn.setDisable(false);
    }

    @FXML
    void removeItem(ActionEvent event) { // cold be wrong
    	ObservableList<ItemClient> allItems,singalItem;
    	allItems= itemsTable.getItems();
    	singalItem= itemsTable.getSelectionModel().getSelectedItems();
    	int i=0;
    	while(!singalItem.isEmpty()) {
    	singalItem.remove(i);
    	i++;
    	}
    	double total=Double.totalPriceTxt.getText();
    	totalPriceTxt.setText(arg0);
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	 assert catalogBtn != null : "fx:id=\"catalogBtn\" was not injected: check your FXML file 'Order.fxml'.";
         assert purchesbtn != null : "fx:id=\"purchesbtn\" was not injected: check your FXML file 'Order.fxml'.";
         assert itemsTable != null : "fx:id=\"itemsTable\" was not injected: check your FXML file 'Order.fxml'.";
         assert name_col != null : "fx:id=\"name_col\" was not injected: check your FXML file 'Order.fxml'.";
         assert price_col != null : "fx:id=\"price_col\" was not injected: check your FXML file 'Order.fxml'.";
         assert color_col != null : "fx:id=\"color_col\" was not injected: check your FXML file 'Order.fxml'.";
         assert type_col != null : "fx:id=\"type_col\" was not injected: check your FXML file 'Order.fxml'.";
         assert RemoveBtn != null : "fx:id=\"RemoveBtn\" was not injected: check your FXML file 'Order.fxml'.";
         assert totalPriceTxt != null : "fx:id=\"totalPriceTxt\" was not injected: check your FXML file 'Order.fxml'.";

    }

}

