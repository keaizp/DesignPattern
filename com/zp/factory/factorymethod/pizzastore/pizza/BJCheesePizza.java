package com.zp.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京奶酪披萨");
		System.out.println("给北京奶酪披萨准备原材料");
	}
}
