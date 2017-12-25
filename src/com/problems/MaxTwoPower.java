/**
 * 
 */
package com.problems;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class MaxTwoPower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		if(n%2 == 0){
			System.out.println("Max value is "+n);
			return;
		}
		n = n|n>>1;
		n = n|n>>2;
		n = n|n>>4;
		n = n|n>>8;
		n = n|n>>16;
		n = (n>>1)+1;
		System.out.println("Max value is "+n);
	}

}
