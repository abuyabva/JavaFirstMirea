package ru.mirea.task1;

public class Tretie {
    public static void main(String[] args) {
        double res=0;
        String str;
        for(double i=1;i<=10;i++)
        {
            res+=1/i;
            str = String.format("The %.0f number is: %.3f", i, res);
            System.out.println(str);
        }
    }
}
