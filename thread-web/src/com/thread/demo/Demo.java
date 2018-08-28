package com.thread.demo;

public class Demo {


	public static void main(String[] args) throws InterruptedException {

		Thread t=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(1);
			}
		});


		t.start();
		Thread.sleep(100);
		System.out.println(2);


	}
}
