/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * @author vivekhs
 *
 */
public class MaxSubArrayProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int N = sc.nextInt();
		System.out.println("Enter elements");
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		findMaxProduct(arr);
		sc.close();
		
	}
	
	static void findMaxProduct(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		int total = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] < 0) {
				int temp = max;
				max = Math.max(arr[i], arr[i]*min);
				min = Math.min(arr[i], arr[i]*temp);
			}
			else {
				max = Math.max(arr[i], arr[i]*max);
				min = Math.min(arr[i], arr[i]*min);
			}
			total = Math.max(max, total);
		}
		System.out.println("Max product is : "+total);
	}
}
