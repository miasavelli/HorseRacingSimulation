package com.example;

import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.*;
import javafx.animation.AnimationTimer;

public class PrimaryController extends Application{

    AnimationTimer gameLoop;
    int score;

    public PrimaryController() {}

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        Button placeBets = new Button("Place your bets!");
        placeBets.setAlignment(Pos.BOTTOM_CENTER);
      
        placeBets.setOnAction(e -> {
            try {
                PickHorseWindow.display();
            } catch (FileNotFoundException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });

        BackgroundSize backgroundSize = new BackgroundSize(10, 10, false, false, true, true);
        Image img = new Image("GamePage.png");
        BackgroundImage mainImg = new BackgroundImage(img,
                                        BackgroundRepeat.REPEAT,
                                        BackgroundRepeat.NO_REPEAT,
                                        BackgroundPosition.DEFAULT,
                                        backgroundSize);
        Background bGround = new Background(mainImg);
        root.setBackground(bGround);


        root.getChildren().add(placeBets);
        Scene scene = new Scene(root, 1100, 600);
        stage.setScene(scene);
        stage.show();

    }

}
