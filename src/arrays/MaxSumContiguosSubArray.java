/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vivekhs
 *
 */
public class MaxSumContiguosSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list= new ArrayList();
		int[] arr = {
				-2, 1, -3, 4, -1, 2, 1, -5, 4
		};
		for(int val: arr) {
			list.add(val);
		}
		
		int max = maxSubArray(list);
		System.out.println(max);
	}
	
	public static int maxSubArray(final List<Integer> A) {
		int N = A.size();
		int[] cumulativeSum = new int[N];
		
		cumulativeSum[0] = A.get(0);
		int maxSum = A.get(0);
		// cumulative sum done
		for(int i=1; i<N;i++) {
			if(A.get(i) > maxSum) {
				maxSum = A.get(i);
			}
			cumulativeSum[i] = cumulativeSum[i-1] + A.get(i);
		}
		if(cumulativeSum[N-1] > maxSum) {
			maxSum = cumulativeSum[N-1];
		}
		// use sliding window starting with size starting with 2 till N-1
		
		for(int i=2;i<N;i++) {
			int sum = cumulativeSum[i-1];
			if(sum > maxSum) {
				maxSum = sum;
			}
			for(int j=0;(j+i)<N;j++) {
				sum = cumulativeSum[j+i] - cumulativeSum[j];
				if(sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
    }

}
