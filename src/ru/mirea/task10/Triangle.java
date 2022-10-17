package ru.mirea.task10;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = scan.nextInt();
        subsequence(k);
    }
    public static void subsequence(int k) {
        if(k>0){
            subsequence(k-1);
        }
        for(int i=0;i<k;i++){
            System.out.print(k+" ");
        }
    }
}
