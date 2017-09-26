/**
 * 
 */
package problems;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Vivek Sinha
 *
 */
public class SaveMrinal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] list = new int[N];
		for(int i=0;i<N;i++){
			list[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for(int p=0;p<q;p++){
			getCount(sc.nextInt()-1, sc.nextInt(), list);
		}
		sc.close();
	}
	
	private static void getCount(int i, int j, int[] arr){
		Set<Integer> list = new HashSet<Integer>();
		for(int k=i;k<j;k++){
			list.add(arr[k]);
		}
		System.out.println(list.size());
		list.clear();
		
	}
}
