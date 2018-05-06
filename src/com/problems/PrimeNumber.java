/**
 * 
 */
package com.problems;

import java.util.Scanner;

/**
 * @author vivekhs
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//FastReader fr = new FastReader();
		Scanner fr = new Scanner(System.in);
		int N = fr.nextInt();
		
		
		for(int i=2;i<N;i++) {
			if(i==2 || i==3) {
				System.out.println(i);
				continue;
			}
			int temp = (int) Math.sqrt(i);
			//boolean isPrime = false;
			int j =2;
			for(;j<=temp;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(temp+1 == j) {
				System.out.println(i);
			}
		}
		fr.close();

	}

}
