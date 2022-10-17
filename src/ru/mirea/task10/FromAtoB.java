package ru.mirea.task10;
import java.util.Scanner;
public class FromAtoB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = scan.nextInt();
        System.out.print("Enter B: ");
        int B = scan.nextInt();
        if(A<=B){
            output(A, B);
        }
        else{
            anotherOutput(B, A);
        }
    }

    public static void output(int A, int B){
        if(A<=B) {
            System.out.print(A + " ");
            output(A + 1, B);
        }
    }
    public static void anotherOutput(int B, int A){
        if(A>=B){
            System.out.print(A+" ");
            anotherOutput(B, A-1);
        }
    }
}
