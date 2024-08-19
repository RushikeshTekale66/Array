import java.util.Arrays;
import java.util.Scanner;

class ArrayEx{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int [] arr = {1, 3, 5, 4, 2, 1};

		System.out.println("Enter the index to find");
		int index = sc.nextInt();
		Arrays.sort(arr);

		System.out.println("Element at inde : "+ index + " is " + arr[index-1]);
	}
}