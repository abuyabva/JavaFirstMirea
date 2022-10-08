package ru.mirea.task2;

public class Dog {
    public int age;
    public String name;
    public int human_age;
    public String get_name(){
        return name;
    }
    public void set_name(String n){
        name=n;
    }
    public int get_age(){
        return age;
    }
    public void set_age(int a){
        age=a;
    }
    public int convert_age(){
        return age*7;
    }
    public String toString(){
        return "Dog{"
                +"Age="+age+" "
                +"Name: "+name
                +"}";
    }
    public Dog(int a, String n){
        age = a;
        name = n;
    }
}
