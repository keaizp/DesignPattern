package com.zp.bridge;

public class UpRightPhone extends Phone {
	public UpRightPhone(Brand brand) {
		// TODO Auto-generated constructor stub
		super(brand);
	}

	public void open() {
		super.open();
		System.out.println("直立样式手机");
	}

	public void close() {
		super.close();
		System.out.println("直立样式手机");
	}

	public void call() {
		super.call();
		System.out.println("直立样式手机");
	}
}
