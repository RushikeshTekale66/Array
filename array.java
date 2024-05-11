import java.util.Scanner;
import java.util.Arrays;

// Occurance of the element

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length");
        int arrlength = sc.nextInt();
        int [] arr = new int[arrlength];

        System.out.println("Enter the array element form 1-9");
        for(int i=0; i<arrlength; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the element whose occurance to be find out");
        int n = sc.nextInt();
        int count =0;
        
        for(int i=0; i<arr.length; i++){
            if(n==arr[i]){
                count++;
            }
        }
        System.out.println("The occurance of "+n+" is of "+count+" time");
    }
}