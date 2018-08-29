/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Johan Sánchez
 */
public class VistaVendedorController implements Initializable {

    @FXML
    private Tab pProductos;
    @FXML
    private AnchorPane pGenerarFactura;
    @FXML
    private Button bActualizarFactura;
    @FXML
    private Button bImprimir;
    @FXML
    private TextArea textAreaFactura;
    @FXML
    private Label label1;
    @FXML
    private Label labelNombreFactura;
    @FXML
    private Button botonCerrarVendedor;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void actualizarFactura(ActionEvent event) {
    }

    @FXML
    private void imprimir(ActionEvent event) {
    }
    
    @FXML
    private void cerrarVendedor(ActionEvent event){
        
    }
}
