package ru.mirea.task5;

public class Sofa extends Furniture{
    String size;
    String model;

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setAllStats(String m, int p, String s, String mo) {
        super.manufacturer = m;
        super.price = p;
        size = s;
        model = mo;
    }
    public String ToString() {
        return super.toString()+
                " Sofa: {"+
                "Size: "+size+
                " | Model: "+model+"}";
    }
}
