package ru.mirea.task12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingStudentsByGPA implements Comparator{
    public Student[] quickSort(Student[] arr){
        Student[] arr1 = new Student[arr.length];
        Student[] arr2 = new Student[arr.length];
        Student s=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[0].age>arr[i].age){
                arr2[i]=arr[i];

            }
            else if(arr[0].age<arr[i].age){
                arr1[i]=arr[i];
            }
        }
        arr2=deleteEl(arr2);
        if(arr2.length>1){
            arr2=quickSort(arr2);
        }
        arr1=deleteEl(arr1);
        if(arr1.length>1){
            arr1=quickSort(arr1);
        }
        for(int i=0;i<arr.length;i++){
            if(i<arr1.length){
                arr[i]=arr1[i];
            }
            else if(i==arr1.length){
                arr[i]=s;
            }
            else{
                arr[i]=arr2[i-arr1.length-1];
            }
        }
        return arr;
    }
    public Student[] deleteEl(Student[] arr){
        List<Student> list = new ArrayList<>(Arrays.asList(arr));
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == null) {
                list.remove(null);
            }
        }
        arr = list.toArray(new Student[list.size()]);
        return arr;
    }
}
