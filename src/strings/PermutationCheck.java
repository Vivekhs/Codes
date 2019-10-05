/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 * 
 * Check if a given string is permutation
 * of another given string
 *
 */
public class PermutationCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String firstString = sc.next();
		String secondString = sc.next();
		int N = firstString.length();
		System.out.print("Is String permutation of another ? ");
		if(N != secondString.length()){
			System.out.println("No");
		}
		int[] firstCharMap = new int[52];
		int[] secondCharMap = new int[52];
		for(int i=0; i<N; i++){
			char firstStringChar = firstString.charAt(i); 
			char secondStringChar = secondString.charAt(i);
			firstCharMap[getCharIndex(firstStringChar)]++;
			secondCharMap[getCharIndex(secondStringChar)]++;
		}
		int charIndex=0;
		for(; charIndex < 52 ;charIndex++){
			if(firstCharMap[charIndex] != secondCharMap[charIndex]){
				break;
			}
		}
		if(charIndex == 52){
			System.out.print("Yes");
		}
		else{
			System.out.println("No");
		}
		sc.close();
	}
	
	static int getCharIndex(char c){
		int asciiCode = (int)c;
		if(asciiCode <=90){
			return (int)c - 65;
		}
		return (int)c - 71 ; 
		
	}

}
