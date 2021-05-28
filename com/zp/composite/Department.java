package com.zp.composite;

public class Department extends OrganizationComponent {

	public Department(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void print() {
		// TODO Auto-generated method stub

		System.out.println(getName());
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}
}
