package LOOP;

import java.util.Scanner;

public class moreAP{
    static void main() {

        Scanner sc = new Scanner(System.in);

        boolean flag =true; //true means prime

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag && n !=1) System.out.println("Prime number");
        if (!flag) System.out.println("Composite number");
        if (n == 1) System.out.println("Neither prime nor composite");






    }
}