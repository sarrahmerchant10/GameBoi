package com.example.gameboi.FlashColors;

import android.graphics.Color;

import com.example.gameboi.UserClasses.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*The following class is responsible for storing the user playing the FlashColorsOperations as well as the
 * score during the game and the correct color pattern and user color patterns. This class acts as
 * the back end to FlashColorsActivity.java*/
class FlashColorsOperations {

    protected User player;
    boolean isSubmitted = true; //starts as true to allow initial pattern
    ArrayList<Integer> correctPattern;
    private ArrayList<Integer> userPattern;

    FlashColorsOperations(User player) {
        this.player = player;
        userPattern = new ArrayList<>();
        correctPattern = new ArrayList<>();
    }

    ArrayList<Integer> generatePattern() {
        ArrayList<Integer> pattern = new ArrayList<>();
        pattern.add(Color.RED);
        pattern.add(Color.GREEN);
        pattern.add(Color.BLUE);
        pattern.add(Color.YELLOW);

        Collections.shuffle(pattern);
        correctPattern = pattern;
        System.out.println(pattern);
        return pattern;
    }

    ArrayList<Integer> getCorrectPattern() {
        return correctPattern;
    }

    boolean isCorrect() {
        return correctPattern.equals(userPattern);
    }

    void addColour(int colour){
        userPattern.add(colour);
    }

    void clearPattern(){
        userPattern.clear();
    }

    boolean IsSubmitted() {
        return isSubmitted;
    }

    void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }

    /*This method is responsible for grabbing the current score, increasing its value by 1 and
     * returning a new charsequence*/
    int getNewScore(CharSequence c) {
        CharSequence newScore;
        int score = Integer.parseInt(c.toString());
        score++;
        //setScore(score); //store the score of the game for an user
        return score;
    }

    ArrayList<Integer> DisplayColors(){
        ArrayList<Integer> pattern;
        if(isSubmitted){
            setSubmitted(false);
            pattern = generatePattern();
            return pattern;
        }
        pattern = getCorrectPattern();
        System.out.println("IM ON NORMAL GENERATE");
        return pattern;

    }

    boolean checkHidden(){
        if(player.getDifficulty().equals("Normal")){
            ArrayList<Integer> special = new ArrayList<>(Arrays.asList(Color.BLUE,Color.RED,Color.GREEN,Color.YELLOW));
            return userPattern.equals(special);
        }
        ArrayList<Integer> special = new ArrayList<>(Arrays.asList(Color.BLUE,Color.WHITE,Color.RED,
                Color.GREEN,Color.YELLOW,Color.BLACK));
        return userPattern.equals(special);
    }
}
