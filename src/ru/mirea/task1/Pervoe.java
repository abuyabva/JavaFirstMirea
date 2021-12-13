package ru.mirea.task1;

public class Pervoe {
    public Pervoe() {
    }

    public static void main(String[] args) {
        int[] mas = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        int i;
        for(i = 0; i < 10; ++i) {
            sum += mas[i];
        }

        System.out.println("Sum by for: " + sum);
        sum = 0;

        for(i = 0; i < 10; ++i) {
            sum += mas[i];
        }

        System.out.println("Sum by while: " + sum);
        sum = 0;
        i = 0;

        do {
            sum += mas[i];
            ++i;
        } while(i < 10);

        System.out.println("Sum by do while: " + sum);
    }
}

