package com.thread.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Current Time:"+System.currentTimeMillis());

		Calendar calendar = Calendar.getInstance();

		calendar.add(Calendar.SECOND,10);
		Date runTime = calendar.getTime();

		MyTask myTask = new MyTask();

		Timer timer = new Timer();

		timer.schedule(myTask,runTime);


	}
}
