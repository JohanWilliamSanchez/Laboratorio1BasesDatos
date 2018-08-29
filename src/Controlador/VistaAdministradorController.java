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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Johan Sánchez
 */
public class VistaAdministradorController implements Initializable {

    @FXML
    private Tab pInventario;
    @FXML
    private TableView<?> tablitaInventario;
    @FXML
    private TableColumn<?, ?> columnaIdProducto;
    @FXML
    private TableColumn<?, ?> columnaNombre;
    @FXML
    private TableColumn<?, ?> columnaCantidad;
    @FXML
    private TableColumn<?, ?> columnaPrecio;
    @FXML
    private TableColumn<?, ?> columnaCodigoBarras;
    @FXML
    private TableColumn<?, ?> columnaFechaE;
    @FXML
    private TableColumn<?, ?> columnaFechaC;
    @FXML
    private TableColumn<?, ?> columnaProveedor;
    @FXML
    private Button botonGenerarTablaInventario;
    @FXML
    private Label labelidProducto;
    @FXML
    private Label labelNombre;
    @FXML
    private Label labelCantidad;
    @FXML
    private Label labelPrecio;
    @FXML
    private Label labelCodigoBarras;
    @FXML
    private Label labelFechaEntrada;
    @FXML
    private Label labelFechaCaducidad;
    @FXML
    private TextField textFidProducto;
    @FXML
    private TextField textFNombre;
    @FXML
    private TextField textFCantidad;
    @FXML
    private TextField textFPrecio;
    @FXML
    private TextField textFCodigoBarras;
    @FXML
    private TextField textFFechaEntrada;
    @FXML
    private TextField textFFechaCaducidad;
    @FXML
    private Button botonBuscarInventario;
    @FXML
    private Button botonNuevoProducto;
    @FXML
    private Button botonAñadirProducto;
    @FXML
    private Button botonEliminarProduto;
    @FXML
    private Button botonModificar;
    @FXML
    private Label labelProveedor;
    @FXML
    private TextField textFProveedor;
    @FXML
    private Tab pPorcentaje;
    @FXML
    private TableView<?> tablitaProductosvendidos;
    @FXML
    private TableColumn<?, ?> columnaProdutoTorta;
    @FXML
    private TableColumn<?, ?> columnaVentasTorta;
    @FXML
    private PieChart graficaPorcentajeTorta;
    @FXML
    private Button botongenerarPorcentajeProductos;
    @FXML
    private Tab pInforme;
    @FXML
    private TableView<?> tablitaVendedorVenta;
    @FXML
    private TableColumn<?, ?> columnaCadaVendedor;
    @FXML
    private TableColumn<?, ?> columnaVentaVendedor;
    @FXML
    private Button botonGenerarCadaVendedor;
    @FXML
    private BarChart<?, ?> graficaCadaVendedor;
    @FXML
    private Tab pVentasMes;
    @FXML
    private TableView<?> tablitaVentaMes;
    @FXML
    private TableColumn<?, ?> columnaMes;
    @FXML
    private TableColumn<?, ?> columnaVentames;
    @FXML
    private Button botonGenerar;
    @FXML
    private LineChart<?, ?> graficaVentasMes;
    @FXML
    private Tab pMeta;
    @FXML
    private BarChart<?, ?> graficaBarrasMeta;
    @FXML
    private Button botonGenerarMeta;
    @FXML
    private Label labelAdministrador;
    @FXML
    private TextField textFAdministrador;
    @FXML
    private Label labelId;
    @FXML
    private TextField textFId;
    @FXML
    private Button botonCerrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generarInventario(ActionEvent event) {
    }

    @FXML
    private void buscarEnInventario(ActionEvent event) {
    }

    @FXML
    private void nuevoProducto(ActionEvent event) {
    }

    @FXML
    private void añadirProducto(ActionEvent event) {
    }

    @FXML
    private void modificar(ActionEvent event) {
    }

    @FXML
    private void generarCadadVendedor(ActionEvent event) {
    }

    @FXML
    private void generarVentasMes(ActionEvent event) {
    }

    @FXML
    private void generarMeta(ActionEvent event) {
    }

    @FXML
    private void cerrar(ActionEvent event) {
    }
    
}
