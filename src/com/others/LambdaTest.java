/**
 * 
 */
package com.others;

/**
 * @author vivekrjt
 *
 */
public class LambdaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LambdaTestI test = (int a, int b)->{return a+b;};
		System.out.println(test.test(3, 4));

	}

}
