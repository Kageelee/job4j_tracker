package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Колёсный");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Вместимость: " + count);
    }

    @Override
    public int refuel(int fuel) {
        return fuel * 70;
    }
}
