package com.tkh.itc;

public class InterThread {

	public static void main(String[] args) {
		Resource resource= new Resource();
		new Producer(resource);
		new Consumer(resource);

	}

}
