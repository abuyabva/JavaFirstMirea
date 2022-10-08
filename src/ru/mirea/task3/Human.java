package ru.mirea.task3;

public class Human {
    public static void main(String[] args) {
        Head head=new Head();
        Leg leg =new Leg();
        Hand hand = new Hand();
        if(head.getHair_color()=="Black") head.setHair_color("Brown");
        if(head.getEye_color()=="Black") head.setEye_color("Green");
        if(leg.getLength()==90) leg.setLength(100);
        if(leg.getFoot_size()==40) leg.setFoot_size(45);
        if(hand.getNum_of_fingers()==5) hand.setNum_of_fingers(6);
        if(hand.getFilled()==false) hand.take_subject();
        System.out.println(head);
        System.out.println(hand);
        System.out.println(leg);
    }
}
