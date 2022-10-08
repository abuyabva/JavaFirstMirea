package ru.mirea.task4;

public class Ball {
    double x;
    double y;
    public double getX(){return x;}
    public double getY(){return y;}
    public void setX(double x1){x=x1;}
    public void setY(double y1){y=y1;}
    public void setXY(double x1, double y1){
        x=x1;
        y=y1;
    }
    public void move(double x1, double y1){
        x=x1-x;
        y=y1-y;
    }
    public String toString(){
        return "Ball{"
                +"x: "+x
                +" | y: "+y;
    }
    public Ball(){
        x=0;
        y=0;
    }
    public Ball(double x1, double y1){
        x=x1;
        y=y1;
    }
}
