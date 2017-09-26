/**
 * 
 */
package problems;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class SumitLoveForMaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int n = 0;
		for (int i = 0; i < T; i++) {
			n = sc.nextInt();
			System.out.println(getCount(n, sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		sc.close();
	}
	
	private static long getCount(int n, int a, int b , int c) {
		long count = 0;
		long lcmTemp = 0;
		long lcm1 = lcm(a, b);
		long lcm2 = lcm(a, c);
		long lcm3 = lcm(b, c);
		count = n/a + n/b + n/c;
		count-=((n/lcm1) + (n/lcm2) + (n/lcm3));
		lcmTemp=lcm(lcm1, c);
		count+=n/lcmTemp;
		return count;
	}

	private static long gcd(long a, long b) {

		if (b == 0) {
			return a;
		}
		long temp = b;
		b = a % b;
		a = temp;
		return gcd(a, b);

	}

	private static long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

}
