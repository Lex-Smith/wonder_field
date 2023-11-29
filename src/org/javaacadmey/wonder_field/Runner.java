package org.javaacadmey.wonder_field;

import java.util.SortedMap;

public class Runner {

    public static void main(String[] args) {
        Game.tempInit();

        for (int i = 0; i < Game.question.length; i++) {
            System.out.println("Вопрос - " + Game.question[i]);
            System.out.println("Ответ - " + Game.answer[i]);
            System.out.println("-----");

        }


    }
}
