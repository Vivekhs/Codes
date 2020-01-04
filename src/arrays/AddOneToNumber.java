/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author vivekhs
 * https://www.interviewbit.com/problems/add-one-to-number/
 */
public class AddOneToNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		ArrayList output = plusOne(input);
		System.out.println(output.toString());
	}
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		int extra =1;
		for(int i=(A.size()-1); i >= 0;i--) {
			int num = A.get(i) + extra;
			if(num > 9) {
				extra = 1;
				num = 0;
			}
			else {
				extra = 0;
			}
			stack.add(num);
		}
		
		if(extra == 1) {
			stack.add(1);
		}
		boolean isNumber = false;
		while(!isNumber) {
			int num = stack.peek();
			if(num == 0) {
				stack.pop();
			}
			else {
				isNumber = true;
			}
		}
		while(!stack.isEmpty()) {
			output.add(stack.pop());
		}
		return output;
    }

}
