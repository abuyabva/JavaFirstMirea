package ru.mirea.task6;

public class Test {
    public static void main(String[] args) {
        Nameable str = new Planet("Earth");
        System.out.println(str.getName());
        Product p = new Product(3000);
        System.out.println(p.getPrice());
    }
}
