package com.zp.prototype.deepclone;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepProtoType p = new DeepProtoType();
		p.name = "曾哥";
		p.deepCloneableTarget = new DeepCloneableTarget("虫翅", "网名");
		// 方式1 完成深拷贝
		DeepProtoType p2 = (DeepProtoType) p.clone();
		System.out.println("p.name = " + p.name + "p.deepCloneableTarget = " + p.deepCloneableTarget.hashCode());
		System.out.println("p2.name = " + p2.name + "p2.deepCloneableTarget = " + p2.deepCloneableTarget.hashCode());

		// 方式 2 完成深拷贝
		DeepProtoType p3 = (DeepProtoType) p.deepClone();
		System.out.println("p.name = " + p.name + "p.deepCloneableTarget = " + p.deepCloneableTarget.hashCode());
		System.out.println("p3.name = " + p3.name + "p2.deepCloneableTarget = " + p3.deepCloneableTarget.hashCode());
	}
}
