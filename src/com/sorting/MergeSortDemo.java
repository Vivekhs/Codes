/**
 * 
 */
package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

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
		
		BufferedReader bfd = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length: ");
		int N = Integer.parseInt(bfd.readLine());
		int[] elements = new int[N];
		
		Random random = new Random();
		for(int i=0; i<N; i++) {
			elements[i] = random.nextInt(50);
		}
		System.out.println("Elements are : \n"+Arrays.toString(elements));
		mergeSort(elements, N/2, (N-(N/2)), N);
		System.out.println(Arrays.toString(elements));

	}
	
	public static void mergeSort(int[] complete, int l, int r, int t) {
		
		if(t<2) {
			return;
		}
		int[] left = new int[l];
		int p=0;
		
		for(;p<l;p++) {
			left[p] = complete[p];
		}
		
		int[] right = new int[r];
		
		while(p<t) {
			right[p-l] =complete[p];
			p++;
		}
		
		mergeSort(left, l/2, (l-(l/2)), l);
		mergeSort(right, r/2, (r-(r/2)), r);
		
		//merge sort pseudo code
		int i=0;
		int j=0;
		int k=0;
		while(i < l && j < r) {
			
			if(left[i]<=right[j]) {
				complete[k] = left[i];
				i++;
			}
			else {
				complete[k] = right[j];
				j++;
			}
			k++;
			
		}
		
		while(i<l) {
			complete[k] = left[i];
			i++;
			k++;
		}
		
		while(j<r) {
			complete[k] = right[j];
			j++;
			k++;
		}
		
		
		
	}

}
