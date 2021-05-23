package com.zp.factory.absfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.zp.factory.absfactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	AbsFactory absFactory;

	public OrderPizza(AbsFactory absFactory) {
		// TODO Auto-generated constructor stub
		setAbsFactory(absFactory);
	}

	public void setAbsFactory(AbsFactory absFactory) {
		Pizza pizza = null;
		String orderType = "";
		this.absFactory = absFactory;
		do {

			orderType = getType();
			pizza = absFactory.creaPizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购失败");
				break;
			}
		} while (true);
	}

	private String getType() {
		// TODO Auto-generated method stub
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类：");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return "";
		}
	}
}
