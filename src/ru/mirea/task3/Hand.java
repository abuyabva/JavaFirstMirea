package ru.mirea.task3;

public class Hand {
    boolean filled;
    int num_of_fingers;
    public void take_subject(){
        if(filled==true) System.out.println("The hand is already full");
        else filled = true;
    }
    public void throw_subject(){
        if(filled==false) System.out.println("The hand is already empty");
        else filled = false;
    }
    public int getNum_of_fingers(){return num_of_fingers;}
    public boolean getFilled(){return filled;}
    public void setNum_of_fingers(int n){num_of_fingers=n;}
    public void setFilled(boolean f){filled=f;}
    public String toString(){
        return "Hand{"
                +"filled: "+filled
                +" number of fingers: "+num_of_fingers
                +"}";
    }
    public Hand(){
        filled=false;
        num_of_fingers=5;
    }
}
