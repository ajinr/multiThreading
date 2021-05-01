package com.tkh.sync;

public class SyncDemo {
	int count;
	public synchronized void counter() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {

		SyncDemo obj= new SyncDemo();		

		Thread t1= new Thread(()-> {
			for(int i=0;i<1000;i++) {
				obj.counter();
			}
		});
		Thread t2= new Thread(()-> {
			for(int i=0;i<1000;i++) {
				obj.counter();
			}

		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj.count);
	}

}
