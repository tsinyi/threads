package com.thread.concurrent.dead_lock;

public class TreadTask implements Runnable {

	public String userName;
	public Object lockA = new Object();
	public Object lockB = new Object();

	public void setFlag(String userName) {
		this.userName = userName;
	}


	@Override
	public void run() {
		while (true) {
			if ("a".equals(userName)) {
				synchronized (lockA) {
					try {
						System.out.println("userName=" + userName);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (lockB) {
						System.out.println("userName=" + userName);
					}
				}


			}
			if ("b".equals(userName)) {
				synchronized (lockB) {
					try {
						System.out.println("userName=" + userName);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					synchronized (lockA) {
						System.out.println("userName=" + userName);
					}
				}

			}

		}
	}
}
