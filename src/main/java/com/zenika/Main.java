package com.zenika;

import com.zenika.game.Game;
import com.zenika.game.displayer.console.color.Color;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static String play() {
        String RESET = "\u001B[0m";
        String RED_BACKGROUND_BRIGHT ="\033[0;101m";    // RED
        String GREEN_BACKGROUND_BRIGHT ="\033[0;102m";   // GREEN
        String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";    // YELLOW
        String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";      // BLUE
        String WHITE_BG = "\u001B[47m";

        String BLACK_TEXT = "\u001B[30m";

        // Print colored text with the background to the console
//        System.out.println(RED_TEXT + BLACK_BG + "This text is red with black background.");
//        System.out.println(GREEN_TEXT + WHITE_BG + "This text is green with white background." + RESET);
//        System.out.println(YELLOW_TEXT + BLACK_BG + "This text is yellow with black background." + RESET);

        List<Character> lettersToGuess = new ArrayList<>();
        lettersToGuess.add('C');
        lettersToGuess.add('A');
        lettersToGuess.add('V');
        lettersToGuess.add('I');
        lettersToGuess.add('A');
        lettersToGuess.add('R');

        List<Character> letterGuessed = new ArrayList<>();
//        letterGuessed.add('A');
//        letterGuessed.add('A');
//        letterGuessed.add('A');
//        letterGuessed.add('A');
//        letterGuessed.add('A');
//        letterGuessed.add('A');
        letterGuessed.add('P');
        letterGuessed.add('A');
        letterGuessed.add('N');
        letterGuessed.add('A');
        letterGuessed.add('I');
        letterGuessed.add('S');

        List<Character> lettersWordStillNotFound = new ArrayList<>(lettersToGuess);
        List<String> results = new ArrayList<>();

        for (int i = 0; i < lettersToGuess.size(); i++) {
            // Cas OK
            if (lettersToGuess.get(i).equals(letterGuessed.get(i))) {
                results.add("|");
                results.add(  GREEN_BACKGROUND_BRIGHT + BLACK_TEXT + " " + letterGuessed.get(i) + " "  + RESET);
                lettersWordStillNotFound.remove(letterGuessed.get(i));
            } // Cas contient mais pas à la bonne place
            else if (lettersWordStillNotFound.contains(letterGuessed.get(i))) {
                results.add("|");
                results.add(  YELLOW_BACKGROUND_BRIGHT + BLACK_TEXT + " " + letterGuessed.get(i) + " " + RESET);
                lettersWordStillNotFound.remove(letterGuessed.get(i));
            } // lettre non présent dans le mot
            else {
                results.add("|");
                results.add( RED_BACKGROUND_BRIGHT + BLACK_TEXT + " " + letterGuessed.get(i) + " "  + RESET);
            }
        }
        results.add("|");

        results.forEach(System.out::print);
        // lettersUserInput.removeAll(lettersWordToFind);
        return null;
    }

    public static String wordle() {
        System.out.println("Essayer de deviner le mot de 6 lettres");
        Scanner scanner = new Scanner(System.in);

        String wordToGuess = "FARINE";
        final int NB_MAX_ROUND = 6;
        int nbAttempt = NB_MAX_ROUND;


        while (nbAttempt > 1) {
            System.out.println(play());
//            String attemptedWord = scanner.nextLine();
////            List<String>[] letterGuessed = attemptedWord.toCharArray();

//            System.out.println(nbAttempt-1);
//            if (attemptedWord.equalsIgnoreCase(wordToGuess)) {
//                System.out.println("Gagné");
//                break;
//            } else {
//                nbAttempt--;
//                System.out.println("T'es nul !");
//            }
        }
        return null;
    }
    public static void main(String[] args) {
//        System.out.println(wordle());
        System.out.println(play());

    }
}