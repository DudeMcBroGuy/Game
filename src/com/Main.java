package com;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load FXML File
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));

        // Set Window Fields
        primaryStage.setTitle("Game");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
            launch(args);
    }
}
