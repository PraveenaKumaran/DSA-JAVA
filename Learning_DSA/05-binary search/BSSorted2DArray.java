import java.util.Arrays;

public class BSSorted2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12}
        };
        System.out.println(Arrays.toString(search(arr, 11)));
        System.out.println(Arrays.deepToString(arr));


    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int cmid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][cmid] == target) {
                return new int[]{row, cmid};
            }
            if (matrix[row][cmid] < target) {
                cStart = cmid + 1;
            } else {
                cEnd = cmid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty

        if (cols == 0) {
            return new int[]{-1, -1};
        }
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }


        int rStart = 0;
        int rEnd = rows - 1;
        int cStart = 0;
        int cEnd = cols-1;
        int cMid = cols / 2;


        // run the loop till 2 rows are remaining
        while (rStart < (rEnd-1)) {
            int rmid = rStart + (rEnd - rStart) / 2;

            if (matrix[rmid][cMid] == target) {
                return new int[]{rmid, cMid};
            }
            if (matrix[rmid][cMid] < target) {
                rStart = rmid;
            } else {
                rEnd = rmid;
            }
        }


        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {                                                        //---------------|
            return new int[]{rStart, cMid};                                                          //---------------|
        }                                                                                            //---------------|
        if (matrix[rStart + 1][cMid] == target) {                                                    //---------------|
            return new int[]{rStart + 1, cMid};                                                      //---------------|
        }                                                                                            //---------------|
        if (target < matrix[rStart][cEnd]) {                                                         //---------------|
            return binarySearch(matrix, rStart, cStart, cEnd, target);                               //---------------|
        } else {                                                                                     //---------------|
            return binarySearch(matrix, rStart+1, cStart, cEnd, target);                        //---------------|
        }

    }
}
/*
                // search in 1st half                                                                               //---------------|
        if (target <= matrix[rStart][cMid - 1]) {                                                   //---------------|
        return binarySearch(matrix, rStart, 0, cMid-1, target);                                     //---------------|
        }                                                                                           //---------------|
                // search in 2nd half                                                               //---------------|
                if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {     //---------------|
        return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);                            //---------------|
        }                                                                                           //---------------|
                // search in 3rd half                                                               //---------------|
                if (target <= matrix[rStart + 1][cMid - 1]) {                                       //---------------|
        return binarySearch(matrix, rStart + 1, 0, cMid-1, target);                                 //---------------|
        } else {                                                                                    //---------------|
                return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);                //---------------|
        }
                }
                }

 */