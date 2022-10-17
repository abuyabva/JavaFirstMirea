package ru.mirea.task12;
import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args) {
        Test t=new Test();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=scan.nextInt();
        Student[]arr=t.createArr(n);
        System.out.print("Enter n for another array: ");
        n=scan.nextInt();
        Student[] anotherArr=t.createArr(n);
        System.out.println("Arrays before sort: ");
        t.outputArray(arr);
        t.outputArray(anotherArr);
        Student[] Array=mergeSort(arr, anotherArr);
        System.out.println("Arrays after sort: ");
        t.outputArray(Array);
    }
    public static Student[] mergeSort(Student[] arr, Student[] anotherArr){
        Student[] Array=new Student[arr.length+anotherArr.length];
        Test t=new Test();
        SortingStudentsByGPA s=new SortingStudentsByGPA();
        if(arr.length>1){
            if(arr.length%2==0){
                Student[] arr1=new Student[arr.length/2];
                Student[] arr2=new Student[arr.length/2];
                for(int i=0;i<arr.length;i++){
                    if(i<arr.length/2){
                        arr1[i]=arr[i];
                    }
                    else{
                        arr2[i-arr1.length]=arr[i];
                    }
                }
                arr=mergeSort(arr1, arr2);
                arr=s.deleteEl(arr);
            }
            else{
                Student[] arr1=new Student[arr.length/2];
                Student[] arr2=new Student[arr.length/2 + 1];
                for(int i=0;i<arr.length;i++){
                    if(i<arr.length/2){
                        arr1[i]=arr[i];
                    }
                    else{
                        arr2[i-arr1.length]=arr[i];
                    }
                }
                arr=mergeSort(arr1, arr2);
                arr=s.deleteEl(arr);
            }
        }
        if(anotherArr.length>1){
            if(anotherArr.length%2==0){
                Student[] arr1=new Student[anotherArr.length/2];
                Student[] arr2=new Student[anotherArr.length/2];
                for(int i=0;i<anotherArr.length;i++){
                    if(i<anotherArr.length/2){
                        arr1[i]=anotherArr[i];
                    }
                    else{
                        arr2[i-arr1.length]=anotherArr[i];
                    }
                }
                anotherArr=mergeSort(arr1, arr2);
                anotherArr=s.deleteEl(anotherArr);
            }
            else{
                Student[] arr1=new Student[anotherArr.length/2];
                Student[] arr2=new Student[anotherArr.length/2 + 1];
                for(int i=0;i<anotherArr.length;i++){
                    if(i<anotherArr.length/2){
                        arr1[i]=anotherArr[i];
                    }
                    else{
                        arr2[i-arr1.length]=anotherArr[i];
                    }
                }
                anotherArr=mergeSort(arr1, arr2);
                anotherArr=s.deleteEl(anotherArr);
            }
        }
        int i=0, j=0;
        while((i<arr.length)&&(j< anotherArr.length)){
            if(arr[i].iDNumber<=anotherArr[j].iDNumber){
                Array[i+j]=arr[i];
                i++;
            }
            else{
                Array[i+j]=anotherArr[j];
                j++;
            }
        }
        if(i==arr.length){
            while(j!=anotherArr.length){
                Array[arr.length+j]=anotherArr[j];
                j++;
            }
        }
        else if(j==anotherArr.length) {
            while(i<arr.length){
                Array[anotherArr.length + i] = arr[i];
                i++;
            }

        }
        t.outputArray(Array);
        return Array;
    }
}
