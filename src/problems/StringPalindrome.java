/**
 * 
 */
package problems;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class StringPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		char[] ch = s1.toCharArray();
		int N = ch.length;
		int i=0;
		for(;i<N/2;i++){
			if(ch[i] != ch[N-i-1]){
				break;
			}
		}
		if(i==N/2){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		sc.close();
	}

}
