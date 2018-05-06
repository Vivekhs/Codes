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
public class FastReader {
	
	BufferedReader br;
	StringTokenizer st;
	
	public FastReader() {
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
	void close(){
		if(br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
