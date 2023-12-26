import java.util.Scanner;

class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();

        System.out.println("Enter the number you want to check at which index it is present ");
        int number = sc.nextInt();

        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==number){
                index = i;
            }
        }
        System.out.println("The number" + number + " is present at index : "+ index);
    }
}