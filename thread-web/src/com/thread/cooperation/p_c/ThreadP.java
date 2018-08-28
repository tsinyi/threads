package com.thread.cooperation.p_c;

public class ThreadP extends Thread{
	private Producer p;

	public ThreadP(Producer p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		try {
			while (true)
			p.setValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
