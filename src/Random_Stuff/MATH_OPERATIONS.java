package Random_Stuff;

import java.util.Scanner;
public record MATH_OPERATIONS() {
    static void main(String[] args) {
        //double result;
       // result = Math.pow(2, 5);
        // result = Math.abs(-34);
       // result = Math.sqrt(25);

        Scanner sc = new Scanner(System.in);


        double a,b,c;

        System.out.println("Enter a number: ");
        a = sc.nextDouble();

        System.out.println("Enter another number: ");
        b = sc.nextDouble();
        c = Math.sqrt (Math.pow(a,2)+Math.pow(b,2) );



        System.out.print(c);
    }

}
