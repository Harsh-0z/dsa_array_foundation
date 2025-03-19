// Arrays1_Sum of Array

// Success rate: 36.98%
// Given n length Array, You have to return sum of all the elements.

// Input Format:
// Each of the test cases have 2 lines.
// First Line contains the size of the array n, while the second contains the n elements of the array.

// Output Format:
// Return an integer which is sum of all the array elements.

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// Sample test cases
// Input
// Expected output
// 10
// 1 2 3 4 5 6 7 8 9 10
// 55



import java.util.Scanner;

public class Array1{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        s.close();

		int[] arr = new int[n];
		int sum =0;
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
			sum = sum + arr[i];
			
		}
		System.out.println(sum);
	}
}