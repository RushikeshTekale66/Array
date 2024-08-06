import java.util.Scanner;
class ArrayJava{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		int [] arr = new int [5];
		for(int i=0; i<arr.length; i++){
			System.out.println("Enter Number for index " + i);
			int num = sc.nextInt();
			int count = 0;
			for(int j=2; j<num; j++){
				if(num%j==0){
					count++;
				}
			}
			if(count == 0){
				arr[i] = num;
			}
			else{
				i--;
				System.out.println(num + "number is not prime");
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}