package com.thread.cooperation.p_c;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		Producer producer = new Producer(lock);
		Consumer consumer = new Consumer(lock);

		ThreadP[] pThread = new ThreadP[2];
		ThreadC[] cThread = new ThreadC[2];

		for (int i = 0; i < 2; i++) {
			pThread[i] = new ThreadP(producer);
			pThread[i].setName("生产者"+(i+1));
			cThread[i] = new ThreadC(consumer);
			cThread[i].setName("消费者"+(i+1));
			pThread[i].start();
			cThread[i].start();
		}

//		Thread.sleep(5000);

		Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];

		Thread.currentThread().getThreadGroup().enumerate(threads);

		for (int i = 0; i <threads.length ; i++) {
			System.out.println(threads[i].getName()+" "+threads[i].getState());

		}


	}
}
