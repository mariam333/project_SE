package src.main.java.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

//import src.application.String;
import src.main.java.application.ConnectController;


public class YourDesign implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="pro"
    private TextField pro; // Value injected by FXMLLoader

    @FXML // fx:id="price"
    private TextField price; // Value injected by FXMLLoader

    @FXML // fx:id="color"
    private TextField color; // Value injected by FXMLLoader

    @FXML // fx:id="details"
    private TextField details; // Value injected by FXMLLoader

    @FXML // fx:id="submit"
    private Button submit; // Value injected by FXMLLoader

    String MyEmail = null;
    String myName="";
	public void SeTEmail(String theEmail) {
		// TODO Auto-generated method stub
		MyEmail = theEmail;
	}
	public void SeTName(String name) {
		// TODO Auto-generated method stub
		myName = name;
	}
	
	@FXML
    void back(ActionEvent event) throws IOException 
    {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		HomePageController home = loader.getController();
		//Image im = new Image("images/background.jpg");
		//employee.setimage(im);
		home.setEmail(MyEmail);
		Scene regist = new Scene(root);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(regist);
		app_stage.show();
	}
    @FXML
	void Create(ActionEvent event) throws IOException {
		String message = "Create#" + pro.getText() + "#" + price.getText() + "#" + color.getText() + "#"
				+ details.getText() ;
		ConnectController.client.handleMessageFromClientUI(message);
		if ("Created".equals(ConnectController.client.servermsg)) {
			JOptionPane.showMessageDialog(null, "product Created Successfully!! ");

		} else if ("NotCreated".equals(ConnectController.client.servermsg)) {
			JOptionPane.showMessageDialog(null, "product can't created!! ");

		}

	}
    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}