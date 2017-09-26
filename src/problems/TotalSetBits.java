/**
 * 
 */
package problems;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class TotalSetBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		int count=0;
		for(int i =0;i<t;i++){
			n = sc.nextInt();
			count = 0;
			for(int j=0;j<31;j++){
				if((n & (1<<j)) != 0){
				count++;	
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
