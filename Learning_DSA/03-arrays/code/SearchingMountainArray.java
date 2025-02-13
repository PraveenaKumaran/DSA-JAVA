public class SearchingMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        search(arr,target);
    }

    static void search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        System.out.println(firstTry);                                             // display how many times target accurs in index (start=0, end=peak)
        int secondTry = orderAgnosticBS(arr,target,peak+1,arr.length-1);
        System.out.println(secondTry);                                            // display how many times target accurs in index (start=peak, end=arr.length-1)
        System.out.println("The Total count of " + target +" is: " + (firstTry + secondTry));   // display Total count of the target element in the whole array
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end - start) / 2;

            if (arr[mid]> arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }System.out.println("This is: " + start);
        return start;
    }

    static int orderAgnosticBS(int[] arr, int target,int start, int end){

        boolean isAsc=arr[start]<arr[end];
        int count=0;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                count++;
                return count;            // If target is found, return it in an array
            }

            if(isAsc){                           // Accending order
                if(target<arr[mid]) {
                    end = mid - 1;
                }
                else{
                    start=mid+1;
                }
            }
            else{                                // Decending order
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end= mid-1;
                }

            }

        }
        return -1;                 // If target is not found, return an array with -1
    }
}
