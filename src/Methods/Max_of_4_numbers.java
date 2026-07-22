package Methods;
import java.util.Scanner;

public class Max_of_4_numbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number A: ");
        int a = sc.nextInt();

        System.out.print("Enter a number B: ");
        int b = sc.nextInt();

        System.out.print("Enter a number C: ");
        int c = sc.nextInt();

        System.out.print("Enter a number D: ");
        int d = sc.nextInt();

        System.out.println(Math.max(Math.max(Math.max(a,b),c),d));

    }
}
