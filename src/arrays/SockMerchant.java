/**
 * 
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivekhs
 *
 */
public class SockMerchant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfSocks = sc.nextInt();
		int[] socks = new int[noOfSocks];
		for(int i =0; i<noOfSocks ; i++) {
			socks[i] = sc.nextInt();
		}
		Arrays.sort(socks);
		int count = 1;
		int pairsCount = 0;
		for(int i=1; i< noOfSocks; i++) {
			if(socks[i-1] == socks[i]) {
				count++;
			}
			else {
				pairsCount += count/2;
				count = 1;
			}
		}
		pairsCount += count/2;
		System.out.println(pairsCount);
		sc.close();
	}

}
