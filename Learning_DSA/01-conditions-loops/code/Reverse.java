import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int ans = 0;
        while (num > 0) {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;
        }

        System.out.println(ans);
    }
}
