package com.zp.factory.absfactory.pizzastore.order;

import com.zp.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.zp.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.zp.factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {
	@Override
	public Pizza creaPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}
}
