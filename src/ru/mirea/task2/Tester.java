package ru.mirea.task2;

public class Tester {
    public static void main(String[] args) {
        Shape sphere = new Shape();
        System.out.println(sphere);
        Ball ball = new Ball(5, "Blue");
        Book book = new Book(100, "Kolobok");
    }
}
