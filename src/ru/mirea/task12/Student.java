package ru.mirea.task12;

public class Student {
    int iDNumber;
    String name;
    int age;
    public String toString(){
        return "Student: {"+
                "iDNumber: "+iDNumber+
                " | Name: "+name+
                "| Age: "+age+"}";
    }
    Student(int iDNumber, String name, int age){
        this.iDNumber=iDNumber;
        this.name=name;
        this.age=age;
    }
}
