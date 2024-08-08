class ArrayJava{
	public void Odd(int [] arr){
		System.out.println("Largest Odd element");
		int max = 0;
		int element = 0;	
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2!=0){
				element = arr[i];
			}
			if(max < element){
			max = element;
		};
		}
		System.out.println(max);
	}
	
	public static void main(String [] args){
		int [] arr = {1,2,3,4,5,6,5,4,1,23,8,9,8};
		ArrayJava n = new ArrayJava();
		n.Odd(arr);
	}
}