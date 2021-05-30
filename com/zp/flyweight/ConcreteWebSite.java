package com.zp.flyweight;

public class ConcreteWebSite extends WebSite {

	// 共享的部分，内部状态
	private String type = "";

//构造器
	public ConcreteWebSite(String type) {
		super();
		this.type = type;
	}

	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("网站发布形式为：" + type + "正在使用。。使用者是" + user.getName());
	}
}
