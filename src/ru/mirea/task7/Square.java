package ru.mirea.task7;

public class Square extends Rectangle{
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width=side;
        length=side;
    }
    public void setWidth(double side){
        width=side;
    }
    public void setLength(double side) {
        length=side;
    }
    public String ToString(){
        return "Square: {"+
                "Side: "+width+
                " | Color: "+color+
                " | Filled: "+filled+
                "}";
    }
    public Square(){};
    public Square(double side){
        width=side;
        length=side;
    }
    public Square(double side, String color, boolean filled){
        width=side;
        length=side;
        this.color=color;
        this.filled=filled;
    }
}
