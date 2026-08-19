package ru.job4j.oop;

public class Cat {
    private String black;
    private String food;

    public void giveNick(String nick) {
        this.black = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println("The " + this.black + " cat ate " + this.food);
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        peppy.giveNick("Black");
        peppy.eat("beef");
        peppy.show();
    }
}