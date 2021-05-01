package com.tkh.itc;

public class Producer implements Runnable {
	
	Resource resource;

	public Producer(Resource resource) {
		this.resource = resource;
		Thread t= new Thread(this,"Producer");
		t.start();
	}
	
	@Override
	public void run() {
		int i=0;
		while(true) {
			resource.setNum(i++);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}

}
