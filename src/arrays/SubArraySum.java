/**
 * 
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 * @author vivekhs
 *
 */
public class SubArraySum {

	
	public static void subArrays(int[] arr, int sum) {
		int currentSum = 0;
		int start=0;
		for(int i=0;i<=arr.length;i++) {
			while(currentSum > sum && start < i-1) {
				currentSum -= arr[start];
				start++;
			}
			if(currentSum == sum) {
				System.out.println("Sub array : startIndex : "+start+" : endIndedx : "+(i-1));
			}
			if(i<arr.length)
				currentSum += arr[i];
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random  random = new Random();
		//int N = sc.nextInt();
		int arr[] = {
				1,0,1,-1
		};
//		for(int i =0;i<N;i++) {
//			
//			arr[i] = random.nextInt();
//			System.out.println(arr[i]);
//		}
		int sum = 1;
		subArrays(arr, sum);

	}

}
