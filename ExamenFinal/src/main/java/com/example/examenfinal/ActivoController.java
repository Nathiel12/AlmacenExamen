package com.example.examenfinal;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;


public class ActivoController {
    GuardarActivo Archivo=new GuardarActivo("data/Activos.txt");
    private ObservableList<Activo> activosObservable = FXCollections.observableArrayList();

    @FXML
    private TableView<Activo> TablaActivo;

    @FXML
    private TableColumn<Activo, String> colID;

    @FXML
    private TableColumn<Activo, String> colMarca;

    @FXML
    private TableColumn<Activo, String> colModelo;

    @FXML
    private TableColumn<Activo, String> colResponsable;

    @FXML
    private TableColumn<Activo, String> colSerial;

    @FXML
    private TableColumn<Activo, String> colTipo;

    @FXML
    private Button btnAlmacenar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private ComboBox<String> cboxTipoActivo;

    @FXML
    private TextField tfID;

    @FXML
    private TextField tfMarca;

    @FXML
    private Button btnCargar;

    @FXML
    private TextField tfModelo;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField tfResponsable;

    @FXML
    private TextField tfSerial;

    @FXML
    void OnClickAlmacenar(ActionEvent event) {
        String activoSeleccionado = (String)this.cboxTipoActivo.getSelectionModel().getSelectedItem();
        Activo nuevoActivo=new Activo(this.tfID.getText(), activoSeleccionado, this.tfMarca.getText(), this.tfModelo.getText(), this.tfSerial.getText(), this.tfResponsable.getText());
        this.Archivo.agregarActivo(nuevoActivo);
        this.activosObservable.add(nuevoActivo);
    }

    @FXML
    void OnClickEscribirID(ActionEvent event) {

    }

    @FXML
    void OnClickEscribirMarca(ActionEvent event) {

    }

    @FXML
    void OnClickEscribirModelo(ActionEvent event) {

    }


    @FXML
    void OnClickEscribirResponsable(ActionEvent event) {

    }

    @FXML
    void OnClickEscribirSerial(ActionEvent event) {

    }

    @FXML
    void OnClickLimpiar(ActionEvent event) {
        this.tfID.clear();
        this.tfMarca.clear();
        this.tfModelo.clear();
        this.tfResponsable.clear();
        this.tfSerial.clear();
        this.cboxTipoActivo.getSelectionModel().clearSelection();
    }

    @FXML
    void OnClickSeleccionarActivo(ActionEvent event) {

    }
    @FXML
    private void initialize() {
        this.cboxTipoActivo.getItems().addAll(new String[]{"Desktop", "Laptop", "Impresora", "Scanner", "Switch", "Router", "Firewall"});
        this.colID.setCellValueFactory(new PropertyValueFactory("ID"));
        this.colTipo.setCellValueFactory(new PropertyValueFactory("Tipo"));
        this.colMarca.setCellValueFactory(new PropertyValueFactory("Marca"));
        this.colModelo.setCellValueFactory(new PropertyValueFactory("Modelo"));
        this.colSerial.setCellValueFactory(new PropertyValueFactory("Serial"));
        this.colResponsable.setCellValueFactory(new PropertyValueFactory("Responsable"));
        this.TablaActivo.setItems(this.activosObservable);
    }

}