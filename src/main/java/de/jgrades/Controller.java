package de.jgrades;

//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.reflect.TypeToken;
import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller implements Initializable {

    @FXML
    private ControllerHome homeController;
    @FXML
    private ControllerStudents studentsController;
    @FXML
    private ControllerGrades gradesController;
    @FXML
    private ControllerSettings settingsController;
//    private AnchorPane hHome, hStudents, hGrades, hSettings;



    /**
     *
     */
//    private ArrayList<SchoolClass> klassen;

    /**
     *
     */
    private Logger log;

    /**
     *
     */
    private ResourceBundle bundle;


    /**
     *
     */
//    private SchoolClass klasse;

//    /**
//     *
//     */
//    private Settings settings;


    /**
     *
     */
//    public Label lblName;

    /**
     *
     */
//    public ComboBox<SchoolClass> comboKlasse;

    /**
     *
     */
//    public Label footLbl;

    /**
     *
     */
//    public ListView<Student> listStudents;


    @FXML
    private ComboBox cbClass;

    /**
     *
     */
    public Controller() {


        log = Logger.getLogger(getClass().getName());


//        this.klassen = new ArrayList<>();
//        ArrayList<Student> sch = new ArrayList<Student>();
//        sch.add(new Student(
//                "Markus",
//                "Hillmeier",
//                'm'
//        ));
//        this.klassen.add(
//                new SchoolClass("4a", sch));
//        this.klassen.add(new SchoolClass("5a"));
//
//        this.settings = new Settings(
//                "Marina",
//                "Feuchtgruber",
//                "VS St. Josef",
//                "2018",
//                "2019"
//        );
//        this.deserialize();
//        this.desSettings();
    }

    //@Override
    public void initialize(URL location, ResourceBundle resources) {

        this.bundle = resources;
        this.hideContainer();
        this.homeController.show();

        this.cbClass.setItems(FXCollections.observableArrayList(DataHandler.getInstance().getClasses()));


        Callback<ListView<SchoolClass>, ListCell<SchoolClass>> cf = new Callback<ListView<SchoolClass>, ListCell<SchoolClass>>() {
            //@Override
            public ListCell<SchoolClass> call(ListView<SchoolClass> param) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(SchoolClass item, boolean empty) {
                        super.updateItem(item, empty);

                        if (item == null || empty) {
                            setText(null);
                        } else {
                            setText(item.getClassName());
                        }
                    }
                };
            }
        };

        this.cbClass.setButtonCell(cf.call(null));
        this.cbClass.setCellFactory(cf);

    }

    private void checkVisible(ContollerParent settingsController) {
        if (settingsController.isVisible()) {
            log.log(Level.INFO, settingsController.toString());
        }
    }


    public void onButtonOpen(ActionEvent actionEvent) {
            log.log(Level.INFO, actionEvent.toString());
    }





    /**
     *
     */
    private void serialize() {

        //Komische Probleme mit Maven evtl
//        try (Writer writer = new FileWriter("data.json")) {
//            Gson gson = new GsonBuilder().create();
//            gson.toJson(this.klassen, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    /**
     *
     */
    private void deserialize() {

//        Gson gson = new Gson();
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.json"));
//
//            Type listType = new TypeToken<ArrayList<SchoolClass>>(){}.getType();
//            this.klassen = gson.fromJson(bufferedReader, listType);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


    }


    private void desSettings() {
//        Gson gson = new Gson();
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("settings.json"));
//
////            Type listType = new TypeToken<ArrayList<Settings>>(){}.getType();
//            this.settings = gson.fromJson(bufferedReader, Settings.class);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }

    private void hideContainer() {
        this.gradesController.hide();
        this.studentsController.hide();
        this.homeController.hide();
        this.settingsController.hide();
    }

    public void onNavMain(MouseEvent mouseEvent) {
        log.log(Level.INFO, mouseEvent.toString());
        this.hideContainer();
        this.homeController.show();
        this.checkVisible(this.homeController);
    }

    public void onNavStudents(MouseEvent mouseEvent) {
        log.log(Level.INFO, mouseEvent.toString());
        this.hideContainer();
        this.studentsController.show();
        this.checkVisible(this.studentsController);
    }

    public void onNavGrades(MouseEvent mouseEvent) {
        log.log(Level.INFO, mouseEvent.toString());
        this.hideContainer();
        this.gradesController.show();
        this.checkVisible(this.gradesController);
    }

    public void onNavSettings(MouseEvent mouseEvent) {
        log.log(Level.INFO, mouseEvent.toString());
        this.hideContainer();
        this.settingsController.show();
        this.checkVisible(this.settingsController);
    }

    public void onClickExitImage(MouseEvent mouseEvent) {
        ((Stage)(((ImageView)mouseEvent.getSource()).getScene().getWindow())).close();
    }

    public void onClickMinimizeImage(MouseEvent mouseEvent) {
        log.log(Level.INFO, mouseEvent.toString());
        ((Stage)(((ImageView)mouseEvent.getSource()).getScene().getWindow())).setIconified(true);
    }

    public void onClickMaximizeImage(MouseEvent mouseEvent) {
        log.log(Level.INFO, mouseEvent.toString());
//        ((Stage)(((ImageView)mouseEvent.getSource()).getScene().getWindow())).setMaximized(true);
//        ((Stage)(((ImageView)mouseEvent.getSource()).getScene().getWindow())).get
    }

    public void cbClassOnAction(ActionEvent actionEvent) {
        log.log(Level.INFO, actionEvent.toString());
        log.log(Level.INFO, this.cbClass.getSelectionModel().getSelectedItem().toString());

        SchoolClass cl = (SchoolClass) this.cbClass.getSelectionModel().getSelectedItem();
        DataHandler.getInstance().setClassSelected(cl.getClassName());

        this.updatedClass();
//        this.klasse = this.comboKlasse.getSelectionModel().getSelectedItem();
//        this.footLbl.setText(this.klasse.getClassName());
//
//        if (this.klasse.getListStudent() != null) {
//            this.listStudents.setItems(FXCollections.observableArrayList(this.klasse.getListStudent()));
//        } else {
//            this.listStudents.getItems().clear();
//        }

    }

    private void updatedClass() {
        this.studentsController.updatedClass();
        this.settingsController.updatedClass();
    }
}
