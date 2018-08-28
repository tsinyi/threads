package com.thread.concurrent.dirty_read;

public class PublicVar {
	public String userName;
	public String password;

	synchronized public void setValue(String userName, String password) {

		try {
			this.password = password;
			Thread.sleep(500);
			this.userName = userName;
			System.out.println("setValue method current thread =" + Thread.currentThread().getName() + ":userName=" + userName + ",password=" + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void getValue() {
		System.out.println("getValue method current thread =" + Thread.currentThread().getName() + ":userName=" + userName + ",password=" + password);
	}
}


