package com.tkh.mtinterfaceLambda;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable a=()-> {	
				for(int i=0;i<5;i++) {
					System.out.println("Hi");
					try {Thread.sleep(1000);} catch (InterruptedException e) {}
				}				
			}
		;
		
		Thread t1= new Thread(a);
		Runnable b= new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Hello");
					try {Thread.sleep(1000);} catch (InterruptedException e) {}
					}	
			}
		};
		Thread t2= new Thread(b);
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
	}

}
