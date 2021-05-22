package com.zp.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.zp.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {

//	public OrderPizza() {
//		// TODO Auto-generated constructor stub
//		Pizza pizza = null;
//		String orderType;
//		do {
//			orderType = getType();
//			if (orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName("希腊披萨");
//			} else if (orderType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName("奶酪披萨");
//			}else if (orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒披萨");
//			} else {
//				break;
//			}
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//		} while (true);
//
//	}

	SimpleFactory simpleFactory;
	Pizza pizza = null;

	// 构造器
	public OrderPizza(SimpleFactory simpleFactory) {
		// TODO Auto-generated constructor stub
		setFactory(simpleFactory);
	}

	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";

		this.simpleFactory = simpleFactory;
		do {
			orderType = getType();
			pizza = this.simpleFactory.createPizza(orderType);

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
