// Arrays2_Two Sum Brute

// Success rate: 32.42%
// Given n length array "arr" and an integer k, Check if there exists a pair(i,j) such that arr[i]+arr[j] == k and i!=j

// Input Format:
// Each of the test cases have 3 lines.
// The First line contains the size of the array n.
// The second line contains the n elements of the array.
// The third line contains an integer k

// Output Format:
// Print true if there is a valid pair present else print false.

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// Sample test cases
// Input
// Expected output
// 7
// 2 -1 0 3 2 5 7
// 8
// true


import java.util.Scanner;


public class Array7 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int k = s.nextInt();
		boolean ans = two_sum(arr,k);
		System.out.println(ans);
	}

	public static boolean two_sum(int[]arr,int k){
		int n = arr.length;

		for(int i=0;i<n-2;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]+arr[j]==k){
					return true;
				}
			}
			
		}
		return false;
	}
}