package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic engTo = new DummyDic();
        String englishWord = "across";
        String result = engTo.engToRus(englishWord);
        System.out.println(result);
    }
}
