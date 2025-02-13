public class BinaryFloor {
    public static void main(String[] args) {
        int[] arr = {-7, -5, -4, -2, -1, 0, 1, 3, 5, 7, 9, 12, 23, 34, 45, 56, 78, 97, 100};
        int target =10;
        int ans = ceiling(arr, target);
        System.out.println(ans);

    }


    static int ceiling(int[] arr, int target) {
        int ans = orderAgnosticBS(arr, target);
        return ans;

    }

    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        boolean isAsc=arr[start]<arr[end];



        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==target){
                return arr[mid];
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
        return arr[end];
    }


}
