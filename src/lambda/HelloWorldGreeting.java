/**
 * 
 */
package lambda;

import java.util.Scanner;

/**
 * @author Vivek Sinha
 *
 */
public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello World");
	}

}
