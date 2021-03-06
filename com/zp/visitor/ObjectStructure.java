package com.zp.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

	// 维护了一个集合
	private List<Person> persons = new ArrayList<>();

	public void attach(Person p) {
		persons.add(p);
	}

	public void detach(Person p) {
		persons.remove(p);
	}

	// 显示测评情况
	public void display(Action action) {
		for (Person p : persons) {
			p.accept(action);
		}
	}
}
