/**
 * Sample Skeleton for 'AddImage.fxml' Controller Class
 */

package src.main.java.application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.glass.ui.Window;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AddImageController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="lable"
    private Label lable; // Value injected by FXMLLoader

    @FXML // fx:id="saveBtn"
    private Button saveBtn; // Value injected by FXMLLoader

    @FXML // fx:id="chosefileBtn"
    private Button chosefileBtn; // Value injected by FXMLLoader

 // create a File chooser 
 	FileChooser fil_chooser = new FileChooser(); 
 	File file1;
 	Stage stage;
 	public void setstage(Stage s) {
 		stage=s;
 	}
 	
    @FXML
    void addImage(ActionEvent event) {
    	// get the file selected 
		File file = fil_chooser.showOpenDialog(stage); 

		if (file != null) { 
			file1=file;
			lable.setText(file.getAbsolutePath() + " selected");

								
		}
    }

    @FXML
    void saveNclose(ActionEvent event) throws IOException {
    	// get the file selected 
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("chainWorker.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		chainWorkerController home = loader.getController();
		home.setImagePath(file1.getAbsolutePath());
		Scene regist = new Scene(root);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow(); 
		app_stage.setScene(regist);
		app_stage.show();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert lable != null : "fx:id=\"lable\" was not injected: check your FXML file 'AddImage.fxml'.";
        assert saveBtn != null : "fx:id=\"saveBtn\" was not injected: check your FXML file 'AddImage.fxml'.";
        assert chosefileBtn != null : "fx:id=\"chosefileBtn\" was not injected: check your FXML file 'AddImage.fxml'.";

    }
}

