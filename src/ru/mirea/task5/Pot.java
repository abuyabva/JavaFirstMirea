package ru.mirea.task5;

public class Pot extends Dish{
    int capacity;
    int height;
    public void setAllStats(String m, String c, int ca, int h){
        super.material=m;
        super.color=c;
        capacity=ca;
        height=h;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public String ToString() {
        return super.toString()+
                " Pot: {"+
                "Capacity: "+capacity+
                " | Height: "+height+
                "}";
    }
}
