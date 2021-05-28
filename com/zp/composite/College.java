package com.zp.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {
	List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

	public College(String name, String des) {
		// TODO Auto-generated constructor stub
		super(name, des);
	}

	@Override
	protected void add(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		// 将来实际业务中，College的add和University add不一定完全一样
		organizationComponents.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		// TODO Auto-generated method stub
		organizationComponents.remove(organizationComponent);
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

	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println("----------" + getName() + "----------");
		// 遍历organizationComponents
		for (OrganizationComponent organizationComponent : organizationComponents) {
			organizationComponent.print();
		}
	}
}
