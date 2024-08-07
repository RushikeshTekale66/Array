class ArrayJava{
	public void sort(int [] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Second largest element in array is : " + arr[arr.length-2]);
		
	}
	
	public static void main(String [] args){
		int [] arr = {10,30,50,40,60,70,90,80};
		ArrayJava s = new ArrayJava ();
		
		s.sort(arr);
		
	}
}