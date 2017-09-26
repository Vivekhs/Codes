/**
 * 
 */
package problems;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class MicroAndArrayUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N];
			for(int j=0;j<N;j++){
				arr[j] = sc.nextInt();
			}
			calculateTime(arr, K);
		}
		sc.close();
	}
	
	private static void calculateTime(int[] arr, int K){
		Arrays.sort(arr);
		int diff = K-arr[0];
		if(diff<0){
			diff = 0;
		}
		System.out.println(diff);
	}

}
