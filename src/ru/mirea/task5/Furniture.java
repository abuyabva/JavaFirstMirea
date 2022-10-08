package ru.mirea.task5;

public class Furniture {
    String manufacturer;
    int price;
    boolean bought;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }
    public String toString(){
        String s;
        s = bought ? "bought" : "not purchased";
        return "Furniture: {"+
                "Manufacturer: "+manufacturer+
                " | Price: "+price+
                " | Status: "+s+"}";
    }
    public Furniture (){
        bought=false;
    }
}
