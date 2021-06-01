package com.zp.template.improve;

public abstract class SoyaMilk {

	// 模板方法，make，模板方法可以做成final，不让子类去覆盖
	final void make() {

		select();
		if (customerWantCondiments()) {
			addCondiments();
		}
		soak();
		beat();
	}

	void select() {
		System.out.println("第一步：选择好新鲜的黄豆");
	}

	abstract void addCondiments();

	void soak() {
		System.out.println("第二步：黄豆和配料开始浸泡，需要3个小时");
	}

	void beat() {
		System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
	}

	boolean customerWantCondiments() {
		return true;
	}
}
