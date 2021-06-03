package com.zp.visitor;

public class Fail extends Action {
	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println("男人给的评价是该歌手很失败");
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println("女人给的评价是该歌手很失败");
	}
}
