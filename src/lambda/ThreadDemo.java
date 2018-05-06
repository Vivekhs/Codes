/**
 * 
 */
package lambda;

/**
 * @author Vivek Sinha
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Annonymous runnable interface impl");
			}
		});
		
		thread.run();
		Thread lambdaThread = new Thread(()-> System.out.println("Lambda thread"));
		lambdaThread.run();
		//lambdaThread.start();
	}

}
