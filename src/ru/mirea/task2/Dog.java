package ru.mirea.task2;

public class Dog {
    public int age;
    public String name;
    public int human_age;
    public String get_name(Dog d){
        return d.name;
    }
    public void set_name(Dog d, String n){
        d.name=n;
    }
    public int get_age(Dog d){
        return d.age;
    }
    public void set_age(Dog d, int a){
        d.age=a;
    }
    public int convert_age(Dog d){
        return d.age*7;
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
