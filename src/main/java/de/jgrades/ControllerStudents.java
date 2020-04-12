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

    private ArrayList<Student> students;

    public ControllerStudents() {
        this.students = DataHandler.getInstance().getStudents();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            this.tabStudents.setItems(FXCollections.observableArrayList(this.students));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatedClass() {
        super.updatedClass();
        this.students = DataHandler.getInstance().getStudents();
        this.tabStudents.setItems(FXCollections.observableArrayList(this.students));
    }
}
