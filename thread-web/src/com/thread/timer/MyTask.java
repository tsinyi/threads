package com.thread.timer;

import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("Task To Be Executed,Current Time:"+System.currentTimeMillis());
	}
}
