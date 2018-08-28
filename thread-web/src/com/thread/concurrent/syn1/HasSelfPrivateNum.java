package com.thread.concurrent.syn1;


public class HasSelfPrivateNum {
	private int num=0;

	/*synchronized*/ public void addI(String userName){

		try {
			if(userName.equals("a")){
				num=+100;
				System.out.println("a set is over");
//				Thread.sleep(100);
			}else {
				num=+200;
				System.out.println("b set is over");
			}
			System.out.println(userName+"num="+num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
