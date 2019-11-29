package com.example.gameboi.MathGame;

public interface Gameable {
    int getLives();
    String getPlayerIcon();
    int getScore();
    int getMultiplier();
    boolean isGameOver();
    boolean isWinner();
}
