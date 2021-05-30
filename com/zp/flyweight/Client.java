package com.zp.flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 创建一个工厂类
		WebSiteFactory webSiteFactory = new WebSiteFactory();

		// 客户要一个新闻形式发布的网站
		WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");

		webSite1.use(new User("tom"));

		// 客户要一个博客形式发布的网站
		WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");

		webSite2.use(new User("zp"));

		// 客户要一个新闻形式发布的网站
		WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");

		webSite3.use(new User("keaizp"));

		// 客户要一个新闻形式发布的网站
		WebSite webSite4 = webSiteFactory.getWebSiteCategory("博客");

		webSite4.use(new User("jake"));

		System.out.println("网站的分类共 = " + webSiteFactory.getWebsiteCount());
	}

}
