/**
 * 
 */
package arrays;

import java.util.ArrayList;

/**
 * @author vivekhs
 *
 */
public class MaxNonNegativeSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(1967513926);
		list.add(1540383426);
		list.add(-1303455736);
		list.add(-521595368);
		maxset(list);
	}
	
	public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
		long max =0;
        int start = 0;
        int end = 0;
        long temp = 0;
        int tempStart = 0;
        int tempEnd = 0;
        for(int i=0;i<A.size();i++) {
            int currentValue = A.get(i);
            if(A.get(i)<0) {
                if(temp >= max) {
                    max = temp;
                    start = tempStart;
                    end = tempEnd;
                }
                temp = 0;
                tempEnd = tempStart = i+1;
            }
            else {
                temp += currentValue;
                tempEnd++;
            }
        }
        if(temp > max) {
            start = tempStart;
            end = tempEnd;
        }
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i=start;i<end;i++) {
            output.add(A.get(i));
        }
        return output;
    }

}
