package ru.job4j.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle smallPlane = new Airplane();
        Vehicle expressTrain = new Train();
        Vehicle[] vehicles = new Vehicle[]{airplane, train, bus, smallPlane, expressTrain};

        for (Vehicle vehicle : vehicles) {
            System.out.println("==== " + vehicle.getClass().getSimpleName() + " ====");
            vehicle.capacity();
            vehicle.move();
            System.out.println(); // пустая строка для разделения
        }
    }
}