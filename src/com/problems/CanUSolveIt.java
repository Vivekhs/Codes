/**
 * 
 */
package com.problems;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class CanUSolveIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		int n;
		long[] arr;
		for(int i =0;i<t;i++){
			n = sc.nextInt();
			arr = new long[n];
			for(int p=0;p<n;p++){
				arr[p] = sc.nextLong();
			}
			long max=0;
			long temp=0;
			for(int j=0;j<n-1;j++){
				for(int k=j+1;k<n;k++){
					temp = Math.abs(arr[k]-arr[j])+Math.abs(j-k);
					if(temp>max){
						max = temp;
					}
				}
				
				
				
			}
			System.out.println(max);
		}
		sc.close();
	}

}
 