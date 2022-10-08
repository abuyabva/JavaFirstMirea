package ru.mirea.task5;

public class Plate extends Dish {
    int radius;
    int depth;
    public void setAllStats(String m, String c, int r, int d){
        super.color=c;
        super.material=m;
        radius=r;
        depth=d;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public String ToString() {
        return super.toString()+
                " Plate: { "+
                "Radius: "+radius+
                " | Depth: "+depth+ " }";
    }
    public Plate() {};
}
