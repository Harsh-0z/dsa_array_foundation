// 2D Array_Print ZigZag

// Success rate: 36.05%
// Given a 2D array, Print integers in zig zag fashion.

// Note: Zig zag fashion means oth row from left to right, 1st row form right to left, 2nd row from left to right and so on

// Input Format:
// The first line contains two integers n and m representing row and column of 2D array.
// Each of next n rows contains m numbers of 2D array.

// Output Format:
// Print integers in zig zag fashion.

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
// 6 5 4 


import java.util.Scanner;

public class Array_2d11 {
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

		zigzag(arr);
	}

	public static void zigzag(int[][]arr){
		int n = arr.length;
		int m = arr[0].length;

		for(int i=0;i<n;i++){

			if(i % 2 == 0){
				for(int j=0;j<m;j++){
					System.out.print(arr[i][j]+" ");
				}
			}else{
				for(int j=m-1;j>=0;j--){
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}