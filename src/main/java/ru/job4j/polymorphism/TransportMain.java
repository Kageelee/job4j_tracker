package ru.job4j.polymorphism;

public class TransportMain {
    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.move();
        bus.passengers(43);
        System.out.println("Стоимость заправки: " + bus.refuel(300));
    }
}
