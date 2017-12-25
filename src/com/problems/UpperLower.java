/**
 * 
 */
package com.problems;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class UpperLower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		char[] ch = s1.toCharArray();
		
		for(int i=0; i<ch.length ; i++ ){
			if((int)ch[i] <97){
				ch[i] = (char)((int)ch[i]+32);
			}
			else{
				ch[i] = (char)((int)ch[i]-32);
			}
		}
		System.out.println(String.valueOf(ch));
		sc.close();
	}

}
