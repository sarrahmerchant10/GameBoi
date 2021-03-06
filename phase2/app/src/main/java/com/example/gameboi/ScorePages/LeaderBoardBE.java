package com.example.gameboi.ScorePages;

import android.util.Pair;

import com.example.gameboi.FileSystem.FileManager;
import com.example.gameboi.UserClasses.User;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Backend class for Leaderboard that calculates all values needed for displaying on Leaderboard
 */
class LeaderBoardBE {

    /**
     * A list to store all users playing the game.
     */
    private ArrayList<User> users;

    /**
     * Stores an ordered list of users based on their high scores
     */
    ArrayList orderedHighscorelist;

    /**
     * Stores an ordered list of users based on their current scores
     */
    ArrayList orderedScorelist;

    /**
     * Stores an ordered list of users based on their multipliers
     */
    ArrayList orderedMultiplierlist;

    /**
     * Stores an ordered list of users based on their lives
     */
    ArrayList orderedLiveslist;

    /**
     * Initializes the file and users list
     */
    LeaderBoardBE(FileManager fileM) {
        users = fileM.getUsers();
        getAllvalues();

    }

    /**
     * Sorts items in listTosort and returns a sorted list
     */
    private ArrayList sortList(ArrayList<Pair> listTosort) {

        // Creating temporary list so that pairs can be removed
        ArrayList<Pair> tempList = new ArrayList<>(listTosort);

        //creating a temporary first player
        Pair firstPlacepair = tempList.get(0);

        //Looping to find pair with largest value
        for (Pair pair : listTosort) {
            if ((int) pair.second >= (int) firstPlacepair.second) {
                firstPlacepair = pair;
            }
        }

        // Removing the player in first place from the list
        tempList.remove(firstPlacepair);

        Pair lastPlacepair = tempList.get(0);


        // Looping to find player with smallest value
        for (Pair pair : tempList) {
            if ((int) pair.second <= (int) lastPlacepair.second) {
                lastPlacepair = pair;
            }
        }

        //Removing player in last place from tempList
        tempList.remove(lastPlacepair);

        int secondPlace = (int) tempList.get(0).second;
        User userSecondplace = (User) tempList.get(0).first;


        Pair p1 = new Pair<>((User) firstPlacepair.first, (int) firstPlacepair.second);
        Pair p2 = new Pair<>(userSecondplace, secondPlace);
        Pair p3 = new Pair<>((User) lastPlacepair.first, (int) lastPlacepair.second);

        // Returning sorted list
        return new ArrayList<>(Arrays.asList(p1, p2, p3));

    }

    /**
     * Method that obtains all values of users needed for leaderboard and stores them in sorted lists
     */
    private void getAllvalues() {

        ArrayList<Pair> tempHighscorelist = new ArrayList<>();
        ArrayList<Pair> tempMultiplierlist = new ArrayList<>();
        ArrayList<Pair> tempLiveslist = new ArrayList<>();
        ArrayList<Pair> tempScorelist = new ArrayList<>();


        for (User user : users) {
            Pair<User, Integer> pair1 = new Pair<>(user, user.getHighScore());
            tempHighscorelist.add(pair1);

            Pair<User, Integer> pair2 = new Pair<>(user, user.getMultiplier());
            tempMultiplierlist.add(pair2);

            Pair<User, Integer> pair3 = new Pair<>(user, user.getLives());
            tempLiveslist.add(pair3);

            Pair<User, Integer> pair4 = new Pair<>(user, user.getPoints());
            tempScorelist.add(pair4);

        }

        orderedHighscorelist = sortList(tempHighscorelist);
        orderedMultiplierlist = sortList(tempMultiplierlist);
        orderedLiveslist = sortList(tempLiveslist);
        orderedScorelist = sortList(tempScorelist);

    }

}
