
// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {

            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
