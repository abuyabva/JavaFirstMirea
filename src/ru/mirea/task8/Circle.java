package ru.mirea.task8;

import java.util.Random;

public class Circle extends Shape{
    public void setColor() {
        Random rand=new Random();
        int i;
        i=rand.nextInt(5+1);
        switch (i){
            case 1:{
                color="Black";
                break;
            }
            case 2:{
                color="White";
                break;
            }
            case 3:{
                color="Green";
                break;
            }
            case 4:{
                color="Red";
                break;
            }
            case 5:{
                color="Blue";
                break;
            }
        }
    }
}
