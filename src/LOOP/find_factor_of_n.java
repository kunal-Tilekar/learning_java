package LOOP;
import java.util.Scanner;

public class find_factor_of_n {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number whose factorial you want: ");
        int n = sc.nextInt();
        int highest_factor =0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                highest_factor=i;

            }
        }
        System.out.println(highest_factor);
    }
}
