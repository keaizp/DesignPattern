package com.zp.factory.absfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京胡椒披萨");
		System.out.println("给北京胡椒披萨准备原材料");
	}
}
