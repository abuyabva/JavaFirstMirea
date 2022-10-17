package ru.mirea.task7;

public class NewTest {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(5, 5, 1, 1);
        System.out.println(p.toString());
        MovableCircle c =new MovableCircle(2, 2, 3, 3, 5);
        System.out.println(c.toString());
        MovableRectangle r = new MovableRectangle(2, 2, 0, 0, 1, 1);
        System.out.println(r.toString());
    }
}
