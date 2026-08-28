package ru.job4j.oop;

public class Max {

    public int max(int left, int right) {
        return left > right ? left : right;
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }

    public static void main(String[] args) {
        Max maximum = new Max();
        int result2 = maximum.max(10, 5);
        System.out.println("Максимум из 10, 5: " + result2);
        int result3 = maximum.max(10, 5, 25);
        System.out.println("Максимум из 10, 5, 25: " + result3);
        int result4 = maximum.max(10, 5, 25, 30);
        System.out.println("Максимум из 10, 5, 25, 30: " + result4);
    }
}
