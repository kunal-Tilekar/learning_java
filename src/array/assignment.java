package array;
import java.util.Scanner;

public class assignment {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements("+size+")");

        for(int i=0; i<arr.length;i++){

            arr[i] = sc.nextInt();

        }

        System.out.println("The array with negative elements only is as follows: ");

        for(int i=0; i<arr.length;i++){

            if(arr[i]<0) {
                System.out.print(arr[i] + " ");
            }

        }

    }
}
