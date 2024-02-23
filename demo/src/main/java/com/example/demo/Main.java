package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Hi Welcome");
        TextField textfield = new TextField();

        textfield.setLayoutX(21);
        textfield.setLayoutY(20);
        //Create root node
        Group root = new Group();
        //Add label to the scene graph
        root.getChildren().add(label);
        root.getChildren().add(textfield);
        //Create scene with root node with size
        Scene scene = new Scene(root, 600, 300);
        //Set stage properties
        primaryStage.setTitle("My first calculator in JavaFX");
        //Add scene to the stage and make it visible
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}