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


    public void setOnKeyPressed(KeyEvent event) {
        switch (event.getCode()) {
            case W -> System.out.println("1");
            case S -> System.out.println("2");
            case A -> System.out.println("3");
            case D -> System.out.println("4");
            case I -> System.out.println("5");
            case K -> System.out.println("6");
        }
    }

    public void setOnKeyReleased(KeyEvent event) {
        switch (event.getCode()) {
            case W -> System.out.println("1");
            case S -> System.out.println("2");
            case A -> System.out.println("3");
            case D -> System.out.println("4");
            case I -> System.out.println("5");
            case K -> System.out.println("6");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
