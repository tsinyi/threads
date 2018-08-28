package com.thread.concurrent.reentry;

public class Thread4 extends Thread {
	private ReEntryService reEntryService;

	public Thread4(ReEntryService reEntryService) {
		super();
		this.reEntryService = reEntryService;
	}

	@Override
	public void run(){
		super.run();
		reEntryService.service1();
	}
}
