package com.zp.singleton.type8;

public class SingletonTest08 {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance1 == instance2);
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
	}
}
//使用枚举，实现单例
/*
 * 优缺点：
 * 1、这借助JDK1.5中添加的枚举来实现单例模式，不仅能避免线程同步问题，而且
 *    还能防止反序列化重新创建新的对象
 * 2、这种方式是Effective Java作者Josh Bloch提倡的方式
 * 3、结论：推荐使用
 */
enum Singleton{
	INSTANCE;
	
}