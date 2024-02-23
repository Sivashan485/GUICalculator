package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class Main extends Application {
    private final static String applicationInstruction = "Welcome to our application! With this software, you can efficiently manage and store your\n calculations directly on your Personal Computer.";
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = setWelcomeLabel("WELCOME", Color.web("blue"), Color.web("black"));
        Label instructionLabel = createLabel(applicationInstruction, 10, 250);
        Label results = createLabel("RESULTS: ", 10, 150);

        TextField firstEntryField = createEntryField(10,100);
        TextField secondEntryField = createEntryField(100,100);




        Button addButton = createButton("PLUS", 300,100);
        Button minusButton = createButton("MINUS", 300,150);

        Button selectFile = createButton("Open File", 400,100);
        Button saveFile = createButton("Save File", 400,150);


        //Create root node
        Group root = new Group();

        //Add label to the scene graph
        root.getChildren().add(label);
        root.getChildren().add(firstEntryField);
        root.getChildren().add(secondEntryField);
        root.getChildren().add(addButton);
        root.getChildren().add(minusButton);
        root.getChildren().add(selectFile);
        root.getChildren().add(saveFile);
        root.getChildren().add(instructionLabel);
        root.getChildren().add(results);

        //Create scene with root node with size
        Scene scene = new Scene(root, 600, 300);

        scene.setFill(new LinearGradient(
                0, 0, 1, 1, true,                      //sizing
                CycleMethod.NO_CYCLE,                  //cycling
                new Stop(0, Color.web("#81c483")),     //colors
                new Stop(1, Color.web("#fcc200")))
        );


        //Set stage properties
        primaryStage.setTitle("My first calculator in JavaFX");
        //Add scene to the stage and make it visible
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Label createLabel(String text, int positionX, int positionY){
        Label label = new Label();
        label.setText(text);
        label.setLayoutX(positionX);
        label.setLayoutY(positionY);
        label.setMaxWidth(600);
        return label;
    }

    private Label setWelcomeLabel(String text, Color colorA, Color colorB){
        Label label = new Label(text);
        label.setTextFill(new LinearGradient(
                0, 0, 1, 1, true,                      //sizing
                CycleMethod.NO_CYCLE,                  //cycling
                new Stop(0, colorA),     //colors
                new Stop(1, colorB)));
        label.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
        return label;
    }

    private Button createButton(String name , int positionX, int positionY){
        Button button = new Button();
        button.setText(name);
        button.setLayoutX(positionX);
        button.setLayoutY(positionY);
        button.setMinWidth(100);

        return button;
    }

    private TextField createEntryField( int positionX, int positionY){
        TextField entryField = new TextField();
        entryField.setLayoutX(positionX);
        entryField.setLayoutY(positionY);
        entryField.setMinWidth(50);
        entryField.setMaxWidth(70);
        return entryField;
    }


    public static void main(String[] args) {
        launch(args);
    }
}