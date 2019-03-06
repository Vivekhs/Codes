/**
 * 
 */
package com.problems;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class StringMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i< N; i++){
			boolean flag = true;
			String s1 = sc.next();
			String s2 = sc.next();
			Map<Character, Integer> hMap = new HashMap<Character, Integer>();
			for(char c : s1.toCharArray()){
				Integer val = hMap.get(c);
				val = val==null?1:++val;
				hMap.put(c, val);
			}
			for(char c : s2.toCharArray()){
				Integer value = hMap.get(c);
				
				if(value ==null || value == 0){
					flag = false;
					break;
				}
				value--;
				hMap.put(c, value);
			}
			if(flag){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		
		
		sc.close();
	}

}
