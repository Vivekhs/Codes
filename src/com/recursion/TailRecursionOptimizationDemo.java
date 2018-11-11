/**
 * 
 */
package com.recursion;

/**
 * @author vivekhs
 *
 */
public class TailRecursionOptimizationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}

	static int fact(int factResult) {
		if(factResult<2) {
			return factResult;
		}
		return factResult*fact(factResult-1);
	}
}
