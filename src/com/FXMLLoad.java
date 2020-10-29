package com;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.FileNotFoundException;
import java.net.URL;

public class FXMLLoad {
    private AnchorPane pane;

    public AnchorPane getView(String fileName) {
        try {
            URL url = Main.class.getResource("/com/" + fileName + ".fxml");
            if (url == null)
                throw new FileNotFoundException("FXML file " + fileName + " cannot be found");

            pane = new FXMLLoader().load(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pane;
    }
}
