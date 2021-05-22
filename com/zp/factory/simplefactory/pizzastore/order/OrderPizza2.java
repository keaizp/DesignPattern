package com.zp.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.zp.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza2 {
	Pizza pizza = null;
	String orderType = "";

	public OrderPizza2() {
		// TODO Auto-generated constructor stub
		do {
			orderType = getType();
			pizza = SimpleFactory.createPizza2(orderType);

			// 输出披萨
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购披萨失败");
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
