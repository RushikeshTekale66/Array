import java.util.Scanner;
import java.util.Arrays;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // The toString() method returns a string representation of the contents of the
        // specified array.
        int[] numbers = { 1, 2, 3, 4, 5 };

        String arrayString = Arrays.toString(numbers);
        System.out.println("Array: " + arrayString); // Output: Array: [1, 2, 3, 4, 5]
    }
}