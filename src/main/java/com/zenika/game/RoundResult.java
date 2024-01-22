package com.zenika.game;

public class RoundResult {
    protected char[] letters;
    protected ValidationLetter[] validationLetters;

    public RoundResult(char[] letters, ValidationLetter[] validationLetters) {
        this.letters = letters;
        this.validationLetters = validationLetters;
    }

    public boolean isWin(){
        return true;
    }

    public ValidationLetter[] validationLetters(){
        return null;
    }

    public char[] letters(){
        return null;
    }
}
