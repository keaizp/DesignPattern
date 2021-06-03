package com.zp.visitor;

/*
 * 说明
 * 1、这里我们使用到了双分派，即首先在客户端程序中，将具体的状态作为参数传递到Woman中（第一次分派）
 * 2、然后woman 类调用作为参数的“具体方法”中方法getWomanResult，同时将自己（this）作为参数传入
 *         完成第二次分派
 */
public class Woman extends Person {
	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getWomanResult(this);
	}
}
