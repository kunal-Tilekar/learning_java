package LOOP;

import java.util.Scanner;

public class add_loop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 'n' numbers you want to add: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 0; i <= n; i++) {

           total +=i;
        }
        System.out.println(total);

        sc.close();
    }
}
