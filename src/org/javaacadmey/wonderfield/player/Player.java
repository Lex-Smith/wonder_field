package org.javaacadmey.wonderfield.player;

import org.javaacadmey.wonderfield.Game;

public class Player {

    private final String name;
    private final String city;

    public Player(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String sayLetter(String spokenLetter) {
        boolean isCyrillicLetter = false;
        while (!isCyrillicLetter) {
            String regex = "[а-яА-Я]";
            if (spokenLetter.matches(regex)) {
                System.out.printf("Игрок %s: буква %s\n", name, spokenLetter);
                isCyrillicLetter = true;
            } else {
                System.out.println("Ошибка! это не русская буква, введите русскую букву.");
            }
        }
        return spokenLetter;
    }

    public String sayWord(String spokenWord) {
        boolean isCyrillicLetter = false;
        while (!isCyrillicLetter) {
            String regex = "[а-яА-Я]+(\\s|-)?[а-яА-Я]*";
            if (spokenWord.matches(regex)) {
                System.out.printf("Игрок %s: слово %s\n", name, spokenWord);
                isCyrillicLetter = true;
            } else {
                System.out.println("Ошибка! это не слово на русском, введите слово на русском");
            }
        }
        return spokenWord;
    }

    public String playerMove() {
        System.out.printf("Ход игрока %s, город %s\n", name, city);
        System.out.println("Если хотите букву нажмите 'б' и enter, если хотите слово нажмите 'c' и enter");
        PlayerAnswer playerAnswer = new PlayerAnswer();
        boolean rightLetter = false;
        while (!rightLetter) {
            playerAnswer.setAnswerType(Game.scanner.next().charAt(0));
            if (playerAnswer.getAnswerType() == 'б') {
                playerAnswer.setPlayerAnswer(sayLetter(Game.scanner.next()));
                rightLetter = true;
            } else if (playerAnswer.getAnswerType() == 'с') {
                playerAnswer.setPlayerAnswer(sayWord(Game.scanner.next()));
                rightLetter = true;
            } else {
                System.out.println("Некорректное значение, введите 'б' или 'с'");
            }
        }
        return playerAnswer.getPlayerAnswer();
    }
}