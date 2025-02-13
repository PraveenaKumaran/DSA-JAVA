import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isprime(n));
    }

    static boolean isprime(int n){
        if (n<=1) {
            return false;
        }
        int c = 2;
        while(c * c <= n){                // such that c is with in the range of n - we need to check. Once (c * c >n) or (c > root of n), so we need to stop.
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}

/*   how this logic works:

                Example: n = 17.
                -- c * c = 2*2=4 and 4 is within the range of 17
                    so check divisibility (17%2!=0).
                -- c * c = 3*3=9 and 9 is within the range of 17
                    so check divisibility (17%3!=0).
                -- c * c = 4*4=16 and 16 is within the range of 17
                    so check divisibility (17%4!=0).
                -- c * c = 5*5=25 and 25 is NOT within the range of 17
                    break;
                    .
                    .
                    .
                    .
                    .
                    .
                    .

 */