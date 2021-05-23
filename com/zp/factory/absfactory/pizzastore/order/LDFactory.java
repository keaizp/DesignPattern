package com.zp.factory.absfactory.pizzastore.order;

import com.zp.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.zp.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.zp.factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
	@Override
	public Pizza creaPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
}
