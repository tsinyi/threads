package com.thread.concurrent.volatile_test;

public class Demo {


	public static void main(String[] args) throws InterruptedException {

		CommValue commValue = new CommValue();

		RunThread runThread = new RunThread(commValue);
		RunThread runThread2 = new RunThread(commValue);
		runThread.start();
		runThread2.start();

		Thread.sleep(100);

		runThread.getCommValue().setRunning(false);

		ThreadLocal t=new InheritableThreadLocal();



	}
}
