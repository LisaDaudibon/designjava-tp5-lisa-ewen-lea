package com.zenika.game;

import java.util.Iterator;

public class Round {
    // protected  I18n i18n;
    protected Iterator<String> scanner;
    protected String wordToGuess;

    public Round(Iterator<String> scanner, String wordToGuess) {
        this.scanner = scanner;
        this.wordToGuess = wordToGuess;
    }

    public RoundResult play(){
        return null;
    }
}
