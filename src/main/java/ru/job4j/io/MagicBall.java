package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String orakul;
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                orakul = "Да";
                break;
            case 1:
                orakul = "Нет";
                break;
            default:
                orakul = "Может быть";
                break;
        }
        System.out.println(orakul);
    }
}
