package com.tkh.mtinterface;

public class PrintHello implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
	}
}
