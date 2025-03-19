// Arrays2_Rotate Array

// Success rate: 29.57%
// Given an integer array nums of size N, rotate the array to the right by k steps, where k is non-negative.

// Input Format:
// The first line contains an integer n denoting size of the array.
// Next line contains the elements of array.
// Next line contains the integer k.

// Output Format:
// Output the updated array.

// Constraints:
// 1<=N<=10^6
// 1<=k<=10^6
// -10^5<=arr[i]<=10^5

// Sample test cases
// Input
// Expected output
// 7
// 1 2 3 4 5 6 7
// 3
// 5 6 7 1 2 3 4 
import java.util.Scanner;

public class Array5{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr  = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();

		}
		int k = s.nextInt();
		k = k % n ;

		reverse(arr,0,n-1);
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);

		for(int a1:arr){
			System.out.print(a1+" ");
		}
	}
	public static void reverse(int[]arr,int sp , int ep){
		while(sp<ep){
			int temp = arr[sp];
			arr[sp] = arr[ep];
			arr[ep] = temp;

			sp++;
			ep--;
		}
	}
}