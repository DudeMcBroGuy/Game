package com;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML public Button play;
    @FXML public Button htp;
    @FXML public Button quit;
    @FXML public Stage stage;
    @FXML public Scene levelOnescene;
    @FXML public PerspectiveCamera camera;
    @FXML public PhongMaterial material;
    @FXML public Sphere player;
    @FXML public AmbientLight light;
    @FXML public PointLight light2;

    @FXML public void playButtonHandler(ActionEvent event) {
        stage = (Stage) play.getScene().getWindow();
        FXMLLoad load = new FXMLLoad();
        AnchorPane root = load.getView("levelOne");
        levelOnescene = new Scene(root);
        stage.setScene(levelOnescene);

        player = new Sphere();
        material = new PhongMaterial();
        material.setDiffuseColor(Color.BLUE);
        material.setSpecularColor(Color.LIGHTBLUE);
        material.setSpecularPower(10.0);
        player.setMaterial(material);

        AmbientLight light=new AmbientLight(Color.AQUA);
        light.setTranslateX(-180);
        light.setTranslateY(-90);
        light.setTranslateZ(-120);
        light.getScope().add(player);

        PointLight light2=new PointLight(Color.AQUA);
        light2.setTranslateX(180);
        light2.setTranslateY(190);
        light2.setTranslateZ(180);
        light2.getScope().add(player);

        Group group = new Group(player);
        group.getChildren().addAll(light,light2);

        levelOnescene.setFill(Color.BLACK);
        camera = new PerspectiveCamera();
        camera.setNearClip(0.1);
        camera.setFarClip(1000.0);
        levelOnescene.setCamera(camera);
    }

    @FXML public void htpButtonHandler(ActionEvent event) {
        stage = (Stage) play.getScene().getWindow();
        FXMLLoad load = new FXMLLoad();
        AnchorPane root = load.getView("htp");
        stage.setScene(new Scene(root));
    }

    @FXML public void quitButtonHandler(ActionEvent event) {
        stage = (Stage) play.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
