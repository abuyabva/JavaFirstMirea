package ru.mirea.task5;
import java.util.Scanner;
public class FurnitureShop {
    public static void main(String[] args) {
        Chair chair = new Chair();
        Table table = new Table();
        Sofa sofa = new Sofa();
        chair.setAllStats("Chair&CO", 2000, "Wood", "Sweden");
        table.setAllStats("Best tables01", 5000, 2, true);
        sofa.setAllStats("FurnitureModern", 10000, "XL", "713DF");
        System.out.println("Welcome to our furniture shop");
        System.out.println("I'd like to show you our range:");
        System.out.println(chair.ToString());
        System.out.println(table.ToString());
        System.out.println(sofa.ToString());
        for(int i=0;i<3;i++){
            boolean flag=true;
            System.out.println("What do you want to buy?");
            System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            switch (str){
                case "Chair":
                {
                    if(chair.bought) {
                        System.out.println("You have already bought it");
                        i--;
                    }
                    else {
                        System.out.println("Do you really like this one and want to buy?");
                        System.out.println("Ok, i won't interfere you");
                        chair.setBought(true);
                        System.out.println("You're now own: ");
                        System.out.println(chair.ToString());
                    }
                    System.out.println("Do you want to buy something else?");
                    System.out.println("Enter 'Yes' or 'No': ");
                    String s = scanner.nextLine();
                    if(s=="No"){
                        flag =false;
                        break;
                    }
                    break;
                }
                case "Table":
                {
                    if(table.bought) {
                        System.out.println("You have already bought it");
                        i--;
                    }
                    else {
                        System.out.println("Nice choice");
                        table.setBought(true);
                        System.out.println("You're now own: ");
                        System.out.println(table.ToString());
                    }
                    System.out.println("Do you want to buy something else?");
                    System.out.println("Enter 'Yes' or 'No': ");
                    String s = scanner.nextLine();
                    if(s=="No"){
                        flag =false;
                        break;
                    }
                    break;
                }
                case "Sofa":
                {
                    if(sofa.bought) {
                        System.out.println("You have already bought it");
                        i--;
                    }
                    else {
                        System.out.println("This one is so comfortable I'd like to buy it for myself, but I don't have so much money");
                        sofa.setBought(true);
                        System.out.println("You're now own: ");
                        System.out.println(sofa.ToString());
                    }
                    System.out.println("Do you want to buy something else?");
                    System.out.println("Enter 'Yes' or 'No': ");
                    String s = scanner.nextLine();
                    if(s=="No"){
                        flag =false;
                        break;
                    }
                    break;
                }
                default:
                {
                    System.out.println("Sorry, we don't have this product");
                    System.out.println("Do you want to buy something else?");
                    System.out.println("Enter 'Yes' or 'No': ");
                    String s = scanner.nextLine();
                    if(s=="No"){
                        flag =false;
                        break;
                    }
                    else i--;
                    break;
                }
            }
            if(!flag) break;
        }
        System.out.println("Goodbye");
    }
}
