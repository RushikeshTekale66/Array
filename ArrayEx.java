import java.util.Scanner;

class ArrayEx{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		int [] arr = new int [size];

		for(int i=0; i<size; i++){
			System.out.println("Enter the element for index : " + (i+1));
			arr[i] = sc.nextInt();
		}
		
		for(int i=arr.length-1; i>=0; i--){
			System.err.print(arr[i] + ", ");
		}
	}
}