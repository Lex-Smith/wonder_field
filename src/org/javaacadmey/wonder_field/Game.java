package org.javaacadmey.wonder_field;
import java.util.Scanner;

public class Game {

    public final static int PLAYERS_COUNT = 3;
    public final static int ROUNDS_COUNT = 4;
    public final static int GROUP_ROUNDS = 3;
    public final static int FINAL_ROUND_INDEX = 3;
    static Scanner scanner = new Scanner(System.in);
    static String[] question = new String[ROUNDS_COUNT];
    static String[] answer = new String[ROUNDS_COUNT];

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
            System.out.println("\n".repeat(50));
    }

    // Метод инициализации игры и ручным вводом вопросов и ответов
    static void init() {
        System.out.println("Запуск игры \"Поле Чудес\" - подготовка к игре. Вам нужно ввести вопросы и ответы для игры.");
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