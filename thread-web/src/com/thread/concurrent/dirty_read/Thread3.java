package com.thread.concurrent.dirty_read;

public class Thread3 extends Thread{

	private PublicVar publicVar;

	public Thread3(PublicVar publicVar) {
		super();
		this.publicVar = publicVar;
	}

	@Override
	public void run(){
		super.run();
		publicVar.setValue("a","b");
	}

	public static void main(String[] args) throws InterruptedException {
		PublicVar publicVar = new PublicVar();
		Thread3 thread3 = new Thread3(publicVar);
		thread3.start();
//		Thread.sleep(100);
		publicVar.getValue();
	}
}
