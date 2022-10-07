package ru.mirea.task1;
import java.util.Scanner;
public class Pyatoe {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = num.nextInt();
        System.out.println("Factorial of number " +a+" is "+factorial(a));
    }
    public static int factorial(int n){
        int res=1;
        for(int i=1;i<=n;i++)
            res*=i;
        return (res);
    }
}
