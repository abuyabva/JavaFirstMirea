package ru.mirea.task10;
import java.util.Scanner;
public class Simple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        if(n>1){
            boolean flag=isSimple(n, 2);
            if(flag){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
        else{
            System.out.print("n<1");
        }
    }
    public static boolean isSimple(int n, int del){
        if(del<n){
            if(n%del!=0){
                isSimple(n, del+1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
