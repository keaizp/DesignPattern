package com.zp.singleton.type4;

public class SingletonTest04 {
	public static void main(String[] args) {
		System.out.println("懒汉式2，线程安全");
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hashCode = "+ singleton1.hashCode());
		System.out.println("singleton1.hashCode = "+ singleton2.hashCode());
	}
}

//懒汉式（线程安全，同步方法）
/*
 * 优缺点：
 * 1、解决了线程不安全问题
 * 2、效率太低了，每个线程在想获得类的实例时候，执行getInstance方法都要进行同步。而
 *    其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。
 *    方法进行同步效率太低
 * 3、结论：在实际开发中，不推荐使用这种方式
 */
class Singleton{
	private static Singleton instance;
	
	private Singleton() {}
	
	//提供一个静态的公有方法，加入同步处理方法，解决线程安全问题
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}