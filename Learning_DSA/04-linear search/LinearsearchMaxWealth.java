public class LinearsearchMaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));

    }


    static int maximumWealth(int[][] accounts) {

        int ans = 0;
        for (int person = 0; person < accounts.length; person++){
            int rowsum=0;
            for(int value = 0; value< accounts[person].length; value++) {
                rowsum +=accounts[person][value];
            }
            if(rowsum>ans){
                ans=rowsum;
            }
        }
        return ans;
    }
}
