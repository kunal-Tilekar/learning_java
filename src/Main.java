import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age <=0){
            System.out.print("Your name is "+name+" and ");
            System.out.println("You are not born yet!");
        }
        else if (age>=0 && age<=7) {
            System.out.print("Your name is "+name+" and ");
            System.out.println("You are a baby!");


        } else if (age>=8 && age <=12) {
            System.out.print("Your name is "+name+" and ");
            System.out.println("You are a child!");

        }
        else if (age >= 13 && age <=17){
            System.out.print("Your name is "+name+" and ");
            System.out.println("You are a teenager!");
        }

        else if (age >=18 && age <=35){
            System.out.print("Your name is "+name+" and ");
            System.out.println("You are an adult!");

        }
        else if (age >=36 && age <=65){
            System.out.print("Your name is "+name+" and ");
            System.out.print("You are middle aged!");

        }
        else if (age >=66 && age <=120){
            System.out.print("Your name is "+name+" and ");
            System.out.print("You are a senior citizen!");
        }
        else {
            System.out.print("Your name is "+name+" and ");
            System.out.print("You are probably dead by now!");
            sc.close();
        }
    }

}