package org.javaacadmey.wonderfield;

import java.util.Arrays;
import java.util.Locale;

public class Tableau {

    private char[] rightAnswer;
    private char[] lettersOnTableau;

    public Tableau(String answer) {
        this.rightAnswer = answer.toCharArray();
        tableauInit();
    }

    public void setRightAnswer(String answer) {
        this.rightAnswer = answer.toCharArray();
        tableauInit();
    }

    public char[] getRightAnswer() {
        return rightAnswer;
    }

    public void tableauInit() {
        char[] tableau = new char[rightAnswer.length];
        Arrays.fill(tableau, '_');
        lettersOnTableau = tableau;
    }

    String showLetters() {
        String answer = new String(lettersOnTableau);
        answer = answer.toUpperCase(Locale.ROOT);
        answer = answer.replace("", " ").trim();
        return answer;
    }

    public void openLetter(char letter) {
        for (int i = 0; i < rightAnswer.length; i++) {
            if (rightAnswer[i] == letter) {
                lettersOnTableau[i] = letter;
            }
        }
    }

    public void openWord(String word) {
        char [] wordArray = word.toCharArray();
        if (Arrays.equals(wordArray, rightAnswer)) {
            lettersOnTableau = rightAnswer;
        }
    }

    public boolean containsUnsolvedLetters(String lettersOnTableau) {
        boolean containsUnsolvedLetters = false;
        if (lettersOnTableau.contains("_")) {
            containsUnsolvedLetters = true;
        }
        return containsUnsolvedLetters;
    }

    public boolean isFieldsEmpty() {
        boolean isFieldsEmpty = false;
        if (rightAnswer.length == 0 && lettersOnTableau.length == 0) {
            isFieldsEmpty = true;
        }
        return isFieldsEmpty;
    }
}