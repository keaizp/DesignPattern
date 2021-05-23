package com.zp.prototype.improve;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sheep sheep = new Sheep("tom", 1, "白色");
		Sheep friendSheep = new Sheep("jake", 2, "黑色");
		sheep.setFriendSheep(friendSheep);
		Sheep sheep1 = (Sheep) sheep.clone();
		Sheep sheep2 = (Sheep) sheep.clone();
		Sheep sheep3 = (Sheep) sheep.clone();
		Sheep sheep4 = (Sheep) sheep.clone();
		System.out.println("sheep1 = " + sheep1 + sheep1.getFriendSheep().hashCode());
		System.out.println("sheep2 = " + sheep2 + sheep2.getFriendSheep().hashCode());
		System.out.println("sheep3 = " + sheep3 + sheep3.getFriendSheep().hashCode());
		System.out.println("sheep4 = " + sheep4 + sheep4.getFriendSheep().hashCode());
	}

}
