package ru.mirea.task5;

public class Pudel extends Dog{
    String coat_color;
    int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setCoat_color(String coat_color) {
        this.coat_color = coat_color;
    }
    public void SetAllStats(String n, int a, String c, int h){
        super.name=n;
        super.age=a;
        coat_color=c;
        height=h;
    }
    public String ToString() {
        return super.toString()+
                " Pudel: {"+
                "Coat color: "+coat_color+
                " | Height: "+height+"}";
    }
}
