package com.thread.concurrent.synch_nothis;

import java.util.List;

public class Service2 {

	public MyOneList addServiceMethod(MyOneList list, String data) {
		if (list.getSize() < 1) {
			try {
//				Thread.sleep(1000);
				list.add(data);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public static void main(String[] args) throws InterruptedException {
		MyOneList myOneList = new MyOneList();
		Thread5 thread5 = new Thread5(myOneList);
		Thread6 thread6 = new Thread6(myOneList);
		thread5.start();
		System.out.println(myOneList.getSize());
		System.out.println("------timer start------");
		Thread.sleep(30000);
		System.out.println("------timer end------");
		thread6.start();
		System.out.println(myOneList.getSize());


//		Object obj = new Integer(100);
//		String obj1 = (String) obj;
//		System.out.println(obj1);



	}

}
