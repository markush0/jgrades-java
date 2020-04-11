package de.jgrades;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControllerStudents extends ContollerParent implements Initializable {
    @FXML
    TableView tabStudents;

    ArrayList<Student> students;

    public ControllerStudents() {
        DemoData demo = new DemoData();
        if (demo.isDemo()) {
            this.students = demo.getDemoStudents();
        } else {

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tabStudents.setItems(FXCollections.observableArrayList(this.students));
    }
}
