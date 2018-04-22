/**
 * 
 */
package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vivekhs
 *
 */
public class SmallestWindow {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bfd = new BufferedReader(new InputStreamReader(System.in));
		String sentence = bfd.readLine();
		String pattern = bfd.readLine();
		
		System.out.println(sentence+" "+pattern);
		

	}

	public static int getSmallestWindow(String sentence, String pattern) {
		
		return 0;
	}
}
