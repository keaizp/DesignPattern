package com.zp.adapter.objectadapter;

//适配器类
public class VoltageAdapter implements IVoltage5V {
	private Voltage220V voltage220V;// 关联关系的聚合
	// 通过构造器，传入一个Voltage220V实例

	public VoltageAdapter(Voltage220V voltage220v) {
		super();
		voltage220V = voltage220v;
	}

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int dstV = 0;
		if (voltage220V != null) {
			int srcV = voltage220V.output220V();
			System.out.println("使用对象适配器，进行适配");
			dstV = srcV / 44;
			System.out.println("适配完成，输出的电压为 = " + dstV);
		}
		return dstV;
	}

}
