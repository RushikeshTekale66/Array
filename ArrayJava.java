import java.util.Scanner;

class ArrayJava{
	public static void main(String [] args){
		//array Declaration 1
		int []  arr = {1,2,3,4,5,6,7};
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

		//array Declaration 2
		Scanner sc = new Scanner(System.in);
		int arr2[] = new int [5];
		for(int i=0; i<arr2.length; i++){
			System.out.println("Enter the element at index " + i);
			arr2[i] = sc.nextInt();
		}
		for(int i=0; i<arr2.length; i++){
			System.out.println(arr2[i]);
		}
	}
}