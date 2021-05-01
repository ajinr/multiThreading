package com.tkh.mtdemo;

public class TestMain {

	public static void main(String[] args) throws InterruptedException {
		PrintHi a= new PrintHi();
		PrintHello b= new PrintHello();
		a.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		b.start();
	}

}
