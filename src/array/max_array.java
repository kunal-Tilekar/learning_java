package array;

public class max_array {
    static void main(String[] args) {
        int[] arr = {12,5,13,-7,877,-987};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];

            }

        }
        System.out.println(max);

    }
}
