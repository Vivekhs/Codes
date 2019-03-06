/**
 * 
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivekhs
 *
 */
public class MaxSubArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements: ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		System.out.println("Enter elements: ");
		for (int i = 0; i < N; i++) {
			// System.out.println("Hello");
			arr[i] = sc.nextInt();
			// System.out.println("dc");
		}
		findMaxSum2(arr);
		sc.close();
	}

	// o(n^2)
	static void findMaxSum1(int[] arr) {
		int max = Integer.MIN_VALUE;
		int startIndex = 0;
		int endIndex = 0;
		int sum;
		// System.out.println("dxd");
		for (int i = 0; i < arr.length; i++) {
			sum = 0;

			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (max < sum) {
					max = sum;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		System.out.println("Sum is " + max + " start index: " + startIndex + "end index:" + endIndex);
	}

	//O(n)
	static void findMaxSum2(int[] arr) {
		int currentSum = arr[0];
		int totalSum = arr[0];
		int startIndex = 0;
		int endIndex = 0;
		int tempStart = 0;
		int tempEnd = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i] + currentSum) {
				tempStart = i;
				tempEnd = i;
				currentSum = arr[i];
			} else {
				tempEnd = i;
				currentSum = arr[i] + currentSum;
			}
			if (currentSum > totalSum) {
				startIndex = tempStart;
				endIndex = tempEnd;
				totalSum = currentSum;
			}
		}
		System.out.println("Start index: "+startIndex+"End index: "+endIndex+" Total Sum: "+totalSum);
	}

}
