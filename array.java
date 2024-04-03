import java.util.Scanner;
import java.util.Arrays;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = { 1, 2, 3, 4, 5 };

        int number = 5;
        for(int i=0; i<numbers.length; i++){
           if(number==numbers[i]){
            System.out.println("Element is present at index : " + i);
           }
           else{System.out.println("Element is not present");}
        }
    }
}