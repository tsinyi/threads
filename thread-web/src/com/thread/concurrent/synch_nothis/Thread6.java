package com.thread.concurrent.synch_nothis;

public class Thread6 extends Thread {
	private MyOneList list;

	public Thread6(MyOneList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		Service2 service2 = new Service2();
		super.run();
		service2.addServiceMethod(list,"B");
	}


}
