import java.util.Arrays;


public class SearchArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] array2 = {
                {1, 2, 3},
                {4, 6},
                {6, 5, 8, 9}
        };

        int target = 5;
        int ans2 = Loop2D(array2, target);
        int ans = Loop1D(array1, target);

        System.out.println(ans);
        System.out.println(ans2);
    }

    static int Loop1D(int[] array1, int target) {
        for (int i = 0; i < array1.length; i++) {
            //System.out.println(array1[i]);
            if (array1[i] == target) {
                System.out.println(target + " Found @ " + i + " Index");

            }
        }
        System.out.println(Arrays.toString(array1));
        return -1;
    }


    static int Loop2D(int[][] array2, int target) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] == target) {
                    System.out.println(target + " Found @ " + i + j + " Index");

                    // System.out.println(array2[i][j]);

                }
            }
            //System.out.println(Arrays.deepToString(array2));
        }
        return 0;
    }
}









