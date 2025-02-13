public class Shadowing {
    static int x = 90; // Class-level (global) variable

    public static void main(String[] args) {
        System.out.println(x); // Prints 90

        int x; // Declaring a local variable with the same name "x"

//        System.out.println(x); // This would cause an error because 'x' is declared but NOT initialized

        x = 40; // Now we initialize the local 'x'
        System.out.println(x); // Prints 40 (local 'x' shadows the class 'x')

        fun(); // Calls the 'fun' method
    }

    static void fun() {
        System.out.println(x); // Prints 90
    }
}
