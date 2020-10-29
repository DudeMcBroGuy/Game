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
    @FXML public Stage stage;
    @FXML public Rectangle u;
    @FXML public Rectangle d;
    @FXML public Rectangle l;
    @FXML public Rectangle r;
    @FXML public Rectangle f;
    @FXML public Rectangle b;
    @FXML public Button back;


    @FXML public void setOnKeyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case W: u.setFill(Color.rgb(67, 67, 67)); break;
            case S: d.setFill(Color.rgb(67, 67, 67)); break;
            case A: l.setFill(Color.rgb(67, 67, 67)); break;
            case D: r.setFill(Color.rgb(67, 67, 67)); break;
            case UP: f.setFill(Color.rgb(67, 67, 67)); break;
            case DOWN: b.setFill(Color.rgb(67, 67, 67)); break;
        }
    }

    @FXML public void setOnKeyReleased(KeyEvent event) {
        switch (event.getCode()) {
            case W: u.setFill(Color.rgb(175, 175, 175)); break;
            case S: d.setFill(Color.rgb(175, 175, 175)); break;
            case A: l.setFill(Color.rgb(175, 175, 175)); break;
            case D: r.setFill(Color.rgb(175, 175, 175)); break;
            case UP: f.setFill(Color.rgb(175, 175, 175)); break;
            case DOWN: b.setFill(Color.rgb(175, 175, 175)); break;
        }
    }

    @FXML public void backButtonHandler(ActionEvent event) {
        stage = (Stage) back.getScene().getWindow();
        FXMLLoad load = new FXMLLoad();
        AnchorPane root = load.getView("main");
        stage.setScene(new Scene(root));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

}
