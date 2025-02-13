import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans=0;
        while(true){
            System.out.print("Enter Operator: ");
            char op = input.next().trim().charAt(0);

            if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter Two Numbers: ");
                int Num1 = input.nextInt();
                int Num2 = input.nextInt();

                if(op=='+') {
                    ans = Num1 + Num2;
                }
                if(op=='-') {
                    ans = Num1 - Num2;
                }
                if(op=='*') {
                    ans = Num1 * Num2;
                }
                if(op=='/') {
                    ans = Num1 / Num2;
                }
            } else if (op=='x' || op=='X'){
                    break;
            } else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }
    }

}
