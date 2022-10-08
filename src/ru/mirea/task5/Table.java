package ru.mirea.task5;

public class Table extends Furniture{
    int square;
    boolean sliding;

    public void setSliding(boolean sliding) {
        this.sliding = sliding;
    }

    public void setSquare(int square) {
        this.square = square;
    }
    public void setAllStats(String m, int p, int s, boolean sl){
        super.manufacturer=m;
        super.price=p;
        square=s;
        sliding=sl;
    }
    public String ToString() {
        return super.toString()+
                " Table: {"+
                "Square: "+square+
                " | Sliding: "+sliding+"}";
    }
}
