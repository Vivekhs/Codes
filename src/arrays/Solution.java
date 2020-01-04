/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS;

/**
 * @author vivekhs
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrA = {
				7, 14, 9, 6, 11, 12, 14,15
		};
		int[] arrB = {
				18, 14,13, 2, 18, 16, 2, 10
		};
		List x = anotherapproach(arrA, arrB);
		System.out.println(x.toString());
	}
	
	static List<Integer> anotherapproach(int arrA[], int[] arrB){
	    int n=arrA.length;
	    Arrays.sort(arrA);
	    Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
	    for(int i=0;i<n;){
	        int j=i;
	        for(;j<n-1;j++)
	            if(arrA[j]<arrA[j+1]-1)
	                break;
	        for(int k=i;k<=j;k++)
	        	mp.put(arrA[k], arrA[j]);
	        i=j+1;
	    }
	    
	    List<Integer> ans = new LinkedList<Integer>();
	    for(int x:arrB){
	        if(mp.get(x)== null){
	            if(mp.get(x+1)==null)
	            {
	            	ans.add(x+1);
	            }
	            else {
	            	ans.add(mp.get(x+1)+1);
	            }
	        }
	        else {
	        	ans.add(mp.get(x)+1);
	        }    
	    }
	    return ans;
	    
	}
	
 

}
