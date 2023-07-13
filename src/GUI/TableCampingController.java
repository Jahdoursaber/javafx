/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import entities.KeyValue;
import entities.campingg;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import service.serviceCamping;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.stage.Window;
import java.time.LocalDateTime;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;

/**
 * FXML Controller class
 *
 * @author LENEVO
 */
public class TableCampingController implements Initializable {

    @FXML
    private TableView<KeyValue> table;
    @FXML
    private TableColumn<KeyValue, String> titre;
    @FXML
    private TableColumn<KeyValue, String> slug;
    @FXML
    private TableColumn<KeyValue, String> desc;
    private TableColumn<KeyValue, Date> dad;
    private TableColumn<KeyValue, Date> df;
    private TableColumn<KeyValue, String> pho;
    private TableColumn<KeyValue, Double> prix;
    private TableColumn<KeyValue, Integer> nbp;
    @FXML
    private TableColumn<KeyValue, String> cenre;

    ObservableList<KeyValue> obsCentre = FXCollections.observableArrayList();
    private KeyValue KeyValue;
    @FXML
    private AnchorPane anchor;
    @FXML
    private Text datenow;
    @FXML
    private TextField recherche;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
                table.setEditable(true);

        serviceCamping Cr = new serviceCamping();

        Cr.listJointure().stream().forEach((p) -> {
            obsCentre.add(p);
        });
        titre.setCellValueFactory(new PropertyValueFactory<>("title"));
        titre.setCellFactory(TextFieldTableCell.forTableColumn());
        titre.setOnEditCommit(new EventHandler<CellEditEvent<KeyValue, String>>() {
            @Override
            public void handle(CellEditEvent<KeyValue, String> event) {
                KeyValue uti = event.getRowValue();
                uti.setTitle(event.getNewValue());
                serviceCamping ser = new serviceCamping();
                ser.modifieini(uti);

            }

        });

        slug.setCellValueFactory(new PropertyValueFactory<>("Slug"));
         slug.setCellFactory(TextFieldTableCell.forTableColumn());
        slug.setOnEditCommit(new EventHandler<CellEditEvent<KeyValue, String>>() {
            @Override
            public void handle(CellEditEvent<KeyValue, String> event) {
                KeyValue uti = event.getRowValue();
                uti.setSlug(event.getNewValue());
                serviceCamping ser = new serviceCamping();
                ser.modifieini(uti);

            }

        });
        desc.setCellValueFactory(new PropertyValueFactory<>("description"));
        desc.setCellFactory(TextFieldTableCell.forTableColumn());
        desc.setOnEditCommit(new EventHandler<CellEditEvent<KeyValue, String>>() {
            @Override
            public void handle(CellEditEvent<KeyValue, String> event) {
                KeyValue uti = event.getRowValue();
                uti.setDescription(event.getNewValue());
                serviceCamping ser = new serviceCamping();
                ser.modifieini(uti);

            }

        });
       
        cenre.setCellValueFactory(new PropertyValueFactory<>("nom"));
        table.setItems(obsCentre);
    }

    @FXML
    private void Pdf(ActionEvent event) {

        PrinterJob job = PrinterJob.createPrinterJob();
        if (job != null) {
            Window primaryStage = null;
            job.showPrintDialog(primaryStage);

            Node root = this.anchor;
            job.printPage(root);

            job.endJob();

        }

        LocalDateTime myObj = LocalDateTime.now();
        datenow.setText(myObj.toString());

    }

    @FXML
    private void Delete(ActionEvent event) {
        KeyValue k = new KeyValue();
        serviceCamping imt = new serviceCamping();

        ObservableList obsUtilisateurlist, Pointage;
        obsUtilisateurlist = table.getItems();
        Pointage = table.getSelectionModel().getSelectedItems();
        k = table.getSelectionModel().getSelectedItems().get(0);

        imt.supprimer(new campingg(k.getId()));

       // msj.setText("Champ suprimee !");
        Pointage.forEach(obsUtilisateurlist::remove);
    }

    @FXML
    private void recherche(ActionEvent event) {
    }


    
}
