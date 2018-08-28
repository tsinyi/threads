package com.thread.concurrent.volatile_test;

public class RunThread extends Thread {

	private CommValue commValue;

	public CommValue getCommValue() {
		return commValue;
	}

	public void setCommValue(CommValue commValue) {
		this.commValue = commValue;
	}

	public RunThread(CommValue commValue) {
		this.commValue = commValue;
	}

	@Override
	public void run() {
		System.out.println("Enter Runnning State....");
		while (commValue.isRunning()){
			System.out.println("Thread RUNNING ");
		}
		System.out.println("Exit Running ****");
	}

}
