/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 * 
 * convert string to url
 * by replacing space with '%20'
 * while taking input add more space 
 * at the end to accommodate extra characters
 *
 */

public class URLify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		char[] iCharArray = new char[input.length()];
		int iCharIndex =0;
		input = input.trim();
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i) == ' '){
				iCharArray[iCharIndex++] = '%';
				iCharArray[iCharIndex++] = '2';
				iCharArray[iCharIndex++] = '0';
			}
			else{
				iCharArray[iCharIndex++] = input.charAt(i);
				
			}
		}
		System.out.println(String.valueOf(iCharArray));
		sc.close();
		
	}

}
