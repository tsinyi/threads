package com.thread.concurrent.syn1;

public class ThreadA extends Thread{
	private HasSelfPrivateNum pn;

	public ThreadA(HasSelfPrivateNum pn) {
		super();
		this.pn = pn;
	}

	@Override
	public void run(){
		super.run();
		pn.addI("a");
	}


}
