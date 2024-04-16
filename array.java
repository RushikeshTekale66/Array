import java.util.Scanner;
import java.util.Arrays;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = { 1,3,4,6,5,2,1 };

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]>numbers[j]){
                int temp = numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
                }

            }
        }
        for(int i=0;i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}