package Pattern_printing;
import java.util.Scanner;

public class print_num {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n (elements): ");
        int n =sc.nextInt();

        System.out.print("Enter the number m (rows): ");
        int m =sc.nextInt();

        for(int i=1;i<=n; i++){

            for (int j = 1; j <=m; j++) {
                System.out.print(i+" ");
            }
            System.out.println(" ");

        }
    }
}
