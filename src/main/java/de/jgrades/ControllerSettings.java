package de.jgrades;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerSettings extends ContollerParent implements Initializable {
    @FXML
    TextField setFirstName, setLastName, setSchoolName, setSchoolYear;

    @FXML
    TableView setClasses, setSubjects;
    TableColumn subShort, subLong, className;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Demo Data
        //General settings
        setFirstName.setText("Marina");
        setLastName.setText("Feuchtgruber");
        setSchoolName.setText("MS Alfonsstraße");
        setSchoolYear.setText("2019/2020");

        //Classes
//        setClasses.getItems().add()

        //Subjects

    }
}
