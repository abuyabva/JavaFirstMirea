package ru.mirea.task3;

public class Circle {
    public int radius;
    public int circle_length;
    public void set_radius(int r){
       radius=r;
    }
    public void set_circle_length(int ci){
        circle_length=ci;
    }
    public int get_radius(){
        return radius;
    }
    public int get_circle_length(){
        return circle_length;
    }
    public Circle(int r, int c){
        radius=r;
        circle_length=c;
    }
}
