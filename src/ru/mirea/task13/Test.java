package ru.mirea.task13;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
public class Test {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("black");
        colors.add("white");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors);
        colors.remove("red");
        System.out.println(colors);
        if(colors.contains("white")){
            System.out.println("Colors contains white");
        }
        System.out.println("The number of colors: "+colors.size());
        Collections.sort(colors);
        System.out.println(colors);
        LinkedList<String> people = new LinkedList<>();
        people.add("Mike");
        people.add("Tom");
        people.add("Jake");
        people.add("Karl");
        System.out.println(people);
        people.add(1, "Henry");
        System.out.println(people);
        people.remove(3);
        System.out.println(people);
        people.addFirst("Mark");
        System.out.println(people);
    }
}
