import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Size: ");
        int size = in.nextInt();
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(size);

//        list.add(67);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(654);
//        list.add(8765);

//        System.out.println(list.contains(765432));
//        System.out.println(list);
//        list.set(0, 99);
//
//        list.remove(2);
//
//        System.out.println(list);

        // input
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        // display
        for (int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);



    }
}
