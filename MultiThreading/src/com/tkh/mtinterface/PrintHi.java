package com.tkh.mtinterface;

public class PrintHi implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}

}
