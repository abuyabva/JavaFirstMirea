package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle cir = new Circle(5, 10);
        System.out.println(cir.get_radius());
        cir.set_radius(10);
        System.out.println(cir.get_radius());
        cir.set_circle_length(100);
        System.out.println(cir.get_circle_length());
    }
}
