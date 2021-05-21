package com.zp.singleton.type2;

public class SingletonTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hashCode = "+ singleton1.hashCode());
		System.out.println("singleton1.hashCode = "+ singleton2.hashCode());
	}

}

//饿汉式（静态代码块）
/*
 * 优缺点：
 * 1、这种方式和第一种方式类似，只不过将类实例化的过程放在了静态代码块中，也是类装载的时候，
 *    就执行静态代码块中的代码，初始化类的实例。优缺点和第一种方式一样
 * 2、结论：这种单例模式可用，但是可能造成内存浪费
 */
class Singleton{
	
	//1、构造器私有化，外部不能new
	private Singleton() {
		
	}
	
	//2、本类内部创建对象实例
	private static Singleton instance;
	
	static {
		instance = new Singleton();
	}
	//3、提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}
