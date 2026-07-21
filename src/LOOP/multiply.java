package LOOP;
import java.util.Scanner;

public class multiply {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number whose table you want: ");
        int n = sc.nextInt();

        int mul = 1;

        for(int i=1; i<=10;i++){
            mul =n*i;
            System.out.println(mul);
        }


    }
}
