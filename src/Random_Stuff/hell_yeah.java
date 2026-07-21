package Random_Stuff;

import  java.util.Scanner;
public class hell_yeah {
    public static void  main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("\n This is a sample market list ");

        System.out.print("The available items are as follows: \n 1. chocolate \n 2. ice cream \n 3. Pizza \n 4. burger\n");

        System.out.println("Enter the numerical value of the item you would like: ");
        int item = s.nextInt();

        if (item ==1)
        {
            System.out.println("\nHow many chocolates would you like? ");
            int amount = s.nextInt();
            double cost = 25F;
            double  total =cost * amount;
            System.out.println("Your grand total is: " +total+" inr" );

        } else if (item ==2) {
            System.out.println("\nHow many Ice-creams would you like? ");
            int amount = s.nextInt();
            double cost = 50F;
            double  total =cost * amount;
            System.out.println("Your grand total is: " +total+" inr" );

        }
        else if (item ==3) {
            System.out.println("\nHow many Pizzas would you like? ");
            int amount = s.nextInt();
            double cost = 200F;
            double total = cost * amount;
            System.out.println("Your grand total is: " + total + " inr");
        }
        else if (item ==4) {
            System.out.println("\nHow many Burgers would you like? ");
            int amount = s.nextInt();
            double cost = 150F;
            double  total =cost * amount;
            System.out.println("Your grand total is: " +total+" inr" );

        }
        else {
            System.out.println("Please enter a valid input");

        }



    }
}
