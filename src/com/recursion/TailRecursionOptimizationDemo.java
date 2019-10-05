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
fact(1500);
	}

	static void fact(int factResult) {
		if(factResult<2) {
			return;
		}
		
		fact(factResult-1);
	}
}
