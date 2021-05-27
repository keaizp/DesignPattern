package com.zp.decorator;

public class Decorator extends Drink {
	private Drink obj;

	public Decorator(Drink obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		// getPrice 自己的价格
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes() + super.getPrice() + "&&" + obj.getDes();
	}
}
