/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 * 
 * Perform a basic string compression
 * using the counts of repeated characters
 *
 */
public class StringCompression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		int length = input.length();
		char[] charMappings = new char[input.length()];
		System.out.println(String.valueOf(charMappings));
		int[] charCount = new int[input.length()];
		int countPosition = 0;
		charMappings[0] = input.charAt(0);
		for(int i =0; i< length; i++){
			if(i != 0 && input.charAt(i) != input.charAt(i-1)){
				countPosition++;
				charMappings[countPosition] = input.charAt(i);
				charCount[countPosition]++;
			}
			else{
				charCount[countPosition]++;
			}
		}
		StringBuilder compressedString = new StringBuilder();
		for(int j=0; j < length && charMappings[j] != '\u0000';j++){
			compressedString.append(charMappings[j]+String.valueOf(charCount[j]));
		}
		
		System.out.println(compressedString.toString());
		sc.close();

	}

}
