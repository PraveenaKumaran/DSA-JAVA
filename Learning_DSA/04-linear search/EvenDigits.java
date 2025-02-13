public class EvenDigits {
    public static void main(String[] args) {
        int[] num= {-12,345,2,6,7896};
        int ans= findnumbers(num);
        System.out.println(ans);
        //System.out.println(digits(14141414));

    }

    static int findnumbers(int[] arr) {
        int count=0;
        for (int n : arr) {
            if (even(n)) {
                count++;
            }

        }
        return count;

    }

    static boolean even(int num){
        int numberofdigits = digits(num);
        return(numberofdigits % 2 == 0);
    }



    static int digits(int num){

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        return (int)(Math.log10(num)) + 1;



//        int count=0;
//        while(num>0){
//            count++;
//            num=num/10;
//
//        }
//        return count;
    }

}
