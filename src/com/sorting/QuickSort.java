/**
 * 
 */
package com.sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author vivekhs
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int N = sc.nextInt();
		
		//int[] arr = new int[N5;
//		for(int i=0;i<N;i++) {
//			arr[i] = rd.nextInt(100);
//		}
		int[] arr = {2, 3,5,6,7};
		System.out.println(Arrays.toString(arr));
		quickSort(0, N-1, arr);
		System.out.println(Arrays.toString(arr));
		sc.close();

	}
	
	static void quickSort(int low, int high, int[] arr) {
		if(low<high) {
			int splitIndex = partition(low, high, arr);
			quickSort(low, splitIndex-1, arr);
			quickSort(splitIndex+1, high, arr);
		}
		
	}
	
	static int partition(int low, int high, int[] arr) {
			int pivot = arr[high];
			int i=low-1;
			// keep track of number greater than pivot as index of array in
			// i and keep on swapping with the number less than pivot
			// at the end of cycle array will have numbers less than pivot in
			// left side and greater than pivot in right side
			// after this swap pivot with the number which comes first in array and greater than pivot
			for(;low<high; low++) {
				if(arr[low] < pivot) {
					++i;
					if(i==low) {
						continue;
					}
					int t = arr[i];
					arr[i] = arr[low];
					arr[low] = t;
				}
			}
			++i;
			arr[high] = arr[i];
			arr[i] = pivot;
			return i;
	}

}
