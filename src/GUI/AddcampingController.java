/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import entities.CentreCamping;
import entities.Upload;
import entities.campingg;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import service.CrudCentre;
import service.serviceCamping;

/**
 * FXML Controller class
 *
 * @author LENEVO
 */
public class AddcampingController implements Initializable {
 private File file;
    String pic;

    int id;
    @FXML
    private ImageView backg;
    @FXML
    private TextField title;
    @FXML
    private DatePicker datedeb;
    @FXML
    private TextField prix;
    @FXML
    private ChoiceBox<CentreCamping> centre;
    CrudCentre cr = new CrudCentre();
    @FXML
    private TextArea description;
    @FXML
    private TextField slogon;
    @FXML
    private TextField nb_place;
    @FXML
    private DatePicker datefin;
    @FXML
    private Button action;
    String photo = "test";

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cr.afficher().forEach((p) -> {
            centre.getItems().add(new CentreCamping(p.getId(), p.getNom(), p.getDescription()));
            centre.setOnAction(event -> {
                  id=centre.getValue().getId();  

            });
        });

    }

    @FXML
    private void submit(ActionEvent event) {
        serviceCamping sr = new serviceCamping();
        sr.ajouter(new campingg(title.getText(), slogon.getText(), description.getText(), Date.valueOf(datedeb.getValue()), Date.valueOf(datefin.getValue()), pic, Integer.parseInt(nb_place.getText()), Integer.parseInt(prix.getText()), id));

    }

    @FXML
    private void uplaod(ActionEvent event) throws IOException{
                FileChooser fileChooser = new FileChooser();
        file = fileChooser.showOpenDialog(null);
        FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
        FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
        fileChooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);

      //  path.setText("File:" + file);
        //pic=(file.toURI().toString());
        pic = new Upload().upload(file, "\\image");
        System.out.println(pic);

    }

    @FXML
    private void back(ActionEvent event) throws IOException {
                 Parent page2 = FXMLLoader.load(getClass().getResource("tableCamping.fxml"));
                Scene scene2 = new Scene(page2);
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.setScene(scene2);
                app_stage.show();

    }

}
