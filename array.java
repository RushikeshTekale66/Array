import java.util.Scanner;
import java.util.Arrays;

// Occurance of the element & its count

class array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 3, 4, 5, 6, 7, 8, 9 };
		int maxele = 0;
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxele) {
				maxele = count;
				number = arr[i];
			}
		}
		System.out.println("Max occuring number is " + number + " & its count is " + maxele);
    }
}