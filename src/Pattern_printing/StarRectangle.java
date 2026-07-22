package Pattern_printing;
import java.util.Scanner;

public class StarRectangle {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of col: ");
        int col = sc.nextInt();

        for(int i=1;i<=row;i++){ //Dictates how many lines will be printed

            for(int j=1;j<=col;j++) { //dictates how many stars in a line will be printed
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
}
