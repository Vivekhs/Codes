/**
 * 
 */
package problems;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class SumitaAndEqualArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = 0;
		int X=0;
		int Y=0;
		int Z=0;
		long[] arr;
		for(int i =0;i<T; i++){
			N = sc.nextInt();
			X = sc.nextInt();
			Y = sc.nextInt();
			Z = sc.nextInt();
			
			arr = new long[N];
			arr[0] = sc.nextInt();
			long lcm = arr[0];
			for(int j =1;j<N;j++){
				arr[j] = sc.nextInt();
				lcm = lcm(lcm, arr[j]);
			}
			System.out.println("LCM is "+lcm);
			int k=0;
			for(;k<N;k++){
				if(arr[k] == lcm){
					continue;
				}
				if((lcm % (arr[k]*X) == 0) || (lcm % (arr[k]*Y) == 0) ||(lcm % (arr[k]*Z) == 0)){
					continue;
				}
				break;
				
				
			}
			if(k == N){
				System.out.println("She can");
			}
			else{
				System.out.println("She can't");
			}
		}
		
		sc.close();
	}
	
	private static long gcd(long a, long b){
		
		if(b == 0){
			return a;
		}
		long temp = b;
		b = a%b;
		a = temp;
		return gcd(a,b);
		
	}
	
	private static long lcm(long a, long b){
		return a*(b/gcd(a, b));
	}
	

}
