/**
 * 
 */
package arrays;

import java.util.ArrayList;

/**
 * @author vivekhs
 * https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
 */
public class MinStepInGrid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

	public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
		
		if(A.size() <= 1) {
			return 0;
		}
		int totalDistance =0;
		for(int i=1;i<A.size();i++) {
			int[] from = {
					A.get(i-1),
					B.get(i-1)
			};
			int[] to = {
					A.get(i),
					B.get(i)
			};
			int distance = calculateDistance(from, to);
			totalDistance += distance;
		}
		
		return totalDistance;
    }
	
	static int calculateDistance(int[] from, int[] to) {
		int xDistance = Math.abs(to[0] - from[0]);
		int yDistance = Math.abs(to[1] - from[1]);
		return Math.max(xDistance, yDistance);
	}
	
}
