package com.thread.lock.reentrant;

public class ThreadA extends Thread {

	private MyService myService;

	public ThreadA(MyService myService) {
		this.myService = myService;
	}

	@Override
	public void run(){
		myService.await();
	}
}
