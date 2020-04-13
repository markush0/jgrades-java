package de.jgrades;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class ContollerParent {
    @FXML
    private AnchorPane hCont;

    private boolean visible = false;

    public void hide() {
        this.hCont.setVisible(false);
        visible = false;
    }

    public void show() {
        this.hCont.setVisible(true);
        visible = true;
    }

    public boolean isVisible() {
        return visible;
    }

    public void updatedClass() {
    }
}
