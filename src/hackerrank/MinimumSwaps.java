/**
 * 
 */
package hackerrank;

import java.util.Random;

/**
 * @author vivekhs
 *
 */
public class MinimumSwaps {

	
	static int minimumSwapsV2(int[] arr) {
		int swapCount = 0;
		for(int i = 0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[minIndex]> arr[j]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
				swapCount++;
			}
		}
		return swapCount;
		

    }
	
	static int minimumSwap(int[] arr) {
		int swapCount = 0;
		boolean[] visited = new boolean[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int j=i, cycle=0;
			while(!visited[j]) {
				visited[j] = true;
				j = arr[j]-1;
				cycle++;
			}
			if(cycle > 1) {
				swapCount += cycle-1;
			}
		}
		return swapCount;
		

    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int[] arr = new int[1000000];
		for(int i=0;i<1000000;i++) {
			arr[i] = rd.nextInt();
		}
		System.out.println(minimumSwap(arr));

	}

}
