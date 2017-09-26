/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class IBitSetOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = sc.nextInt();
		
		int j = n & (1<<(i-1));
		System.out.println("Hello vivek "+j);
		sc.close();
	}

}
