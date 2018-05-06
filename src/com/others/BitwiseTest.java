/**
 * 
 */
package com.others;

/**
 * @author Vivek Sinha
 *
 */
public class BitwiseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i=0; i<40; i++)
		System.out.println((-2>>>i)+" "+Integer.toBinaryString(-2>>>i)+" "+i);

	}

}
