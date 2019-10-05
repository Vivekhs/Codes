/**
 * 
 */
package hackerrank;

/**
 * @author vivekhs
 *
 */
public class DiagonalDifference {
	static int diagonalDifference(int[][] arr) {
		int rightDiagonal = 0;
		int leftDiagonal = 0;
		int size = arr.length;
		for(int i = 0; i< size;i++) {
			rightDiagonal += arr[i][size - i -1];
			leftDiagonal += arr[i][i];
		}
		return Math.abs(rightDiagonal - leftDiagonal);

		
    }
	
	public static void main(String args[]) {
		int arr[][] = new int[2][3];
		arr[0][0]=1;  
		arr[0][1]=2;  
		arr[1][0]=4;  
		arr[1][1]=5;  
		arr[1][2]=6;  
		
		System.out.println(arr.length);
	}
}
