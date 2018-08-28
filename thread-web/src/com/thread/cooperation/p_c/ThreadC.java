package com.thread.cooperation.p_c;

public class ThreadC extends  Thread{
	private Consumer c;

	public ThreadC(Consumer c) {
		this.c = c;
	}

	@Override
	public void run() {
		try {
			while (true)
			c.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
