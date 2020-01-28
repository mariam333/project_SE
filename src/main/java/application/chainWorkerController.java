package src.main.java.application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import src.main.java.application.ConnectController;

public class chainWorkerController  implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="choosItemToEdit"
    private AnchorPane choosItemToEdit; // Value injected by FXMLLoader

    @FXML // fx:id="addItemBox"
    private CheckBox addItemBox; // Value injected by FXMLLoader

    @FXML // fx:id="addcolor"
    private TextField addcolor; // Value injected by FXMLLoader

    @FXML // fx:id="addprice"
    private TextField addprice; // Value injected by FXMLLoader

    @FXML // fx:id="addname"
    private TextField addname; // Value injected by FXMLLoader

    @FXML // fx:id="AddItemButten"
    private Button AddItemButten; // Value injected by FXMLLoader

    @FXML // fx:id="DeletId"
    private TextField DeletId; // Value injected by FXMLLoader

    @FXML // fx:id="AddItemBox"
    private CheckBox AddItemBox; // Value injected by FXMLLoader

    @FXML // fx:id="EditItem"
    private CheckBox EditItem; // Value injected by FXMLLoader

    @FXML // fx:id="editid"
    private TextField editid; // Value injected by FXMLLoader

    @FXML // fx:id="editsale"
    private TextField editsale; // Value injected by FXMLLoader

    @FXML // fx:id="editname"
    private TextField editname; // Value injected by FXMLLoader

    @FXML // fx:id="editcolor"
    private TextField editcolor; // Value injected by FXMLLoader

    @FXML // fx:id="Edit"
    private Button Edit; // Value injected by FXMLLoader

    @FXML // fx:id="addimageBtn"
    private Button addimageBtn; // Value injected by FXMLLoader

    @FXML // fx:id="email"
    private TextField email; // Value injected by FXMLLoader

    @FXML // fx:id="logout"
    private Button logout; // Value injected by FXMLLoader

    @FXML // fx:id="editprice"
    private TextField editprice; // Value injected by FXMLLoader
    
    @FXML // fx:id="DeletItemButten"
    private Button DeletItemButten; // Value injected by FXMLLoader
    
    @FXML // fx:id="EditItemButten"
    private Button EditItemButten; // Value injected by FXMLLoader
    
    @FXML // fx:id="fill"
    private Label fill; // Value injected by FXMLLoader

    
    public void SeTEmail(String theEmail) 
    {
		// TODO Auto-generated method stub
		email.setText(theEmail);
	}
    String imagePath="";
    public void setImagePath(String path) 
    {
		// TODO Auto-generated method stub
    	imagePath = path;
	}
    
    @FXML
    void DeletItem(ActionEvent event) throws IOException 
    {
    	String message = "DeletItem#" + DeletId.getText();
    	ConnectController.client.handleMessageFromClientUI(message);
		if ("Delet".equals(ConnectController.client.servermsg)) 
		{
			JOptionPane.showMessageDialog(null, "Item Delet Successfully!! ");

		} else if ("NotDelet".equals(ConnectController.client.servermsg)) 
		{
			JOptionPane.showMessageDialog(null, "Item don't delet!!");

		}


    }


    @FXML
    void EditItem(ActionEvent event)  throws IOException {
		String message = "EditItem#" + editid.getText() + "#" + editprice.getText() + "#" + editsale.getText() + "#"
				+ editname.getText() + '#' + editcolor.getText() ;
		ConnectController.client.handleMessageFromClientUI(message);
		if ("Edit".equals(ConnectController.client.servermsg)) 
		{
			JOptionPane.showMessageDialog(null, "Item Edited Successfully!! ");

		} else if ("NotEdit".equals(ConnectController.client.servermsg)) 
		{
			JOptionPane.showMessageDialog(null, "Item don't Edit!!");

		}
    }

    @FXML
    void addItem(ActionEvent event) throws IOException
    {
    	String message = "AddItem#" + addcolor.getText() + "#" + addprice.getText() + "#" + addname.getText() + "#"
				+ imagePath;
    	ConnectController.client.handleMessageFromClientUI(message);
		if ("Add".equals(ConnectController.client.servermsg)) 
		{
			JOptionPane.showMessageDialog(null, "Item Added Successfully!! ");

		} else if ("NotAdd".equals(ConnectController.client.servermsg)) 
		{
			JOptionPane.showMessageDialog(null, "Item don't add!!");

		}

    }
	
    
    @FXML
    void addImage(ActionEvent event) throws IOException {
    	// get the file selected 
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("AddImage.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		AddImageController home = loader.getController();
		
		Scene regist = new Scene(root);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); 
		home.setstage(app_stage);
		app_stage.setScene(regist);
		app_stage.show();
    }
    

    @FXML
    void enableAddItem(ActionEvent event) 
    {
    	addcolor.setDisable(false);
    	addcolor.setOpacity(1);
    	addprice.setDisable(false);
    	addprice.setOpacity(1);
    	addname.setDisable(false);
    	addname.setOpacity(1);
    	addimageBtn.setDisable(false);
    	addimageBtn.setOpacity(1);
    	AddItemButten.setDisable(false);
    	AddItemButten.setOpacity(1);

    }

    @FXML
    void enableDelet(ActionEvent event) 
    {
    	DeletId.setDisable(false);
    	DeletId.setOpacity(1);
    	DeletItemButten.setDisable(false);
    	DeletItemButten.setOpacity(1);

    }

    @FXML
    void enableEdit(ActionEvent event) 
    {
    	fill.setDisable(false);
    	fill.setOpacity(1);
    	editid.setDisable(false);
    	editid.setOpacity(1);
    	editprice.setDisable(false);
    	editprice.setOpacity(1);
    	editsale.setDisable(false);
    	editsale.setOpacity(1);
    	editname.setDisable(false);
    	editname.setOpacity(1);
    	editcolor.setDisable(false);
    	editcolor.setOpacity(1);
    	EditItemButten.setDisable(false);
    	EditItemButten.setOpacity(1);
    	

    }

  
    @FXML
    void LogOut(ActionEvent event) throws IOException 
    {

		String message = "chainWorkerlogout#" + email.getText();
		ConnectController.client.handleMessageFromClientUI(message);
		if (ConnectController.client.servermsg != null && "chainWorkerlogout".equals(ConnectController.client.servermsg)) 
		{
			JOptionPane.showMessageDialog(null, "You are logout ");
			FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			//HomePageController home = loader.getController();
			Scene regist = new Scene(root);
			Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			app_stage.setScene(regist);
			app_stage.show();

		}
	}
   
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
