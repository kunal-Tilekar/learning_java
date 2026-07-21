package LOOP;
import java.util.Scanner;

public class AP {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms you want of the A.P. ");
        int n = sc.nextInt();


        //to find nth term:- an = a+(n-1)d. d is difference(here it is 2). a is first term(here it is 1)
//        for(int i=1;i<=2*n-1;i+=2){
//            System.out.print(i+" ");
//        }

        //for ap 4,7,11,13,16
        int a=4, d = 3;

        for(int i =1; i<=n; i++){
            System.out.print(a+" ");
            a+=d;
        }




    }
}
