/**
 * 
 */
package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author vivekrjt
 *
 */
public class DemoRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("^[A-Z][^ON]*$");
		Matcher matcher = pattern.matcher("HEAVEN");
		
		if(matcher.find()) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not matched");
		}

	}

}
