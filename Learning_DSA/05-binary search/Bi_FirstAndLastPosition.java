import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class Bi_FirstAndLastPosition {
    
    public static void main(String[] args) {
        int[] nums = {5, 8, 8, 8, 8, 8, 10, 10};
        int target = 10;
        int[] ans = {-1, -1}; // Initialize the answer array with {-1,-1}
        search(nums, target, ans); // Perform the search. which updates it and returns the updated array.
        System.out.println(Arrays.toString(ans));


    }
    static int[] search(int[] nums, int target, int[] ans) {

        // Find the first occurrence of the target (start index)
        ans[0] = binarysearch(nums, target, true);

        // If the target exists, find the last occurrence (end index)
        if (ans[0] != -1) {
            ans[1] = binarysearch(nums, target, false);
        }
        return ans;

    }

    static int binarysearch(int[] arr, int target, boolean findstartindex) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if(arr[mid]<target) {
                start = mid + 1;
            }
            else{
                ans = mid; // Potential target found. It may be in left(for start value} or in right(for end value).
                if (findstartindex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
