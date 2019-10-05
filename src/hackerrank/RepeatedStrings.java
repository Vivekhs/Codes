/**
 * 
 */
package hackerrank;

/**
 * @author vivekhs
 *
 */
public class RepeatedStrings {
	static long repeatedString(String s, long n) {
		long total = 0;
		int size = s.length();
		long repeatations = n/size;
		long extraChars = n%size;
		int countInString = 0;
		
		for(int i=0;i<size;i++) {
			if(s.charAt(i) == 'a') {
				countInString++;
				if(i<extraChars) {
					total++;
				}
					
			}
		}
		total += countInString*repeatations;
		return total;
    }
}
