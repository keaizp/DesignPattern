package com.zp.singleton.type5;

public class SingletonTest05 {
	public static void main(String[] args) {
		System.out.println("懒汉式，线程不安全");
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println("singleton1.hashCode = "+ singleton1.hashCode());
		System.out.println("singleton1.hashCode = "+ singleton2.hashCode());
	}
}

//懒汉式（线程安全，同步代码块方法）
/*
 * 优缺点说明：
 * 1、这种方式，本意是想对第四种实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的代码块
 * 2、但是这种同步并不能起到线程同步的作用。跟第三种实现方法遇到的情形一致，假如一个线程进入到了
 *    if（singleton == null）判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会
 *    产生多个实例
 * 3、结论：在实际开发中，不能使用这种方式
 */
class Singleton{
	private static Singleton instance;
	
	private Singleton() {}
	
	//提供一个静态的公有方法，加入同步处理方法，解决线程安全问题
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
}
