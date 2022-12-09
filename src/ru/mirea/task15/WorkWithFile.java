package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class WorkWithFile {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("test.txt");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter information, that you want to write to file: ");
        System.out.println("If you want to end input, enter 'stop'");
        while(true){
            String s = scan.next();
            if(s.equals("stop")){
                break;
            }
            fw.write(s+"\n");
        }
        fw.close();
        FileReader fr = new FileReader("test.txt");
        Scanner scanner = new Scanner(fr);
        System.out.println("Your file: ");
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fr.close();
        System.out.println("Change file information");
        File dir = new File("test,txt");
        dir.delete();
        fw=new FileWriter("test.txt");
        System.out.println("Enter information, that you want to write to file: ");
        System.out.println("If you want to end input, enter 'stop'");
        while(true){
            String s = scan.next();
            if(s.equals("stop")){
                break;
            }
            fw.write(s+"\n");
        }
        fr = new FileReader("test.txt");
        scanner = new Scanner(fr);
        System.out.println("Your file: ");
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fr.close();
        System.out.println("Add information to the end of the file");
        System.out.println("Enter information, that you want to write to file: ");
        System.out.println("If you want to end input, enter 'stop'");
        while(true){
            String s = scan.next();
            if(s.equals("stop")){
                break;
            }
            fw.append(s+"\n");
        }
        fw.close();
        fr = new FileReader("test.txt");
        scanner = new Scanner(fr);
        System.out.println("Your file: ");
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fr.close();
    }
}
