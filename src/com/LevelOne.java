package com;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Sphere;

import java.net.URL;
import java.util.ResourceBundle;

public class LevelOne implements Initializable {
    @FXML public AnchorPane levelOneScene;
    @FXML public Sphere player;

    public void moveOnKeyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case W -> player.setTranslateZ(player.getTranslateZ() + 5);
            case S -> player.setTranslateZ(player.getTranslateZ() - 5);
            case A -> player.setTranslateX(player.getTranslateX() - 5);
            case D -> player.setTranslateX(player.getTranslateX() + 5);
            case I -> player.setTranslateY(player.getTranslateY() - 5);
            case K -> player.setTranslateY(player.getTranslateY() + 5);
        }
    }

    public void stayOnKeyReleased(KeyEvent event) {
        switch (event.getCode()) {
            case W: break;
            case S: break;
            case A: break;
            case D: break;
            case I: break;
            case K: break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    
}
