package com.zp.command;

/*
 * 没有任何命令，即空执行：用于初始化每个按钮，当调用空命令时，对象什么都不做即可
 * 这也是一种设计模式，可以省掉空判断
 */
public class NoCommand implements Command {
	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub

	}
}
