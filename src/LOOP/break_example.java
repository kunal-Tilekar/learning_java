package LOOP;
import java.util.Scanner;

public class break_example {
    static void main() {

        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter a number to find highest factor of: ");
        int n = sc.nextInt();

        for(int i=n-1;i>=0;i--){
            if(n%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
