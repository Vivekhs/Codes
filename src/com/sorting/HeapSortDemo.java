/**
 * 
 */
package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivekhs
 *
 */
public class HeapSortDemo {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter no of nodes: ");
		int N = reader.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = reader.nextInt();
		}
		
		//here we are formatting array in heap form
		// then stating from the last non leaf index start
		// doing max heap
		// at the end of this operation index 0 of array will
		// have max value
		for(int i=(N-1)/2; i>=0;i--) {
			heapify(arr, arr.length, i);
		}
		//start from second last element index as 
		// we have max at 0 index which will be swapped everytime
		// before heapify
		for(int i = N-1;i>=0;i--) {
			swap(arr, 0, i);
			heapify(arr, i, 0);
		}
		System.out.println(Arrays.toString(arr));
		reader.close();
	}
	
	private static void heapify(int[] arr, int N, int rootNode) {
		
		int leftNode = rootNode*2 + 1;
		int rightNode = rootNode*2 + 2;
		int largestNode = rootNode;
		if(leftNode < N && arr[leftNode] > arr[rootNode]) {
			largestNode = leftNode;
			//swap(arr, rootNode, largestNode);
		}
		else if(rightNode < N && arr[rightNode] > arr[largestNode]) {
			largestNode = rightNode;
			//swap(arr, rootNode, largestNode);
		}
		
		if(largestNode != rootNode) {
			swap(arr, rootNode, largestNode);
			heapify(arr, N, largestNode);
		}
		
	}
	
	private static void swap(int[] arr, int from, int to) {
		int temp = arr[from];
		arr[from] = arr[to];
		arr[to] = temp;
		
	}

}
