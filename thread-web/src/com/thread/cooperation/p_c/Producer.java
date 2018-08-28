package com.thread.cooperation.p_c;



public class Producer {
	private String lock;

	public Producer(String lock) {
		this.lock = lock;
	}

	public void setValue() throws InterruptedException {

		synchronized (lock) {
			if(!ValueObject.value.equals("")){
				System.out.println("生产者 :"+Thread.currentThread().getName()+"进入 WAITING ※");
				lock.wait();
			}
			System.out.println("生产者 :"+Thread.currentThread().getName()+"进入 RUNNIG");
			String value = System.currentTimeMillis() + "_" + System.nanoTime();
			ValueObject.value=value;
			lock.notify();
		}
	}

}
