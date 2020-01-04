/**
 * 
 */
package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Vivek Sinha
 *
 */

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

public class ThreadJoinDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread() {
		}, "t1");
		Thread t2 = new Thread(new MyThread(), "t2");
		Thread t3 = new Thread(new MyThread(), "t3");
		Thread t4 = new Thread(new MyThread(), "t4");
		
		t1.start();
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace(); 
		}
		ExecutorService e = Executors.newFixedThreadPool(5);
		
		t3.start();
		
		
	}

}
