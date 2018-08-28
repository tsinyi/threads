package com.thread.concurrent.reentry;

public class ReEntryService {

	synchronized public void service1(){
		service2();
		System.out.println("service1");
	}

	synchronized public void service2(){
		service3();
		System.out.println("service2");
	}

	synchronized public void service3(){
//		service2();
		System.out.println("service3");
	}


	public static void main(String[] args) {
		ReEntryService reEntryService = new ReEntryService();
		Thread4 thread4 = new Thread4(reEntryService);
		thread4.start();

	}


}
