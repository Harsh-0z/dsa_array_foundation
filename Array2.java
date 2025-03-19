// Arrays1_Swap Indexes

// Success rate: 23.11%
// Given n length Array and 2 indexes, You have to swap the elements of 2 indexes and print the array.

// Input Format:
// Each of the test cases have 3 lines.
// The First line contains the size of the array n.
// The second line contains the n elements of the array.
// The third line contains two index.

// Output Format:
// Print all the array element in a line separated by space after swapping

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4
// 0 <= indexs < array length

// Sample test cases
// Input
// Expected output
// 5
// 31 4 -7 1 -29
// 1 4
// 31 -29 -7 1 4 
import java.util.Scanner;


public class Array2 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        s.close();

		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = s.nextInt();
		}
		
		int f_index = s.nextInt();
		int s_index = s.nextInt();

		int temp = arr[f_index];
		arr[f_index] = arr[s_index];
		arr[s_index] = temp;

		for(int a1:arr){
			System.out.print(a1+" ");
		}
	
	}
}
