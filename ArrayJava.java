class ArrayJava{
	
	public void max(int arr []){
		for(int i=0; i<arr.length; i++){
			int count = 0;
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					count ++;
				}
			}
			if(count==1){
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String [] args){
		int [] arr = {1,2,3,1,2,3,1,2,3,4,5,6,7,7,5};
		ArrayJava m = new ArrayJava();
		m.max(arr);
	}
}