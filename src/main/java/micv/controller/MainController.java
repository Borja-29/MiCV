package micv.controller;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {

    @FXML
    private ImageView abrirImg;

    @FXML
    private MenuItem abrirItem;

    @FXML
    private MenuItem acercaDeItem;

    @FXML
    private Menu archivoMenu;

    @FXML
    private Menu ayudaMenu;

    @FXML
    private Tab conocimientosTab;

    @FXML
    private Tab contactoTab;

    @FXML
    private Tab experienciaTab;

    @FXML
    private Tab formacionTab;

    @FXML
    private MenuItem guardarComoItem;

    @FXML
    private ImageView guardarImg;

    @FXML
    private MenuItem guardarItem;

    @FXML
    private ImageView nuevoImg;

    @FXML
    private MenuItem nuevoItem;

    @FXML
    private Tab personalTab;

    @FXML
    private BorderPane root;

    @FXML
    private MenuItem salirItem;

    public MainController() {

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
			loader.setController(this);
			loader.load();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
	public BorderPane getView() {
		return root;
	}

}

//https://jenkov.com/tutorials/javafx/filechooser.html
