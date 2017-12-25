/**
 * 
 */
package com.problems;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class TwoPowerCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n==0){
			System.out.println("Number should be non zero");
		}
		int i = n&(n-1);
		if(i==0){
			System.out.println("Number is power of 2");
		}
		else{
			System.out.println("Number is not power of 2");
		}
		
		
		
		sc.close();
	}

}
