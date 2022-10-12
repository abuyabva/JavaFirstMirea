package ru.mirea.task7;

public class Circle extends Shape{
    protected double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius*Math.PI;
    }
    public double getPerimeter(){
        return Math.PI*Math.pow(radius, 2);
    }
    public String ToString(){
        return "Circle: {"+
                "Radius: "+radius+
                " | Area: "+getArea()+
                " | Perimeter"+getPerimeter()+
                " | Color: "+color+
                " | Filled: "+filled+
                "}";
    }
    public Circle(){};
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
}
