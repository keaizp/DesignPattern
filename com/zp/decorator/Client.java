package com.zp.decorator;

public class Client {
	public static void main(String[] args) {

		Drink drink = new Espresso();
		System.out.println(drink.getDes() + "  费用=" + drink.cost());
		drink = new Milk(drink);
		System.out.println(drink.getDes() + "  费用=" + drink.cost());
		drink = new Chocolate(drink);
		System.out.println(drink.getDes() + "  费用=" + drink.cost());
		drink = new Chocolate(drink);
		System.out.println(drink.getDes() + "  费用=" + drink.cost());
	}
}
