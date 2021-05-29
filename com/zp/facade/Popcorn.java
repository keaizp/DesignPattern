package com.zp.facade;

public class Popcorn {
	private static Popcorn instance = new Popcorn();

	public static Popcorn getInstance() {
		return instance;
	}

	private Popcorn() {

	}

	public void on() {
		System.out.println("popcorn on");
	}

	public void off() {
		System.out.println("popcorn off");
	}

	public void Pop() {
		System.out.println("popcorn is poping");
	}
}
