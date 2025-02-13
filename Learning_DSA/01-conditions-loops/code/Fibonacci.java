import java.util.Scanner;



public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        int count = 2; // from 2nd index you can ask value persent in nth index.
        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        
        System.out.println(b);
    }
}


/* Reversing the give number:

        int count=0;
        int n1=12334;
        while (n1>0) {
            int rem = n1 % 10;
            System.out.print(rem);
            n1 = n1 / 10;
        }
        }

         */




