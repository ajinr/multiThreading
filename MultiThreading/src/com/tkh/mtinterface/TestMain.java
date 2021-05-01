package com.tkh.mtinterface;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		Runnable a= new PrintHi();
		Thread t1= new Thread(a);
		Runnable b= new PrintHello();
		Thread t2= new Thread(b);
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
		
		//System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		
		//System.out.println(t1.isAlive());
		System.out.println("Bye");
		System.out.println(Thread.currentThread());
	}

}
