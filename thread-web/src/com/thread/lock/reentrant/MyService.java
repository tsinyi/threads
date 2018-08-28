package com.thread.lock.reentrant;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock=new ReentrantLock();
	public Condition condition=lock.newCondition();

	public void await(){

		try {
			lock.lock();
			System.out.println("await 时间为："+System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			System.out.println("MyService await Unlock 时间："+System.currentTimeMillis());
			lock.unlock();

		}

	}


	public void  signal(){

		try {
			lock.lock();
			System.out.println("MyService signal 时间："+System.currentTimeMillis());
			condition.signal();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("MyService signal unlock 时间："+System.currentTimeMillis());
			lock.unlock();
		}
	}
}
