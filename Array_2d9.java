// 2D Array_Print row wise

// Success rate: 33.52%
// Given a 2D array, Print row wise integers.

// Input Format:
// The first line contains two integers n and m representing row and column of 2D array.
// Each of next n rows contains m numbers of 2D array.

// Output Format:
// Print integers of each row of array in a line separated by space.

// Constraints:
// 2 <= n,m <= 1000
// 0 <= elements of array <= 10^4

// Sample test cases
// Input
// Expected output
// 2 3
// 1 2 3
// 4 5 6
// 1 2 3 
// 4 5 6 

import java.util.Scanner;

public class Array9 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();

		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=s.nextInt();
			}
		}

		print(arr);
	}
	public static void print(int[][]arr){
		int n = arr.length;
		int m = arr[0].length;

		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}