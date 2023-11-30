package org.javaacadmey.wonder_field;

import java.util.Scanner;

public class Game {

    final static int PLAYERSCOUNT = 3;
    final static int ROUNDSCOUNT = 4;
    final static int GROUPROUNDS = 3;
    final static int FINALROUNDINDEX = 3;

    static String scan;

    static Scanner scanner = new Scanner(System.in);

    static String[] question = new String[ROUNDSCOUNT];
    static String[] answer = new String[ROUNDSCOUNT];

    //Временный метод для создания массивов с вопросами
    static void tempInit() {

        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре.");

        question[0] = "Какое существо может задержать дыхание на 6 суток?";
        question[1] = "Какое животное имеет 3 глаза?";
        question[2] = "Какая страна не имеет столицы?";
        question[3] = "Какая гора ежедневно меняет свой цвет?";
        answer[0] = "скорпион";
        answer[1] = "туатара";
        answer[2] = "науру";
        answer[3] = "айерс рок";

        System.out.println("Иницализация закончена, игра начнется через 5 секунд");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    // Метод инициализации игры и ручным вводом вопросов и ответов
    static void init() {

        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре. Вам нужно ввести вопросы и ответы для игры.");

        for (int i = 0; i < ROUNDSCOUNT; i++) {

            System.out.println("Введите вопрос #" + (i + 1));
            scan = scanner.nextLine();
            question[i] = scan;
            System.out.println("Введите ответ вопрос #" + (i + 1));
            scan = scanner.nextLine();
            answer[i] = scan;
        }

        System.out.println("Иницализация закончена, игра начнется через 5 секунд");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}