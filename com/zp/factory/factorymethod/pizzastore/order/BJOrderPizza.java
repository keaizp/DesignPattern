package com.zp.factory.factorymethod.pizzastore.order;

import com.zp.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.zp.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.zp.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String orderType) {
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
