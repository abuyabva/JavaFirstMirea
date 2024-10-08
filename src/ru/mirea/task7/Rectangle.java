package ru.mirea.task7;

public class Rectangle extends  Shape{
    protected double width;
    protected double length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width+length);
    }
    public String ToString(){
        return "Rectangle: {"+
                "Width: "+width+
                " | Length: "+length+
                " | Area: "+getArea()+
                " | Perimeter: "+getPerimeter()+
                " | Color: "+color+
                " | Filled: "+filled+
                "}";
    }
    public Rectangle(){};
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
}
