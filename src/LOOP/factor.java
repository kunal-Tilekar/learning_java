package LOOP;

import java.util.Scanner;

public class factor {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }

        }
    }
}
