import java.util.Scanner;
import java.util.Arrays;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = { 1,3,4,6,5,2,1 };
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}