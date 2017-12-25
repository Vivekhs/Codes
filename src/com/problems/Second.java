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
public class Second {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		for(int i =0; i<10; i++){
			countMap.put(String.valueOf(i), 0);
		}
		char[] str = sc.next().toCharArray();
		int value = 0;
		for(int i =0; i<str.length ; i++){
			value = countMap.get(Character.toString(str[i]));
			value++;
			countMap.put(Character.toString(str[i]), value);
		}
		
		for(Map.Entry<String, Integer> countDetails :countMap.entrySet()){
			System.out.println(countDetails.getKey() +" "+countDetails.getValue() );
		}
		
		sc.close();
	}

}
