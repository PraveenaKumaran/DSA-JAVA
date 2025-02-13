public class BinarySmallestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j','k'};
        char target = 'k';
        char ans = binarysearch(letters, target); // From int data type the ans is now converted to char data type.
        System.out.println(ans);

    }


    static char binarysearch(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
//        return letters[start % letters.length];

        if(target == letters[letters.length-1]){
            return letters[0];
        }
        return letters[start];            //this is also possible
    }
}

/*
Wrap-Around Mechanism:
//smallest letter in the array that is greater than the target.

    What It Does:
        1.Start After the Loop:
        After the binary search loop, the start index will point to the smallest letter in the array that is greater than the target. However, if target is greater than or equal to the largest letter in the array, start will be equal to the length of the array (letters.length).

        2.Circular Array Handling with %:
        The modulo operator (%) ensures that if start equals letters.length (out of bounds), it wraps around to index 0 (the first element of the array).

        For example:
        If letters.length = 4 and start = 4, then start % letters.length = 0, so it will return letters[0].

 */