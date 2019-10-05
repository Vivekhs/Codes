/**
 * 
 */
package hackerrank;

/**
 * @author vivekhs
 *
 */
public class TwoDArrayHouseGlass {

	/**
	 * @param args
	 */
	static int hourglassSum(int[][] arr, int startRowIndex, int startColIndex) {
		int sum = 0;
		if((startRowIndex+3 > arr.length) || (startColIndex+3 > arr[startRowIndex].length)) {
			return Integer.MIN_VALUE;
		}
		sum += 	arr[startRowIndex][startColIndex] + 
				arr[startRowIndex][startColIndex+1]+ 
				arr[startRowIndex][startColIndex+2]+ 
				arr[startRowIndex+1][startColIndex+1]+
				arr[startRowIndex+2][startColIndex] +
				arr[startRowIndex+2][startColIndex+1] +
				arr[startRowIndex+2][startColIndex+2];
		int max =  Math.max(hourglassSum(arr, startRowIndex+1, startColIndex), hourglassSum(arr, startRowIndex, startColIndex+1));
		return Math.max(max, sum);
    }
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}
		};
		System.out.println(hourglassSum(arr, 0, 0));
	}

}
