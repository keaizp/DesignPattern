package com.zp.facade;

public class TheaterLight {
	private static TheaterLight instance = new TheaterLight();

	public static TheaterLight getInstance() {
		return instance;
	}

	private TheaterLight() {

	}

	public void on() {
		System.out.println("TheaterLight on");
	}

	public void off() {
		System.out.println("TheaterLight off");
	}

	public void dim() {
		System.out.println("TheaterLight dim..");
	}

	public void bright() {
		System.out.println("TheaherLight bright..");
	}
}
