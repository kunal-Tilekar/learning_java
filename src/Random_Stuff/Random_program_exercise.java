package Random_Stuff;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Random_program_exercise {
    static void main(){

        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        System.out.println("-----------------WELCOME TO THE CASINO--------------------");

        System.out.println("How many credits would you like? ");
        int credits = sc.nextInt();
        sc.nextLine();



        System.out.println("Would you like to play roulette? (yes/no)");
        String confirm = sc.nextLine();

        if (Objects.equals(confirm, "yes")){
            System.out.print("Which color would you like to bet on? (red/black) ");
            String gamble = sc.nextLine();

            System.out.println("How many credits would you like to bet? (You have "+credits+" Credits left)");
            int bet = sc.nextInt();
            if(bet > credits){
                System.out.print("You do not have enough credits!!!");
            }
            else {
                int CHOICE;
                CHOICE = r.nextInt(1,3);
                System.out.println("The roulette is spinning.....");
                System.out.println("The roulette has stopped on "+CHOICE);

                if (CHOICE == 1 && Objects.equals(gamble, "red")){

                    System.out.println("Great!! You won!!");
                    int win = bet *2;

                    System.out.println("You have won "+win+" Credits!!!");
                    credits += win;

                    System.out.println("Would you like to continue? (yes/no)");
                    sc.nextLine();
                    String confirmation = sc.nextLine();

                } else if (CHOICE == 1 && Objects.equals(gamble, "black")) {
                    System.out.println("Oh no! You lost!!");
                    int loss = credits - bet;

                    System.out.println("You have lost "+bet+" Credits");

                    System.out.println("You have "+loss+" credits left!");

                    System.out.println("Would you like to continue? (yes/no)");
                    sc.nextLine();
                    String confirmation = sc.nextLine();

                }
                else if (CHOICE == 2 && Objects.equals(gamble, "red")) {
                    System.out.println("Oh no! You lost!!");
                    int loss = credits - bet;

                    System.out.println("You have lost "+bet+" Credits");
                    System.out.println("You have "+loss+" credits left!");

                    System.out.println("Would you like to continue? (yes/no)");
                    sc.nextLine();
                    String confirmation = sc.nextLine();

                }
                else if (CHOICE == 2 && Objects.equals(gamble, "black")) {
                    System.out.println("Great!! You won!!");
                    int win = bet *2;

                    System.out.println("You have won "+win+" Credits!!!!");
                    credits += win;

                    System.out.println("Would you like to continue? (yes/no)");
                    sc.nextLine();
                    String confirmation = sc.nextLine();

                }


            }


        }
        else if (Objects.equals(confirm, "no")){
            System.out.println("Thank you for visiting us!!");

        }
        else{
            System.out.print("Please choose between 'yes' and 'no' only");
       }



    }
}


/*HERE ARE MY PLANS (LOL) FOR THIS FUN LITTLE CODE.
1.Assign values '1' to red and '2' to black
2.Random_Stuff.Loop the whole thing such that the person can keep gambling as long as he can afford it
3. MAKE THEM LOSE ALL THE CREDITS MUHUHUAHAHAHAHAH
4. if they win, give then 1.7x the value they originally started from as a profit
5.if they do not wanna gamble anymore, just make it so that they can actually cash their prizes in
6. if I want anything else I will add it here ://///
7. NEW DISCOVERY!!! As the bet amount increases, decrease the odds so they lose more often(hehehehe)

 */