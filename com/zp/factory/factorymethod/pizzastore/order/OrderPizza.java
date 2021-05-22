package com.zp.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.zp.factory.factorymethod.pizzastore.pizza.Pizza;

public abstract class OrderPizza {
	abstract Pizza createPizza(String orderType);

	public OrderPizza() {
		// TODO Auto-generated constructor stub
		Pizza pizza = null;
		String orderType;
		do {
			orderType = getType();
			pizza = createPizza(orderType);// 抽象方法，由工厂子类完成

			// 输出pizza制作过程
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
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
