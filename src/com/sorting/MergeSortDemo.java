/**
 * 
 */
package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author vivekrjt
 *
 */
public class MergeSortDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = rd.nextInt(100);
		}
		//int[] arr = {48, 18, 27, 65, 62, 27};
		System.out.println("Before sorting"+Arrays.toString(arr));
		mergeSort(arr, 0, arr.length-1);
		System.out.println("after sorting"+Arrays.toString(arr));
		sc.close();
	}
	
	private static void mergeSort(int[] arr, int start, int end) {
		if((end-start)<2) {
			if((end-start)==1) {
				if(arr[start]>arr[end]) {
					int t = arr[start];
					arr[start] = arr[end];
					arr[end] = t;
				}
				
				
			}
			return;
		}
		
		int mid = (end-start)/2;
		
		mergeSort(arr, start, start+mid);
		mergeSort(arr, start+mid+1, end);
		merge(arr, start, end, mid);
	}
	
	static void merge(int[] arr, int start, int end, int mid) {
		int[] temp = new int[end-start+1];
		int i=start;
		int length1 = mid+1;
		int length2 = end-start-mid;
		int j=start+mid+1;
		int k=0;
		for(;j<(start+mid+1+length2) && i< (start+length1);) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
			}
			else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		for(;i<(start+length1);i++) {
			temp[k] = arr[i];
			k++;
		}
		for(;j<=end;j++) {
			temp[k] = arr[j];
			k++;
		}
		i=0;
		for(;i<temp.length;i++) {
			arr[start+i] = temp[i];
		}
	}

}
