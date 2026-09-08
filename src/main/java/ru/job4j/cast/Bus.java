package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус двигается по скоростным трассам.");
    }

    @Override
    public void capacity() {
        System.out.println("Вместимость автобуса: от 30 до 100 пассажиров.");
    }
}