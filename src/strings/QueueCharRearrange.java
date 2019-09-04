/**
 * 
 */
package strings;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author vivekhs
 *
 */
//Rearrange characters in a string such that no two adjacent are same
public class QueueCharRearrange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		String input = reader.next();
		Queue<Character> queue = new LinkedList<Character>();
		char[] cArray = input.toCharArray();
		StringBuilder finalString = new StringBuilder();
		for(int i=0; i<cArray.length;i++) {
			queue.add(cArray[i]);
		}
		while(!queue.isEmpty()) {
			char lastChar = (finalString.length() != 0)?finalString.charAt(finalString.length()-1): ' ';
			char firstChar = queue.poll();
			if(firstChar==lastChar) {
				queue.add(firstChar);
			}
			else {
				finalString.append(firstChar);
			}
		}
		System.out.println(finalString.toString());
		
				
		reader.close();

	}

}
