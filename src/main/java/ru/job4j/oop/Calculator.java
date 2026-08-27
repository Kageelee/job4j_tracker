package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int a) {
        return a / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int a) {
        a = sum(a) + minus(a) + multiply(a) + divide(a);
        return a;
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int result2 = minus(10);
        System.out.println(result2);
        Calculator calculator = new Calculator();
        int result3 = calculator.divide(10);
        System.out.println(result3);
        int result4 = calculator.multiply(10);
        System.out.println(result4);
        int result5 = calculator.sumAllOperation(10);
        System.out.println(result5);
    }
}