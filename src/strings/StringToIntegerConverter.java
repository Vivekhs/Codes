/**
 * 
 */
package strings;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class StringToIntegerConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(input);
		Integer number = stringToInt(input);
		System.out.println(number);
		sc.close();
	}
	
	private static Integer stringToInt(String input) {
		int number = 0;
		for(int charIndex = 0; charIndex < input.length(); charIndex++) {
			char ch = input.charAt(charIndex);
			int chAscii = (int)ch;
			// out of integer range
			if(chAscii < 48 || chAscii > 57) {
				return null;
			}
			number = number*10 + (chAscii - 48);
		}
		return number;
	}

}
