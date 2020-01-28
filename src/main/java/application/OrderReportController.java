/**
 * Sample Skeleton for 'OrderReport.fxml' Controller Class
 */

package src.main.java.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javax.swing.JOptionPane;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import src.main.java.application.ConnectController;

public class OrderReportController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="dateofRep"
    private Label dateofRep; // Value injected by FXMLLoader
    
    @FXML // fx:id="diagord"
    private BarChart<?, ?> diagord; // Value injected by FXMLLoader

    static String Store="";
    
    String MyEmail= null;
    void setEmail(String Email) { MyEmail=Email;}
    @FXML
    void BacktoAllComp(ActionEvent event) throws IOException{
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("StoreManager.fxml"));
		AnchorPane root = (AnchorPane) loader.load();
		StoreManagerController user = loader.getController();
		user.setEmail(MyEmail);
		user.FullTable();
//		Image im = new Image("images/background.jpg");to me all comp
//		user.setimage(im);
//		user.set(MyEmail);
		Scene regist = new Scene(root);
		Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		app_stage.setScene(regist);
		app_stage.show();
	}
    
    void ordersdata(String Month1,String store1) {
   	 dateofRep.setText(Month1);
	 Store= store1;
   	 String message = "order#" + "report#" + store1 + "#" + Month1;
		ConnectController.client.handleMessageFromClientUI(message);
		String[] Msg = ConnectController.client.servermsg.split("@");
		String[] kinds=Msg[0].split("#");
		String[] amounts=Msg[1].split("#");
		
			 final CategoryAxis xAxis = new CategoryAxis();
		        final CategoryAxis yAxis = new CategoryAxis();
			diagord= new BarChart<String,String>(xAxis,yAxis);
			xAxis.setLabel("Kind");       
	        yAxis.setLabel("amount");
	        XYChart.Series series1 = new XYChart.Series();
	        for(int i=0;i<kinds.length;i++) {
	        series1.getData().add(new XYChart.Data(kinds[i], amounts[i]));
	        }
	       // Scene scene  = new Scene(bc,800,600);
	        diagord.getData().addAll(series1);
	       // stage.setScene(scene);
	       // stage.show();
		
   	
    }
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert dateofRep != null : "fx:id=\"dateofRep\" was not injected: check your FXML file 'OrderReport.fxml'.";

    }
}
