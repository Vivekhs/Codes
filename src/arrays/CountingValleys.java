/**
 * 
 */
package arrays;

import java.util.Scanner;

/**
 * @author vivekhs
 *
 */
public class CountingValleys {

    static int countingValleys(int n, String s) {
    	int valleysCount =0;
    	int journey = 0;
    	boolean valleyStarted = false;
    	for(int i=0;i <n;i++) {
    		if(s.charAt(i) == 'U') {
    			journey++;
    		}
    		else {
    			journey--;
    		}
    		if(valleyStarted && journey ==0) {
    			valleysCount++;
    			valleyStarted = false;
    			journey = 0;
    		}
    		if(journey < 0 && !valleyStarted) {
    			valleyStarted = true;
    		}
    	}
    	
    	return valleysCount;

    }

    public static void main(String[] args) {
       
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	String s = scanner.next();
    	int count = countingValleys(n, s);
    	System.out.println(count);
        scanner.close();
    }

}
