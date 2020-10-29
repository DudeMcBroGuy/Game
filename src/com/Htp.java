package com;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Htp implements Initializable {
    @FXML public Rectangle u;
    @FXML public Rectangle d;
    @FXML public Rectangle l;
    @FXML public Rectangle r;
    @FXML public Rectangle f;
    @FXML public Rectangle b;
    @FXML public Button back;
    public Stage stage;

    // KeyEvent Handler
    public void setOnKeyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case W -> f.setFill(Color.rgb(67, 67, 67));
            case S -> b.setFill(Color.rgb(67, 67, 67));
            case A -> l.setFill(Color.rgb(67, 67, 67));
            case D -> r.setFill(Color.rgb(67, 67, 67));
            case I -> u.setFill(Color.rgb(67, 67, 67));
            case K -> d.setFill(Color.rgb(67, 67, 67));
        }
    }

    // KeyEvent Handler
    public void setOnKeyReleased(KeyEvent event) {
        switch (event.getCode()) {
            case W -> f.setFill(Color.rgb(175, 175, 175));
            case S -> b.setFill(Color.rgb(175, 175, 175));
            case A -> l.setFill(Color.rgb(175, 175, 175));
            case D -> r.setFill(Color.rgb(175, 175, 175));
            case I -> u.setFill(Color.rgb(175, 175, 175));
            case K -> d.setFill(Color.rgb(175, 175, 175));
        }
    }

    // Back Button Handler
    public void backButtonHandler(ActionEvent event) {
        // Get window
        stage = (Stage) back.getScene().getWindow();

        // Load FXML File
        FXMLLoad load = new FXMLLoad();
        AnchorPane root = load.getView("main");

        // Display Scene on Window
        stage.setScene(new Scene(root));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

}
