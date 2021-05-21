package com.zp.singleton.type1;

public class SingletonTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hashCode = "+ singleton1.hashCode());
		System.out.println("singleton1.hashCode = "+ singleton2.hashCode());
	}

}

//饿汉式（静态常量）
/*
 * 优缺点：
 * 1、优点：写法比较简单，就是在类装载的时候就完成实例化，避免了线程同步问题
 * 2、缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果，如果从始至终
 *    从未使用过这个实例，则会造成内存浪费
 * 3、这种方式基于classloader机制避免了多线程的同步问题，不过，instance在类装载的时候
 *    就实例化，在单例模式中大多数都是调用getInstance方法，但是导致类装载的原因有很多种，
 *    因此不能确定有其他方式（或者其他的静态方法）导致类装载，这时候初始化instance就没有达到
 *    lazy Loading的效果
 * 4、结论；这种单例模式可用，可能造成内存浪费
 */
class Singleton{
	
	//1、构造器私有化，外部不能new
	private Singleton() {
		
	}
	//2、本类内部创建对象实例
	private final static Singleton instance = new Singleton();
	
	//3、提供一个公有的静态方法，返回实例对象
	public static Singleton getInstance() {
		return instance;
	}
}