package ru.mirea.task5;

public class Dog {
    String name;
    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Dog: {"+
                "Name: "+name+
                " | Age: "+age+"}";
    }
}
