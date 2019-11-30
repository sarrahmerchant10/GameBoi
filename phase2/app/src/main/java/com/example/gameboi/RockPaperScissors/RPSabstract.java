package com.example.gameboi.RockPaperScissors;

import com.example.gameboi.MathGame.GameFacade;
import com.example.gameboi.UserClasses.User;

import java.util.HashMap;

public abstract class RPSabstract extends GameFacade {

    static int winsRpS = 0;
    static int lossesRpS = 0;

    RPSabstract(User player) {
        super(player);
    }

    abstract HashMap buildMap();

    abstract String[] RpSGamePlayed(String playerValue);

    String[] checker(String userchoice, String compchoice) {
        String[] array;
        if (lossesRpS == 2) {
            lossesRpS = 0;
            winsRpS = 0;
            if (getPlayer().getLives() == 1) {
                winner = false;
                array = new String[] {userchoice, compchoice, "FlashLoss"};
            } else {
                winner = true;
                array = new String[] {userchoice, compchoice, "FlashWin"};
            }
        } else if (winsRpS == 3) {
            winsRpS = 0;
            lossesRpS = 0;
            array = new String[] {userchoice, compchoice, "FlashWin"};
        } else {
            array = new String[] {userchoice, compchoice, "Round"};
        }
        return array;
    }

}
