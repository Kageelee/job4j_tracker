package ru.job4j.example;

public class EscapeExample {
    public static void main(String[] args) {
        System.out.print("Первая строка\nВторая строка");
        char escape = '\"';
        System.out.println(escape);
        String string = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(string);
        String string1 = "C:\\projects\\job4j\\File.java";
        System.out.println(string1);
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");
        System.out.println("Job4jjj\b\b");

    }
}