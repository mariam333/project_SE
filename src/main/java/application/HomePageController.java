/**
 * Sample Skeleton for 'HomePage.fxml' Controller Class
 */

package src.main.java.application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HomePageController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="SortBy"
    private MenuButton SortBy; // Value injected by FXMLLoader

    @FXML // fx:id="IDsort"
    private MenuItem IDsort; // Value injected by FXMLLoader

    @FXML // fx:id="priceSort"
    private MenuItem priceSort; // Value injected by FXMLLoader

    @FXML // fx:id="NameSort"
    private MenuItem NameSort; // Value injected by FXMLLoader

    @FXML // fx:id="login"
    private Button login; // Value injected by FXMLLoader

    @FXML // fx:id="SignUp"
    private Button SignUp; // Value injected by FXMLLoader

    @FXML // fx:id="Search"
    private Button Search; // Value injected by FXMLLoader

    @FXML // fx:id="searchText"
    private TextField searchText; // Value injected by FXMLLoader

    @FXML // fx:id="go2Profile"
    private Button go2Profile; // Value injected by FXMLLoader

    @FXML // fx:id="CreatOrder"
    private Button CreatOrder; // Value injected by FXMLLoader

    @FXML // fx:id="SignOut"
    private Button SignOut; // Value injected by FXMLLoader

    @FXML // fx:id="usernameTxt"
    private Label usernameTxt; // Value injected by FXMLLoader

    @FXML // fx:id="catalog"
    private TableView<?> catalog; // Value injected by FXMLLoader

    @FXML // fx:id="numCol"
    private TableColumn<?, ?> numCol; // Value injected by FXMLLoader

    @FXML // fx:id="NameCol"
    private TableColumn<?, ?> NameCol; // Value injected by FXMLLoader

    @FXML // fx:id="colorCol"
    private TableColumn<?, ?> colorCol; // Value injected by FXMLLoader

    @FXML // fx:id="priceCol"
    private TableColumn<?, ?> priceCol; // Value injected by FXMLLoader

    @FXML // fx:id="IDCol"
    private TableColumn<?, ?> IDCol; // Value injected by FXMLLoader

    @FXML // fx:id="pictureCol"
    private TableColumn<?, ?> pictureCol; // Value injected by FXMLLoader

    @FXML // fx:id="choseStore"
    private MenuButton choseStore; // Value injected by FXMLLoader

    @FXML
    void AddToCart(MouseEvent event) {

    }

    @FXML
    void Go2Profile(ActionEvent event) {

    }

    @FXML
    void GoToLogIn(ActionEvent event) {

    }

    @FXML
    void GoToSignUp(ActionEvent event) {

    }

    @FXML
    void SearchText(ActionEvent event) {

    }

    @FXML
    void SortBy(ActionEvent event) {

    }

    @FXML
    void UpdatCounter(ActionEvent event) {

    }

    @FXML
    void creatOrder(ActionEvent event) {

    }

    @FXML
    void displayColor(ActionEvent event) {

    }

    @FXML
    void displayIDItem(ActionEvent event) {

    }

    @FXML
    void displayName(ActionEvent event) {

    }

    @FXML
    void displayNum(ActionEvent event) {

    }

    @FXML
    void displayPic(ActionEvent event) {

    }

    @FXML
    void displayPrice(ActionEvent event) {

    }

    @FXML
    void signOut(ActionEvent event) {

    }

    @FXML
    void sortByID(ActionEvent event) {

    }

    @FXML
    void sortByName(ActionEvent event) {

    }

    @FXML
    void sortByPrice(ActionEvent event) {

    }

    @FXML
    void startCounter(ActionEvent event) {

    }

    @FXML
    void viewStoreCatalog(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert SortBy != null : "fx:id=\"SortBy\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert IDsort != null : "fx:id=\"IDsort\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert priceSort != null : "fx:id=\"priceSort\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert NameSort != null : "fx:id=\"NameSort\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert SignUp != null : "fx:id=\"SignUp\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert Search != null : "fx:id=\"Search\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert searchText != null : "fx:id=\"searchText\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert go2Profile != null : "fx:id=\"go2Profile\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert CreatOrder != null : "fx:id=\"CreatOrder\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert SignOut != null : "fx:id=\"SignOut\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert usernameTxt != null : "fx:id=\"usernameTxt\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert catalog != null : "fx:id=\"catalog\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert numCol != null : "fx:id=\"numCol\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert NameCol != null : "fx:id=\"NameCol\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert colorCol != null : "fx:id=\"colorCol\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert priceCol != null : "fx:id=\"priceCol\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert IDCol != null : "fx:id=\"IDCol\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert pictureCol != null : "fx:id=\"pictureCol\" was not injected: check your FXML file 'HomePage.fxml'.";
        assert choseStore != null : "fx:id=\"choseStore\" was not injected: check your FXML file 'HomePage.fxml'.";

    }
}
