import java.util.Arrays;

public class RotateArray {

    //leetcode.com/problems/rotate-array/description/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k =2;
        ArrayRotation(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    public static void ArrayRotation(int[] arr, int k) {

        k = k % arr.length;     //🎯 Why Do We Use k = k % n?
                                // When rotating an array of size n, rotating it n times (or any multiple of n) brings the array back to its original position.
                                //So, rotating k times is the same as rotating k % n times

        reversearray(arr,0, arr.length-1);

        reversearray(arr,0,k-1);

        reversearray(arr, k,arr.length-1);
    }

    public static void reversearray(int[] arr, int start, int end){

        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}