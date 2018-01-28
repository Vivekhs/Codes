/**
 * 
 */
package com.multithreading;

/**
 * @author vivekrjt
 *
 */

class ResourceTest{
	 void syncTest() {
		System.out.println("Inside resource"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After thread sleep");
	}
}

class ThreadTest implements Runnable{

	Thread t;
	ResourceTest test;
	
	ThreadTest(ResourceTest test){
		this.test = test;
	}
	@Override
	public void run() {
		test.syncTest();
		
	}
	
	public void start() {
		t = new Thread(this);
		t.start();
		
	}
	
}
public class ThreadSyncDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResourceTest test = new ResourceTest();
		ThreadTest t1 = new ThreadTest(test);
		ThreadTest t2 = new ThreadTest(test);
		t1.start();
		t2.start();
		
	}

}
