public class MountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);

    }
    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end - start) / 2;

            if (arr[mid]> arr[mid+1]){
                end=mid;
                // you are in the dec part of array
                // this may be the ans, but want to look at left
                // this is why end != mid - 1
            }
            else{
                // you are in asc part of array
                // because we know that  mid element < mid+1 element
                start=mid+1;
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return arr[start];       // returns the index
    }
}
