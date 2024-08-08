import java.util.Scanner;
class ArrayJava{

	public void sum (int [] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum = sum+arr[i];
		}
		System.out.println("Sum of all array elements is : " + sum);
	}
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lenght of the array");
		int l = sc.nextInt();
	
		int [] arr = new int [l];

		for(int i=0; i<l; i++){		
			System.out.println("Enter the element for index : " + i);
			arr[i] = sc.nextInt();
		}
		
		//Object of the class
		ArrayJava as = new ArrayJava();
		as.sum(arr);
	}
}