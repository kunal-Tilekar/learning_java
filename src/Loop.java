import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("The given array is: 2,5,8,11......n");

        System.out.print("Enter the number of 'n' terms in the AP ");
        int num1 = sc.nextInt();

        for (int i = 2;i<=num1*3; i+=3) {

            System.out.print(i+" ");

        }


    }

}

