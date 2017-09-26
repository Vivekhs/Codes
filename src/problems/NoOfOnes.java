/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class NoOfOnes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" jnje"+(-1<<30));
		int n = sc.nextInt();
		int count = 0;
		System.out.println("binary "+Integer.toBinaryString((-1<<31)));
		while(n>0){
			n = n & (n-1);
			count++;
		}
		System.out.println("Hello Vivek count is "+count+" "+(1 << 31 & -1 >>> 0));
		
		sc.close();
	}

}
