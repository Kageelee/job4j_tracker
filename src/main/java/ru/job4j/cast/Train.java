package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд передвигается по рельсам.");
    }

    @Override
    public void capacity() {
        System.out.println("Вместимость поезда: до 1000 пассажиров в зависимости от количества вагонов.");
    }
}