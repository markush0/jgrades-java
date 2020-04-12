package de.jgrades;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerSettings extends ContollerParent implements Initializable {
    @FXML
    private TextField setFirstName, setLastName, setSchoolName, setSchoolYear;

    @FXML
    private TableView setClasses, setSubjects;
    @FXML
    private TableColumn setSubShortCol, setSubLongCol, setClassesCol;


    private Settings set;
//    private ArrayList<SchoolClass> classes;
//    private ArrayList<Subject> subjects;

    public ControllerSettings() {
        //DEMO Data
//        DemoData demo = new DemoData();
//
//        if (demo.isDemo()) {
//            this.set = demo.getDemoSettings();
//            this.classes = demo.getDemoClasses();
//            this.subjects = demo.getDemoSubjects();
//        } else {
//
//        }
        this.set = DataHandler.getInstance().getSettings();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //General settings

        setFirstName.setText(this.set.getFirstName());
        setLastName.setText(this.set.getLastName());
        setSchoolName.setText(this.set.getSchoolName());
        setSchoolYear.setText(this.set.getYear());

        //Classes
//        setClasses.getItems().add()

        //Subjects
//        this.setClasses
//        ObservableList<Stavka> oListStavaka = FXCollections.observableArrayList(listStavaka);


//        ObservableList<Subject> lst = FXCollections.observableArrayList(this.subjects);
        this.setSubjects.setItems(FXCollections.observableArrayList(DataHandler.getInstance().getSubjects()));

//        this.setSubLongCol.setCellValueFactory(new PropertyValueFactory<Subject, String>("subLong"));
//        this.setSubShortCol.setCellValueFactory(new PropertyValueFactory<Subject, String>("subShort"));

        this.setClasses.setItems(FXCollections.observableArrayList(DataHandler.getInstance().getClasses()));

//        this.setClassesCol.setCellFactory(new PropertyValueFactory<SchoolClass, String>("className"));


    }
}
