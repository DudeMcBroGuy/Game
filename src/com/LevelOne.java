package com;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Sphere;

import java.net.URL;
import java.util.ResourceBundle;

public class LevelOne implements Initializable {
    @FXML public AnchorPane levelOneScene;
    @FXML public Sphere player;
    public double playerZ;

    @FXML public void setOnKeyPressed(KeyEvent event) {
        playerZ = player.getTranslateZ();
        if (event.getCode() == KeyCode.W)
            System.out.println("yeetus");
        switch (event.getCode()) {
            case W: System.out.println("yeet");//playerZ += 5; break;
            case S: System.out.println("yeet");//playerZ += 5; break;
            case A: System.out.println("yeet");//playerZ += 5; break;
            case D: System.out.println("yeet");//playerZ += 5; break;
            case UP: System.out.println("yeet");//playerZ += 5; break;
            case DOWN: System.out.println("yeet");//playerZ += 5; break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
