/**
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class GenerateSubSetOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int p =(int) Math.pow(2, 30);
		p = p|p>>1;
		p = p|p>>2;
		p = p|p>>4;
		p = p|p>>8;
		p = p|p>>16;
		System.out.println(p+" "+Integer.toBinaryString(p));
		System.exit(0);
		System.out.println("hbdc "+Integer.toBinaryString(5 >> 11));
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			list.add(sc.next());
		}
		
		for(int j=1;j<(1<<n);j++){
			for(int k=0;k<n;k++){
				if((j & (1<<k)) != 0){
					System.out.print(list.get(k)+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}