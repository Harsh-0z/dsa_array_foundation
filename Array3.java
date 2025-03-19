// Arrays2_Reverse Array

// Success rate: 27.33%
// Given n length Array, You have to Reverse the entire array and print it.

// Input Format:
// Each of the test cases have 2 lines.
// The First line contains the size of the array n.
// The second line contains the n elements of the array.

// Output Format:
// Print all the array element in a line separated by space after reversing it

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// Sample test cases
// Input
// Expected output
// 5
// 10 20 30 40 50
// 50 40 30 20 10 
import java.util.Scanner;

public class Array3{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        s.close();

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		reverse(arr);
		for(int a1:arr){
			System.out.print(a1+" ");
		}
	}
	public static void reverse(int[]arr){
		int n = arr.length;

		int sp = 0;
		int ep= n-1;

		while(sp<ep){
			int temp = arr[sp];
			arr[sp] = arr[ep];
			arr[ep] = temp;

			sp++;
			ep--;
		}
	}
}