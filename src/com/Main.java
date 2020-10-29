package com;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application implements Runnable {

    public boolean running;
    private Thread gameThread;

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Load FXML File
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));

        // Set Window Fields
        primaryStage.setTitle("Game");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        // Start game loop
        running = true;
        gameThread = new Thread(this,"Game Thread");
        gameThread.start();
    }

    public synchronized void run() {
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        final double ns = 1000000000.0 / 144.0; // Set frame rate
        double delta = 0;
        int frames = 0; // How many frames are being rendered a second
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                update();
                delta--;
            }
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames); // Print fps to console
                frames = 0;
            }
        }
        stop();
    }

    public synchronized void stop() {
        running = false;
        try {
            gameThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void update() {

    }

    public static void main(String[] args) {
        launch(args);
    }
}