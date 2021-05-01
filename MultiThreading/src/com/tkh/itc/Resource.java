package com.tkh.itc;

public class Resource {

	private int num;
	private boolean flag=false;

	public synchronized void setNum(int num) {

		while(flag) {
			try {wait();} catch (InterruptedException e) {}
		}		
		this.num = num;
		System.out.println("Producer Put: "+num);
		flag=true;
		notify();
	}

	public synchronized void getNum() {
		while(flag=false) {
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("Consumer Get:  "+num);
		flag=false;
		notify();
	}





}
