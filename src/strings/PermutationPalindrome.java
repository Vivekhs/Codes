/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 * 
 * Check whether the permutation of the given
 * String is a palindrome or not
 *
 */
public class PermutationPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.toUpperCase();
		int spaceCount = 0;
		int[] charMap = new int[52];
		if(input.length()%2 !=0){
			spaceCount++;
		}
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i) == ' '){
				spaceCount++;
			}
			else{
				charMap[getCharIndex(input.charAt(i))]++;
			}
		}
		int i=0;
		for(; i<charMap.length; i++){
			int evenCheck = charMap[i] % 2;
			if(evenCheck == 0){
				continue;
			}
			else if(spaceCount > 0){
				spaceCount--;
			}
			else{
				break;
			}
		}
		if(i==charMap.length){
			System.out.println("Palindrome : YES");
		}
		else{
			System.out.println("Palindrome : NO");
		}
		sc.close();
	}

	private static int getCharIndex(char c){
		int asciiCode = (int)c;
		if(asciiCode <=90){
			return (int)c - 65;
		}
		return (int)c - 71 ; 
		
	}
}
