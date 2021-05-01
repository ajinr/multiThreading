package com.tkh.itc;

public class Consumer implements Runnable {
	
	Resource resource;
	
	public Consumer(Resource resource) {
		this.resource = resource;
		Thread t= new Thread(this, "Consumer");
		t.start();
	}
	@Override
	public void run() {
		while(true) {
			resource.getNum();
			try {Thread.sleep(5000);} catch (InterruptedException e) {}
			
		}
		
	}

}
