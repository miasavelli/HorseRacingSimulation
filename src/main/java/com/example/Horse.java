package com.example;

import java.util.Random;
import javafx.geometry.Bounds;
import javafx.scene.image.ImageView;

/** the horse class
 * handles construction of horse image & updates its speed.
 */
public class Horse extends ImageView {

    private Game game; //loop contianing the Horse
    private double dx; // change in x per update
    private double dy; // change in y per update
    private Random rng = new Random();
    boolean isWinner;

    /**
     * Constructs an {@code Horse} object.
     * @param loop parnet loop
     */
     public Horse(Game game) {
         super("file:resources/racehorse.png");
         this.setPreserveRatio(true);
         this.setFitWidth(100);
         this.setFitHeight(100);
         this.game = game;
         this.dx = 1; // each update, add 2 to x (to start)
         this.dy = 0; // each update, add 0 to y (to start)
     } // Horse

    /**
     * Update Sprite's Position.
     */
    public void update() {
        //Bounds antBounds = getBoundsInParent();
        Bounds gameBounds = game.getGameBounds();   
        
        if (getX() < 1501) {
            setX(getX() - rng.nextDouble() * 10);
        }
    } // update
} // Racehorse