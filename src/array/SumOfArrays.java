package array;

public class SumOfArrays {
    static void main(String[] args) {

        int[] arr = {4,2};

        int sum = 1;

        for (int i=0;i<arr.length;i++){

            sum *= arr[i];
        }

        System.out.println(sum);

    }
}
