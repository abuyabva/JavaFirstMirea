package ru.mirea.task1;
import java.util.Random;
public class Chetvertoe {
    public static void main(String[] args) {
        int[] mas=new int[10];
        System.out.println("The first array:");
        for(int i=0;i<mas.length;i++)
        {
            mas[i]=(int) (Math.random()*100);
            System.out.println("The "+(i+1)+" element of array is: "+mas[i]);
        }
        System.out.println("The sorted array:");
        bubble_sort(mas);
        output(mas);
        int[] arr=new int[10];
        System.out.println("The second array:");
        Random rand=new Random();
        for(int i=0;i<arr.length;i++)
        {
            mas[i]=rand.nextInt(100+1);
            System.out.println("The "+(i+1)+" element of array is: "+mas[i]);
        }
        System.out.println("The sorted array:");
        bubble_sort(mas);
        output(mas);
    }
    public static void bubble_sort(int[] arr){
        int a;
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    a=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=a;
                    flag=true;
                }
            }
        }
    }
    public static void output(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("The "+(i+1)+" element of array is: "+arr[i]);
        }
    }
}
