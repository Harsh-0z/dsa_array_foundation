// Arrays1_Max of Array

// Success rate: 34.06%
// Given n length Array, You have to return max out of all the elements.

// Input Format:
// Each of the test cases has 2 lines.
// First Line contains the size of the array n, while the second contains the n elements of the array.

// Output Format:
// Return an integer which is the max of all the array elements.

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// Sample test cases
// Input
// Expected output
// 6
// 7 -10 1 31 9 20
// 31
import java.util.Scanner;


public class Array8 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}

		int max_of_array=max(arr);
		System.out.println(max_of_array);
	}
	public static int max(int[]arr){
		int n =arr.length;

		int max = arr[0] ;

		for(int i=0;i<n;i++){
			if(arr[i]>=max){
				max = arr[i];
			}
		}
		return max;
	}
}
