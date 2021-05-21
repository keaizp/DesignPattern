package com.zp.singleton.type6;

public class SingletonTest06 {
	public static void main(String[] args) {
		System.out.println("双重检查");
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hashCode = "+ singleton1.hashCode());
		System.out.println("singleton1.hashCode = "+ singleton2.hashCode());
	}
}

//懒汉式（线程安全，同步方法）
/*
 * 优缺点说明：
 * 1、Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两次if（singleton == null）
 *    检查，这样就可以保证线程安全了。
 * 2、这样实例化代码只需要执行一次，后面再次访问时，判断if（singleton == null），直接return实例化
 *    对象，也避免反复进行方法同步。
 * 3、线程安全；延迟加载；效率较高
 * 4、结论：在实际开发中，推荐使用这种单例设计模式
 */
class Singleton{
	private static volatile Singleton instance;
	
	private Singleton() {}

	//提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
	//同时保证了效率，推荐使用
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
