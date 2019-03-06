/**
 * 
 */
package com.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author vivekhs
 *
 */
public class PlayWithNumbers {
	
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		Long nextLong() {
			return Long.parseLong(next());
		}
		Double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
		//System.out.println(fr.next());
		//Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int arr[] = new int[N];
		long sumArr[] = new long[N+1];
		sumArr[0] = 0;
		long tempSum = 0;
		for(int i =0;i<N;i++) {
			arr[i] = sc.nextInt();
			tempSum += arr[i];
			sumArr[i+1] = tempSum;
		}
		for(int i=0;i<Q;i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			if(start==end) {
				System.out.println(arr[start-1]);
			}
			else {
				System.out.println((sumArr[end] - sumArr[start-1])/(end-start+1));
			}
		}
	}

}
