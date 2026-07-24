package LOOP;

import java.util.Scanner;

public class moreAP{
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag =true; //true means prime

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag ==true) System.out.println("Prime number");
        if (flag == false) System.out.println("Composite number");



    }
}