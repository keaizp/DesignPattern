package com.zp.command;

public class LightOffCommand implements Command {
	// 聚合LightReceiver
	LightReceiver light;

	public LightOffCommand(LightReceiver light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// 调用接收者的方法
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// 调用接收者的方法
		light.on();
	}
}
