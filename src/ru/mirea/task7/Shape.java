package ru.mirea.task7;

public abstract class Shape {
    protected boolean filled;
    protected String color;

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String ToString();
    public Shape(){};
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String toString(){
        return "Shape: {"+
                "Color: "+color+
                " | filled: "+filled+
                "}";
    }
}
