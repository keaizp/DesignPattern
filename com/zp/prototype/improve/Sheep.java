package com.zp.prototype.improve;

public class Sheep implements Cloneable {
	private String name;
	private int age;
	private String color;
	private Sheep friendSheep;

	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sheep getFriendSheep() {
		return friendSheep;
	}

	public void setFriendSheep(Sheep friendSheep) {
		this.friendSheep = friendSheep;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", friendSheep=" + friendSheep + "]";
	}

	// 克隆该实例，使用默认的clone方法来完成
	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return sheep;
	}
}
