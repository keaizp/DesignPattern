package com.zp.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {
	public static void main(String[] args) {
		String loc = getLoc();
		if (loc.equals("bj")) {
			new BJOrderPizza();
		} else if (loc.equals("ld")) {
			new LDOrderPizza();
		}
	}

	private static String getLoc() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 地区：");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			return "";
		}
	}
}
