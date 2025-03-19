// Given n length Array, You have to count total no. of elements in the array having atleast 1 element greater than itself.

// Input Format:
// Each of the test cases have 2 lines.
// The First line contains the size of the array n.
// The second line contains the n elements of the array.

// Output Format:
// Print a single Integer representing total no. of elements in the array having atleast 1 element greater than itself.

// Constraints:
// 2 <= array length <= 10^5
// -10^4 <= array[i] <= 10^4

// Sample test cases
// Input
// Expected output
// 7
// -4 -3 7 9 3 9 4
// 5
import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}

		int ans = countGreater(arr);
		System.out.println(ans);

	}
	public static int countGreater(int[]arr){
		int n = arr.length;
		int max = arr[0];

		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}

		int totalmax = 0 ;
		for(int i=0;i<n;i++){
			if(arr[i]==max){
				totalmax++;
			}
		} 
		return n-totalmax;

	}
}