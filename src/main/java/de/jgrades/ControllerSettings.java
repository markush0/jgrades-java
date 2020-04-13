package de.jgrades;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerSettings extends ContollerParent implements Initializable {
    @FXML
    private TextField setFirstName, setLastName, setSchoolName, setSchoolYear;

    @FXML
    private TableView setClasses, setSubjects;
    @FXML
    private TableColumn setSubShortCol, setSubLongCol, setClassesCol;

    private ArrayList<Subject> subjects;
    private ArrayList<SchoolClass> classes;

    private final Settings set;
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


        try {
            this.subjects = DataHandler.getInstance().getSubjects();
            this.setSubjects.setItems(FXCollections.observableArrayList(this.subjects));


            this.classes = DataHandler.getInstance().getClasses();
            this.setClasses.setItems(FXCollections.observableArrayList(this.classes));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void updatedClass() {

        Logger log = Logger.getLogger(getClass().getName());

        log.log(Level.INFO, "updatedClass Settings");
        super.updatedClass();
        this.subjects = DataHandler.getInstance().getSubjects();

        this.setSubjects.setItems(FXCollections.observableArrayList(this.subjects));
    }
}
