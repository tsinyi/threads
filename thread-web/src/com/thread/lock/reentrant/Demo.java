package com.thread.lock.reentrant;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		MyService myService = new MyService();

		ThreadA threadA = new ThreadA(myService);
		threadA.start();
		Thread.sleep(1000);
//		myService.signal();

	}
}
