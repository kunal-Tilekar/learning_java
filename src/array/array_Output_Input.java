package array;
import java.util.Scanner;

public class array_Output_Input {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[] arr = {12,-6,45,-345,23,67};
//
//        for(inti = 0; i<arr.length;i++){
//            System.out.print(arr[i]+" "); //output the whole array
//            }
        System.out.println("Enter the size of array: ");
        int num = sc.nextInt();

        int[] lol = new int[num];

        System.out.println("Enter the elements("+num +"): ");

        //input
        for(int i = 0; i<lol.length;i++){

            lol[i] = sc.nextInt();

        }

        //print
        for (int i = 0; i < lol.length; i++) {

            System.out.print(2*lol[i] + " ");

        }





    }




}
