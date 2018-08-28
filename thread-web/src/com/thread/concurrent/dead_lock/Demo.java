package com.thread.concurrent.dead_lock;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		TreadTask t = new TreadTask();
		t.setFlag("a");

		Thread thread1 = new Thread(t);

		thread1.start();

		Thread.sleep(30);

		t.setFlag("b");
		Thread thread2 = new Thread(t);
		thread2.start();
	}

}
