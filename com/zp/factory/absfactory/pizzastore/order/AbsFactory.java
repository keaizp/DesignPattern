package com.zp.factory.absfactory.pizzastore.order;

import com.zp.factory.absfactory.pizzastore.pizza.Pizza;

//一个抽象工厂的抽象层（接口）
public interface AbsFactory {
	public Pizza creaPizza(String orderType);
}
