import java.util.Arrays;

public class BinarySearch2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        int target = 38;
        System.out.println(Arrays.toString(binarysearch2DArray(arr,target)));


    }


    static int[] binarysearch2DArray(int[][] arr, int target){
        int r = 0;
        int c = arr[0].length-1;        // arr[0].length-1 = arr.length-1 both are same. once do think in numbers terms praveen.

        while (r <= arr.length-1 && c >= 0){

            if(target==arr[r][c]){
                return new int[]{r,c};
            }
            else if (target < arr[r][c]){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
