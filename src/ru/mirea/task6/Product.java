package ru.mirea.task6;

public class Product implements Priceable{
    int price;
    @Override
    public int getPrice(){
        return price;
    }
    public Product(int price){this.price=price;}
}
