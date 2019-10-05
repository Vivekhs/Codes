/**
 * 
 */
package hackerrank;

/**
 * @author vivekhs
 *
 */
public class VeryBigSum {

	static long aVeryBigSum(long[] ar) {
        long total = 0;
        for(int i=0;i<ar.length;i++) {
        	total += ar[i];
        }
        
        return total;

    }
}
