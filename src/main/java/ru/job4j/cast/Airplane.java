package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит по воздуху.");
    }

    @Override
    public void capacity() {
        System.out.println("Вместимость самолета: от 50 до 850 пассажиров.");
    }
}