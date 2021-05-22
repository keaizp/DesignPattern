package com.zp.factory.factorymethod.pizzastore.order;

import com.zp.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.zp.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.zp.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
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
