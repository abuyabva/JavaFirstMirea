package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball ball =new Ball();
        Ball ball1 = new Ball(10, 10);
        System.out.println("X: "+ball.getX());
        System.out.println("Y: "+ball.getY());
        System.out.println("X: "+ball1.getX());
        System.out.println("Y: "+ball1.getY());
        ball.setX(15);
        ball.setY(20);
        ball1.setXY(33, 33);
        ball.move(100, 100);
        System.out.println(ball);
        System.out.println(ball1);
    }
}
