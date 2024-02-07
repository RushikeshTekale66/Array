import java.util.Scanner;
import java.util.Arrays;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //it will create an array of size 10 and value 0
        int [] arr1 = new int[10];

        //it will create an array and assign value to it
        int [] arr2 = {1,3,4,5,1,2,3,4,5,6};

        //Sort Array
        Arrays.sort(arr2);

        //access element from an array
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

    }
}