// Arrays2_Reverse Part of Array

// Success rate: 37.42%
// Given n length Array and two valid index [s,e], You have to Reverse the array from s to e and print the final array.

// Input Format:
// Each of the test cases have 3 lines.
// The First line contains the size of the array n.
// The second line contains the n elements of the array.
// The third line contains two index s and e

// Output Format:
// Print all the array element in a line separated by space after reversing part of array [s,e]

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// Sample test cases
// Input
// Expected output
// 10
// -3 4 2 8 3 9 6 2 8 10
// 3 7
// -3 4 2 2 6 9 3 8 8 10 
import java.util.Scanner;

public class Array4{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        s.close();

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();

		}
		int sp = s.nextInt();
		int ep = s.nextInt();

		reverse(arr,sp,ep);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverse(int[]arr,int sp,int ep){

		while(sp<ep){
			int temp = arr[sp];
			arr[sp] = arr[ep];
			arr[ep] = temp;
			sp++;
			ep--;
		}

	}
}
