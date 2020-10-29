package com;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML public Button play;
    @FXML public Button htp;
    @FXML public Button quit;
    public Stage stage;

    // Play Button Event Handler
    public void playButtonHandler(ActionEvent event) {
        // Set stage
        stage = (Stage) play.getScene().getWindow();

        // Load FXML File
        FXMLLoad load = new FXMLLoad();
        AnchorPane root = load.getView("levelOne");

        // Display Scene on Window
        stage.setScene(new Scene(root));
    }

    // HowToPlay Button Event Handler
    public void htpButtonHandler(ActionEvent event) {
        // Get Window
        stage = (Stage) play.getScene().getWindow();

        // Load FXML File
        FXMLLoad load = new FXMLLoad();
        AnchorPane root = load.getView("htp");

        // Display Scene on Window
        stage.setScene(new Scene(root));
    }

    // Quit Button Event Handler
    public void quitButtonHandler(ActionEvent event) {
        // Get Window
        stage = (Stage) play.getScene().getWindow();

        // Close Window
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
