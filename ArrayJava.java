import java.util.Scanner;
class ArrayJava{
	public static void main(String [] args){		
		Scanner sc = new Scanner(System.in);
		int [] arr = {1,2,3,4,5,6,7,8,9,10,1,3,5,7,9};
		
		System.out.println("Enter the index you want");
		int index = sc.nextInt();
		
		if(index<arr.length){
			System.out.println(arr[index-1]);
		}
		else{
			System.out.println("Number is greater than array size");
		}
		
	}
}