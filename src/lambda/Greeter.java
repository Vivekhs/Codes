/**
 * 
 */
package lambda;

/**
 * @author Vivek Sinha
 *
 */
public class Greeter {
	
	void greet(Greeting greeting){
		greeting.perform();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Greeter greeter =  new Greeter();
		Greeting greeting = new HelloWorldGreeting();
		greeter.greet(greeting);
		
		Greeting innerClassFunc = new Greeting(){

			@Override
			public void perform() {
				System.out.println("Inner class helo world");
			}
			
		};
		
		greeter.greet(innerClassFunc);
		Greeting lambdaFunction = ()-> System.out.println("Lambda function");
		greeter.greet(lambdaFunction);
		
		Parameterised lambdaNew = (String s)->{
			System.out.println(s);
		};
		lambdaNew.print("Hello dude");
		
	}

}

interface Parameterised{
	void print(String t);
}
