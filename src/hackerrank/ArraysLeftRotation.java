/**
 * 
 */
package hackerrank;

import java.util.Arrays;

/**
 * @author vivekhs
 *
 */
public class ArraysLeftRotation {

	static int[] rotLeft(int[] a, int d) {
		int size = a.length;
		int gcd = gcd(size, d);
		for(int i=0; i<gcd;i++) {
			int temp = a[i];
			int j = i;
			
			for(;;) {
				int k = j+d;
				if(k>=size) {
					k = k- size;
				}
				if(k==i) {
					break;
				}
				a[j] = a[k];
				j = k;
			}
			a[j]  = temp;
			
		}
		return a;
    }
	
	static int gcd(int a, int b) {
		int c = a%b;
		if(c==0) {
			return b;
		}
		return gcd(b, c);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = 
			{
					3,4,5,6,7
			};
		arr = rotLeft(arr, 3);
		System.out.println(Arrays.toString(arr));

	}

}
