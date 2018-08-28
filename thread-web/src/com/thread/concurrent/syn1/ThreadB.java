package com.thread.concurrent.syn1;

public class ThreadB extends Thread{
	private HasSelfPrivateNum pn;

	public ThreadB(HasSelfPrivateNum pn) {
		super();
		this.pn = pn;
	}

	@Override
	public void run(){
		super.run();
		pn.addI("b");
	}


}
