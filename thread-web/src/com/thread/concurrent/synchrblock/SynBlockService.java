package com.thread.concurrent.synchrblock;

public class SynBlockService {
	public void doService(){

		try {
			synchronized (this) {
				System.out.println("begin time="+System.currentTimeMillis());
				Thread.sleep(1000);
				System.out.println("end time="+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		SynBlockService synBlockService = new SynBlockService();
		Thread5 thread1 = new Thread5(synBlockService);
		thread1.setName("1");
		thread1.start();

		Thread5 thread2 = new Thread5(synBlockService);
		thread2.setName("2");
		thread2.start();
	}
}
