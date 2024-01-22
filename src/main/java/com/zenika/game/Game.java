package com.zenika.game;

import com.zenika.game.displayer.Displayer;

import java.util.Iterator;
import java.util.List;

public class Game {
//    protected I18n i18n;
    protected Iterator<String> scanner;
    protected Displayer displayer;
    protected String wordToGuess;
    protected List<RoundResult> roundResults;
    protected final static int NB_MAX_ROUND = 6;

    public Game(Iterator<String> scanner, Displayer displayer, String wordToGuess, List<RoundResult> roundResults) {
        this.scanner = scanner;
        this.displayer = displayer;
        this.wordToGuess = wordToGuess;
        this.roundResults = roundResults;
    }

    public List<RoundResult> play(){
        return null;
    }

    private void displayInvalidLetters(){

    }

    private void displayGameResult(){

    }

    private boolean isWin(){
        return true;
    }


}
