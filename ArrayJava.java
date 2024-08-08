class ArrayJava{
	public void common(int [] arr, int [] arr2){
		System.out.println("Common element in array is " );
		for(int i=0; i<arr.length; i++){
			int count = 0;
			for(int j=0; j<arr2.length; j++){
				if(arr[i]==arr2[j]){
					count ++;
				}
			}
			if(count >= 1){
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String [] args){
		int [] arr = {1,2,3};
		int [] arr2 = {1,2, 1, 2,1};
		ArrayJava m = new ArrayJava();
		m.common(arr, arr2);
	}
}