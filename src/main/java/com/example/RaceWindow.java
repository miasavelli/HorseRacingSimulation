package com.example;

import javafx.event.EventHandler;
import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Popup;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.*;
import javafx.animation.AnimationTimer;

public class RaceWindow {

    //  Button playAgain = new Button("Play Again!");

    //  // setup scene2
    //  VBox playScene = new VBox(playAgain); 
    //  Scene scene2 = new Scene(playScene, 1200, 700);
    //  scene2.setFill(Color.BLACK);
     
    //  // switches to scene2 when play is clicked
    //  play.setOnAction(e -> stage.setScene(scene2));

    //  // play again button action
    //  playAgain.setOnAction(e -> {
    //      stage.setScene(scene);
    //      //initialize here
    //      start(stage);
    //  });


    //  // setup stage
    //  stage.setTitle("Horse Racing");
    //  stage.setScene(scene);
    //  stage.setOnCloseRequest(event -> Platform.exit());
    //  stage.sizeToScene();
    //  stage.show();
    //  Screen screen = Screen.getPrimary();
    //  Rectangle2D bounds = screen.getVisualBounds();

    //  stage.setX(bounds.getMinX());
    //  stage.setY(bounds.getMinY());
    //  stage.setWidth(bounds.getWidth());
    //  stage.setHeight(bounds.getHeight());
     
     BackgroundSize backgroundSize = new BackgroundSize(10, 10, false, false, true, true);

     //sets background image on scene2
     Image img = new Image("file:resources/bbbb.jpg");
     BackgroundImage bImg = new BackgroundImage(img,
         BackgroundRepeat.REPEAT,
         BackgroundRepeat.NO_REPEAT,
         BackgroundPosition.DEFAULT,
         backgroundSize);

     Background bGround = new Background(bImg);
    //  playScene.setBackground(bGround);

    //  game.play();
}