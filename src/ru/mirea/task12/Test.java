package ru.mirea.task12;
import java.util.Random;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=scan.nextInt();
        Student[]arr=createArr(n);
        System.out.println("Array before sort: ");
        outputArray(arr);
        System.out.println("Array after sort: ");
        arr=insertionSort(arr);
        outputArray(arr);
        System.out.print("Enter n for another array: ");
        n=scan.nextInt();
        Student[] anotherArr=createArr(n);
        System.out.println("Array before sort: ");
        outputArray(anotherArr);
        SortingStudentsByGPA a = new SortingStudentsByGPA();
        anotherArr=a.quickSort(anotherArr);
        System.out.println("Array after sort: ");
        outputArray(anotherArr);
    }
    public static Student[] createArr(int n){
        Student[]arr=new Student[n];
        for(int i=0;i<n;i++){
            int iDNumber=(int) (Math.random()*10000);
            String name="Student №"+(i+1);
            int age=(int)(Math.random()*100);
            arr[i]=new Student(iDNumber, name, age);
        }
        return arr;
    }
    public static Student[] swap(int i, int j, Student[] arr){
        Student s = new Student(arr[i].iDNumber, arr[i].name, arr[i].age);
        arr[i]=arr[j];
        arr[j]=s;
        return arr;
    }
    public static Student[] insertionSort(Student[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while((j>0)&&(arr[j-1].iDNumber>arr[j].iDNumber)){
                swap(j-1, j, arr);
                j--;
            }
        }
        return arr;
    }
    public static void outputArray(Student[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }
    }
}
