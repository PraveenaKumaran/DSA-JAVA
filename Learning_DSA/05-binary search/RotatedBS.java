public class RotatedBS {

    // https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,0,1,2,3};
        int target = 2;
        int pivot = findpivot(arr);
        int ans = search(arr,target,pivot);
        System.out.println(ans);
    }

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
//                 |---------------------------------------------- we have make sure that while doing mid+1, if suppose mid is the end index in some senerio: that it is not exceeding the range, so we also include the condition mid < end.
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target,int pivot){
        // if you found pivot:
        if (target == arr[pivot]){
            return pivot;
        }
        if (target > arr[0]) {
            return binarysearch(arr, target, 0, pivot - 1);
        }
            return binarysearch(arr, target, pivot + 1, arr.length - 1);
    }


    static int binarysearch(int[] arr, int target, int start, int end){

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return mid;

            } else if(target<arr[mid]) {
                end = mid - 1;

            } else{
                start=mid+1;
                }
            }
        return -1 ;
    }

}