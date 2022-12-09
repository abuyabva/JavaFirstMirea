package ru.mirea.task14;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class Drunkard {
    public static void main(String[] args) {
        ArrayList<String> first=new ArrayList<String>();
        ArrayList<String> second=new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first player cards:");
        for(int i=0;i<5;i++){
            String s=scan.next();
            first.add(s);
        }
        System.out.println("Enter second player cards:");
        for(int i=0;i<5;i++){
            String s=scan.next();
            second.add(s);
        }
        System.out.println(first);
        System.out.println(second);
        game(first, second);
    }
    public static void game(ArrayList<String> first, ArrayList<String> second){
        int i=0;
        int fCard, sCard;
        while(i<106){
            fCard=Integer.parseInt(first.get(0));
            sCard=Integer.parseInt(second.get(0));
            if(((fCard==0)&&(sCard==9))||(fCard>sCard)){
                first.add(""+fCard);
                first.add(""+sCard);
                first.remove(0);
                second.remove(0);
            }
            else if(((fCard==9)&&(sCard==0))||(sCard>fCard)) {
                second.add(""+fCard);
                second.add(""+sCard);
                first.remove(0);
                second.remove(0);
            }
            i++;
            if(i==106){
                System.out.println("Botva");
                break;
            }
            else{
                if(first.size()==0){
                    System.out.println("second, number of rounds: "+i);
                    break;
                }
                else if(second.size()==0){
                    System.out.println("first, number of rounds: "+i);
                    break;
                }
            }
        }
    }
}
