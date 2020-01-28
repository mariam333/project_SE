/**
 * Sample Skeleton for 'Stores.fxml' Controller Class
 */

package src.main.java.application;
import src.main.java.application.ConnectController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class StoresController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="back"
    private Button back; // Value injected by FXMLLoader

    static String selectedstore1= "";
    static String selectedstore2= "";
    static int count=0;
    @FXML
	void signup(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		LoginController user = loader.getController();
//		Image im = new Image("images/background.jpg");info to hala
//		user.setimage(im);
//		user.set(MyEmail);
		Scene regist = new Scene(root);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(regist);
		app_stage.show();
	}

    void AddStores()
    {
    	 String message = "Name Of All Stores#";
   		ConnectController.client.handleMessageFromClientUI(message);
   		String[] Stores = ConnectController.client.servermsg.split("#");
   	  CheckBox[] check_stores = new CheckBox[Stores.length];
   	for (int i = 0; i < Stores.length; i++) {
   		CheckBox store = check_stores[i] = new CheckBox(Stores[i]);
   		if (check_stores[i].isSelected())
   		{
   			if(count==0)
   		
   			{selectedstore1=Stores[i];
   			count++;}
   			else
   				{selectedstore2=Stores[i];
   				count++;}
   		}
   	
    }
    }
    
    @FXML
    void view(ActionEvent event) throws IOException{
      if(count>2)
    	  JOptionPane.showMessageDialog(null, "Please check one or two stores ");
      { selectedstore1= "";
       selectedstore2= "";
       count=0;
       AddStores();}
      if(count==1||count==2) {
    	  FXMLLoader loader = new FXMLLoader(getClass().getResource("Administrator.fxml"));
  		AnchorPane root = (AnchorPane) loader.load();
  		AdministratorController user = loader.getController();
//  		Image im = new Image("images/background.jpg");info to hala
  		if(count==1)
  		user.FullTable1(selectedstore1);
  		user.count(count);
  		if(count==2) {
  	  		user.FullTable1(selectedstore1);
  	  	    user.FullTable2(selectedstore2);
  	     	user.count(count);
  	  	    }
  		Scene regist = new Scene(root);
  		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
  		app_stage.setScene(regist);
  		app_stage.show();
    	  }
      }
      
    

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'Stores.fxml'.";

    }
}
