package com.zp.adapter.classadapter;

//被适配的类
public class Voltage220V {
	public int output220V() {
		// 输出220V的电压
		int src = 220;
		System.out.println("电压 = " + src + "V");
		return src;
	}
}
