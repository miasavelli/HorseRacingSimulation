package com.example;

import java.util.BitSet;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.geometry.Bounds;
import javafx.geometry.BoundingBox;
import javafx.scene.layout.Region;
import javafx.util.Duration;

/**
 * An abstract parent class for simple games.
 */
public abstract class Game extends Region {

    private final Bounds bounds;                       // game bounds
    private final Duration fpsTarget;                  // target duration for game loop
    private final Timeline loop = new Timeline();      // timeline for main game loop
    private final BitSet keysPressed = new BitSet();   // set of currently pressed keys

    private boolean initialized = false;               // play() has been called

    /**
     * Construct a {@code Game} object.
     * @param width minimum game region width
     * @param height minimum game region height
     * @param fps target frames per second (FPS)
     */
    public Game(int width, int height, int fps) {
        super();
        setMinWidth(width);
        setMinHeight(height);
        this.bounds = new BoundingBox(0, 0, width, height);
        this.fpsTarget = Duration.millis(1000.0 / fps);
        initGameLoop();
    } // Game

    /**
     * Initialize the main game loop.
     */
    private void initGameLoop() {
        KeyFrame updateFrame = new KeyFrame(fpsTarget, event -> {
            requestFocus();
            update();
        });
        loop.setCycleCount(Timeline.INDEFINITE);
        loop.getKeyFrames().add(updateFrame);
    } //initGameLoop

    /**
     * Initialize the game. A game may override this method to perform initialization
     * that needs to happen prior to the main game loop. The {@link #play} method
     * will attempt to call this method only once. The implementation of this method
     * provided by the {@code Game} class does nothing.
     */
    protected void init() {}

    /**
     * Perform one iteration of the main game loop.
     */
    protected abstract void update();

    /**
     * Setup and start the main game loop.
     */
    public final void play() {
        if (!initialized) {
            init();
            initialized = true;
        } // if
        loop.play();

    } // start

    /**
     * Stop the main game loop.
     */
    public final void stop() {
        loop.stop();
    } // stop

    /**
     * Pause the main game loop.
     */
    public final void pause() {
        loop.pause();
    } // pause

    /**
     * Get the bounds for this game that were specified when it was constructed.
     * @return bounds for this game
     */
    public final Bounds getGameBounds() {
        return bounds;
    } // getGameBounds

} //Game
