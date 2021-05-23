package com.zp.factory.absfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦奶酪披萨");
		System.out.println("给伦敦奶酪披萨准备原材料");
	}
}
