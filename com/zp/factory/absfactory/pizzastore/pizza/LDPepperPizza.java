package com.zp.factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦胡椒披萨");
		System.out.println("给伦敦胡椒披萨准备原材料");
	}
}
