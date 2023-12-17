package org.javaacadmey.wonderfield;

import java.util.Scanner;
import org.javaacadmey.wonderfield.player.Player;


public class Game {

    public static final int PLAYERS_COUNT = 3;
    public static final int ROUNDS_COUNT = 4;
    public static final int GROUP_ROUNDS = 3;
    public static final int FINAL_ROUND_INDEX = 3;
    public static Scanner scanner = new Scanner(System.in);
    static String[] question = new String[ROUNDS_COUNT];
    static String[] answer = new String[ROUNDS_COUNT];

    //Временный метод для создания массивов с вопросами
    public void tempInit() {
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.");
        question[0] = "Какое существо может задержать дыхание на 6 суток?";
        question[1] = "Какое животное имеет 3 глаза?";
        question[2] = "Какая страна не имеет столицы?";
        question[3] = "Какая гора ежедневно меняет свой цвет?";
        answer[0] = "скорпион";
        answer[1] = "туатара";
        answer[2] = "науру";
        answer[3] = "айерс рок";
        System.out.println("Иницализация закончена, игра начнется через 0,5 секунд");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n".repeat(50));
        Tableau tableau = new Tableau(answer[0]);
        System.out.println("__________________________");
        System.out.println(tableau.getRightAnswer());
        System.out.println(tableau.showLetters());
        System.out.println("__________________________");
        tableau.setRightAnswer(answer[1]);
        System.out.println(tableau.getRightAnswer());
        System.out.println(tableau.showLetters());
        System.out.println("__________________________");
        Player player = new Player("Вася", "Питер");
        player.playerMove();
    }

    // Метод инициализации игры и ручным вводом вопросов и ответов
    public void init() {
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре."
                + "Вам нужно ввести вопросы и ответы для игры.");
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            System.out.println("Введите вопрос #" + (i + 1));
            question[i] = scanner.nextLine();
            System.out.println("Введите ответ вопрос #" + (i + 1));
            answer[i] = scanner.nextLine();
        }
        System.out.println("Иницализация закончена, игра начнется через 5 секунд");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n".repeat(50));
    }
}