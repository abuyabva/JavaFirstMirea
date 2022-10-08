package ru.mirea.task3;

public class Leg {
    int length;
    int foot_size;
    public int getLength(){return length;}
    public int getFoot_size(){return foot_size;}
    public void setLength(int n){length=n;}
    public void setFoot_size(int f){foot_size=f;}
    public String toString(){
        return "Leg{"
                +"length: "+length
                +" foot size: "+foot_size
                +"}";
    }
    public Leg(){
        length = 90;
        foot_size=40;
    }
}
