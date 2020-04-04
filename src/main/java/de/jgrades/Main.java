package de.jgrades;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
public class Main extends Application {

    public static final String LANGBUNDLE = "language";
//    public static final String FXMLRESOURCE = "/de/jgrades/resources/noten.fxml";
    public static final String FXMLRESOURCE = "/jgrades.fxml";
    public static final String TITLE = "title";
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 800;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        //Systemsprache holen

        Locale loc = Locale.getDefault();

        loadView(loc, primaryStage);
    }


    private void loadView(Locale locale, Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXMLRESOURCE));
        ResourceBundle bundle = ResourceBundle.getBundle(LANGBUNDLE, locale);

        fxmlLoader.setResources(bundle);

//        Parent root = (Parent) fxmlLoader.load(this.getClass().getResource(FXMLRESOURCE).openStream());
        //fxmlLoader.setLocation(getClass().getResource(FXMLRESOURCE));
        //fxmlLoader.setController(new Controller());
        Parent root =  fxmlLoader.load();

        primaryStage.setTitle(bundle.getString(TITLE));

        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));

        primaryStage.show();
    }
}
