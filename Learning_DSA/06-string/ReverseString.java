import java.util.*;
import java.lang.String;

public class ReverseString {

    //leetcode.com/problems/reverse-words-in-a-string/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
//        System.out.println(stringReverse(str));   //Concept using String.join().
        System.out.println(stringreverse1(str));    //Concept using StringBulider.


    }

    public static String stringReverse(String str){

        //Concept using String.join().
        String[] words = str.trim().split("\\s+");
        String[] result = new String[words.length];

        int index=words.length-1;

        for(String i : words){
            result[index--] = i;
        }
        return String.join(" ", result);
    }

    public static String stringreverse1(String str){

        //Concept using StringBulider.
        StringBuilder result = new StringBuilder();

        // for example: if you give input--> __Hello__he__is__good length is 5, cause space is in the front that is counted as a word. So 1st trim() is used and than split("\\s+") is used to remove one or more spaces.
        String[] words = new String[str.length()];
        words = str.trim().split("\\s+");

        System.out.println(words.length);
        for(int i =words.length-1; i >= 0; i--){
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }
}