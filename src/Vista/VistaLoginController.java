/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Johan Sánchez
 */
public class VistaLoginController implements Initializable {

    @FXML
    private ImageView imagenLoging;
    @FXML
    private PasswordField textFContraseña;
    @FXML
    private Label labelContraseña;
    @FXML
    private Label labelUsuario;
    @FXML
    private TextField textFUsuario;
    @FXML
    private RadioButton radioBAdministrador;
    @FXML
    private ToggleGroup group;
    @FXML
    private RadioButton radioBVendedor;
    @FXML
    private Button botonOK;
    @FXML
    private Label labelError;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void accionEnviar(ActionEvent actionEvent){
        
    }
}
