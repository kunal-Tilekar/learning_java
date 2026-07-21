package LOOP;
import java.util.Scanner;

public class add_1_to_n {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 'n' numbers you want to print: ");
        int n = sc.nextInt();

        for(int i=0;i<=n; i++){

            System.out.print(i+" ");
        }

        sc.close();
    }
}
