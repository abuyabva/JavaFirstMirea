package ru.mirea.task10;
import java.util.Scanner;
public class SumOfdigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        System.out.print(Findsum(n));
    }
    public static int Findsum(int n){
        int sum=0;
        sum+=n%10;
        n/=10;
        if(n>0){
           sum+=Findsum(n);
        }
        return sum;
    }
}
