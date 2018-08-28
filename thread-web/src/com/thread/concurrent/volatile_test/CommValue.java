package com.thread.concurrent.volatile_test;

public class CommValue {

	private boolean isRunning=true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean running) {
		isRunning = running;
	}
}
