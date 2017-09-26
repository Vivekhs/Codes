/**
 * 
 */
package problems;
import java.util.Scanner;


/**
 * @author Vivek Sinha
 *
 */
public class ArrayReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int i=0;
		for(;i<N;i++){
			arr[i] = sc.nextInt();
		}
		int temp=0;
		for(i=0;i<N/2;i++){
			temp = arr[i];
			arr[i] = arr[N-i-1];
			arr[N-i-1] = temp;
		}
		for(i=0;i<N;i++){
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
