package com.example;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.beans.value.*;


public class PickHorseWindow {

    private static String pickedHorseToWin = "";

    public static void display() throws FileNotFoundException {
        
        Stage popupwindow = new Stage();
            
        popupwindow.initModality(Modality.APPLICATION_MODAL);
        popupwindow.setTitle("Pick Horses");   

        final ToggleGroup horseGroup = new ToggleGroup();
        HBox layout = new HBox();

        VBox left = new VBox();
        Label label = new Label("Pick your horse: ");
        
        ImageView imageV = new ImageView();


        RadioButton h1b = new RadioButton("Sunset in Mykonos");
        h1b.setToggleGroup(horseGroup);
        RadioButton h2b = new RadioButton("California Flags");
        // Image h2i = new Image(getClass().getResourceAsStream("../../../../../resources/racehorse.png"));
        // h2b.setGraphic(new ImageView(h2i));
        h2b.setToggleGroup(horseGroup);
        RadioButton h3b = new RadioButton("Green Picker");
        // Image h3i = new Image(getClass().getResourceAsStream("../../../../../resources/racehorse.png"));
        // h3b.setGraphic(new ImageView(h3i));
        h3b.setToggleGroup(horseGroup);
        RadioButton h4b = new RadioButton("Sherri Supernova");
        // Image h4i = new Image(getClass().getResourceAsStream("../../../../../resources/racehorse.png"));
        // h4b.setGraphic(new ImageView(h4i));
        h4b.setToggleGroup(horseGroup);
        RadioButton h5b = new RadioButton("Crossbow Crazy");
        h5b.setToggleGroup(horseGroup);

        // add a change listener
        horseGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() 
        {
            public void changed(ObservableValue<? extends Toggle> ob, 
                                                    Toggle o, Toggle n)
            {
  
                RadioButton rb = (RadioButton)horseGroup.getSelectedToggle();
  
                if (rb != null) {
                    // picks horse to win
                    setPickedHorse(rb.getText());
                    final Image image = new Image(rb.getText() + ".png", 100, 100, false, false);

                    imageV.setImage(image);
                }
            }
        });

        VBox horseGroupRoot = new VBox();
        horseGroupRoot.setPadding(new Insets(10));
        horseGroupRoot.setAlignment(Pos.BASELINE_RIGHT);
        left.getChildren().addAll(label, imageV);
        left.setAlignment(Pos.BASELINE_LEFT);

        horseGroupRoot.getChildren().addAll(h1b,h2b,h3b,h4b,h5b);
            
        horseGroupRoot.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(left, horseGroupRoot);
            
        Scene pickingScene = new Scene(layout, 500, 350);
            
        popupwindow.setScene(pickingScene);
            
        popupwindow.showAndWait();
            
    }

    static void setPickedHorse(String horse) {
        pickedHorseToWin = horse;
    }

    static String getPickedHorse() {
        return pickedHorseToWin;
    }
}
