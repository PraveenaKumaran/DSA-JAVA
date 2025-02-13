
// Fid the target val in Array without knowing the start & end index.
public class InfinateArray {
    public static void main(String[] args) {
        int[] arr = {-7, -5, -4, -2, -1, 0, 1, 3, 5, 7, 9, 12, 23, 34, 45, 56, 78, 97, 100};
        int target = 23;
        System.out.println(FindRange(arr,target));

    }

    static int FindRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1);
            start = temp;
        }
        return binarysearch(arr, target,start,end);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;     // return the index of target 
            }
        }
        return -1;
    }
}
