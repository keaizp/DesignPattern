package com.zp.decorator;

public class Milk extends Decorator {
	public Milk(Drink obj) {
		// TODO Auto-generated constructor stub
		super(obj);
		setDes("牛奶");
		setPrice(2.0f);
	}
}
