package com.tkh.mtdemo;

public class PrintHello extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
	}
}
