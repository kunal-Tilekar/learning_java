import java.util.Arrays;
public class ArrayBasics {

    static void main(String[] args) {

        int[] arr = {6,19,7,69,9,171,5,4,2,124,235325,35};
        //indexing

        System.out.println(arr[1]);
        //printing array based on it's index, accessing the array

        arr[1] = 12;  //changing value of array through index number of the array element



        System.out.println(arr[1]);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " "); //prints the whole array
        }

    }
}
