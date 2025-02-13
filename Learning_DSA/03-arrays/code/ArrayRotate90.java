public class ArrayRotate90 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

//        rotateArray(arr, "Brute Force Approach");
//        display(arr);

        TransereverseArray(arr,"Optimal Approach");
        display(arr);

    }

    public static void rotateArray(int[][] arr, String approch) {
        int[][] result = new int[arr.length][arr.length];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][n - i - 1] = arr[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = result[i][j];
            }
        }
    }

    public static void TransereverseArray(int[][] arr, String approch) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            // if j=i, then it swaps the diagonal element also which is not need to do. So j=i+1, avoid the diagonal swaps. Praveen draw & visualize for every normal itration you will get it
            for (int j = i+1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][j+2];
                arr[i][j+2] = temp;
            }
        }
    }

    public static void display(int[][] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j < n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
