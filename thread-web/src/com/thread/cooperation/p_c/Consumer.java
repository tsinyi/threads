package com.thread.cooperation.p_c;

public class Consumer {
	private String lock;

	public Consumer(String lock) {
		this.lock = lock;
	}

	public void getValue() throws InterruptedException {
		synchronized (lock){
			if(ValueObject.value.equals("")){
				System.out.println("消费者 :"+Thread.currentThread().getName()+"进入 WAITING ○");
				lock.wait();
			}
			System.out.println("消费者 :"+Thread.currentThread().getName()+"进入 RUNNIG");
//			System.out.println("get 到的值："+ValueObject.value);
			ValueObject.value="";
			lock.notify();
		}
	}
}
