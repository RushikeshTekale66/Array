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
		
		System.out.println("Enter the element to find in array");
		int element = sc.nextInt();
		boolean found = false;

		for(int i=0; i<arr.length; i++){
			if(arr[i]==element){
				found = true;
				break;
			}
		}
		if(found){
			System.out.println("We found element in array");
		}
		else{
			System.out.println("Element is not present in array");
		}
	}
}