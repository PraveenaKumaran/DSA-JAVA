import java.util.*;

public class Swap {
    public static void main(String[] args) {
        int[] array1 = {2, 34, 54, 76, 86, 23, 3};
        System.out.println("Origina Array: " + Arrays.toString(array1));

        reverse(array1);
        System.out.println("Reversed Array: " + Arrays.toString(array1));

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }


    static void swap( int[] arr, int index1, int index2){                   // input index
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        }
}
