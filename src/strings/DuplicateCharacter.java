/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 * 
 * write a program to check
 * whether a string has duplicates or not
 *
 */
public class DuplicateCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] charMap = new int[26];
		
		input = input.toUpperCase();
		int i = 0;
		for(; i< input.length(); i++){
			int charIndex = getCharIndex(input.charAt(i));
			int charCount = charMap[charIndex];
			if(charCount > 0){
				break;
			}
			charMap[charIndex]++;
		}
		if(i== input.length()){
			System.out.println("String has unique characters");
		}
		else{
			System.out.println("String has duplicate characters");
		}
		
		sc.close();
		
		

	}

	/**
	 * Accept capital alphabet and
	 * return index 
	 * @param c
	 * @return
	 */
	static int getCharIndex(char c){
		return (int)c - 65;
	}
	
	static char getIndexByChar(int index){
		return (char)(index+65);
	}
}
