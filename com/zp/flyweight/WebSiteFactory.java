package com.zp.flyweight;

import java.util.HashMap;

public class WebSiteFactory {
//集合，充当池的作用
	private HashMap<String, ConcreteWebSite> poolHashMap = new HashMap<>();

	// 根据网站的类型，返回一个网站，如果没有就创建一个网站，并放到池中，并返回
	public WebSite getWebSiteCategory(String type) {
		if (!poolHashMap.containsKey(type)) {
			poolHashMap.put(type, new ConcreteWebSite(type));
		}
		return (WebSite) poolHashMap.get(type);
	}

	// 获取网站分类的总数（池中有多少个网站类型）
	public int getWebsiteCount() {
		return poolHashMap.size();
	}
}
