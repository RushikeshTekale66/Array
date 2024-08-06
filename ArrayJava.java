import java.util.Scanner;
class ArrayJava{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		int [] arr = new int [5];
		for(int i=0; i<arr.length; i++){
			System.out.println("Enter Number for index " + i);
			int num = sc.nextInt();
			if(num%2==0){
				arr[i]= num;
			}
			else{
				i--;
				System.out.println("Odd Number Entered");
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}