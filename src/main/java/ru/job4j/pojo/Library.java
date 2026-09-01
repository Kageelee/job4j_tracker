package ru.job4j.pojo;

import java.util.Objects;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Who", 100);
        Book book2 = new Book("What", 20);
        Book book3 = new Book("Why", 40);
        Book book4 = new Book("Clean code", 200);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " pages: " + book.getPages());
        }
        books[0] = book4;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " pages: " + book.getPages());
        }
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (Objects.equals(book.getName(), "Clean code")) {
                System.out.println(book.getName() + " pages: " + book.getPages());
            }
        }
    }
}
