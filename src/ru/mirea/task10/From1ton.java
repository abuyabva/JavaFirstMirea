package ru.mirea.task10;
import java.util.Scanner;
public class From1ton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        output(n);
    }
    public static void output(int n){
        if(n>1){
            output(n-1);
        }
        System.out.print(n+" ");
    }
}
