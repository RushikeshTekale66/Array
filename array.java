import java.util.Scanner;
import java.util.Arrays;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 1, 2, 3 };
        int[] array3 = { 1, 2, 4 };

        boolean isEqual1And2 = Arrays.equals(array1, array2); // true
        boolean isEqual1And3 = Arrays.equals(array1, array3); // false

        System.out.println("Arrays array1 and array2 are equal: " + isEqual1And2);
        System.out.println("Arrays array1 and array3 are equal: " + isEqual1And3);

    }
}