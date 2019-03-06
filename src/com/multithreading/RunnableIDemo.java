/**
 * 
 */
package com.multithreading;

/**
 * @author vivekrjt
 *
 */

class ThreadDemo implements Runnable{

	Thread t;
	String tName;
	
	ThreadDemo(String tName){
		this.tName = tName;
	}
	
	@Override
	public void run() {
		System.out.println("Thread "+t.getName()+" is running");
		
	}
	
	public void start() {
		t = new Thread(this, tName);
		t.start();
	}
	
}

public class RunnableIDemo {
	
	public static void main(String args[]) {
		ThreadDemo tDemo = new ThreadDemo("MY_THREAD");
		tDemo.start();
	}

}
