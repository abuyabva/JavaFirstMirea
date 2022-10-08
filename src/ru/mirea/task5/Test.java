package ru.mirea.task5;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate();
        plate.setAllStats("Wood", "Brown", 10, 1);
        System.out.println(plate.ToString());
        Pot pot = new Pot();
        pot.setAllStats("Steal", "Black", 5, 20);
        System.out.println(pot.ToString());
        Pudel pudel = new Pudel();
        pudel.SetAllStats("Tom", 5, "White", 30);
        System.out.println(pudel.ToString());
    }
}
