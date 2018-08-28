package com.thread.concurrent.synchrblock;

public class Thread5 extends  Thread{

	private SynBlockService synBlockService;

	public Thread5(SynBlockService synBlockService) {
		super();
		this.synBlockService = synBlockService;
	}

	@Override
	public void run(){
		super.run();
		synBlockService.doService();
	}
}
