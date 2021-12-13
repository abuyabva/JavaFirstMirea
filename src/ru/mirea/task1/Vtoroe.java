package ru.mirea.task1;

import java.util.Scanner;

public class Vtoroe {
    public Vtoroe() {
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        for(int i = 0; i < 5; ++i) {
            System.out.print("Enter number: ");
            int a = num.nextInt();
            System.out.println("You've entered number " + a);
        }

    }
}
