package ru.mirea.task5;

public class Dish {
    String material;
    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return "Dish: { "+
                "Material: "+material+
                " | Color: "+color+" }";
    }

    public Dish() {};
}
