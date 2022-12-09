package ru.mirea.task2;
import java.util.Scanner;
public class TestDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter dog's amount: ");
        Dog arr[]=Create_dog_array(scan.nextInt());

        Array_output(arr);
    }
    public static Dog[] Create_dog_array(int n){
        Dog[] arr=new Dog[n];
        int a;
        String s;
        Scanner scan = new Scanner(System.in);
        Scanner sca = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter dog's age: ");
            a=scan.nextInt();
            System.out.print("Enter dog's name: ");
            s=sca.nextLine();
            arr[i]=new Dog(a, s);
        }
        return arr;
    }
    public static void Array_output(Dog[] arr){
        String str;
        for(int i=0;i<arr.length;i++){
            System.out.print("The "+(i+1)+" ");
            System.out.println(arr[i]);
        }
    }
}
