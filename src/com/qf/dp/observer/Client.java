package com.qf.dp.observer;

/**
 * @Title: Client.java
 * @Package com.qf.dp.observer
 * @Description: 客户端类
 * @author haichangzhang
 * @date 2017年7月31日 下午5:20:04
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		// 创建主题对象
		ConcreteSubject subject = new ConcreteSubject();
		// 创建观察者对象
		Observer observer = new ConcreteObServer();
		// 将观察者对象登记到主题对象上
		subject.attach(observer);
		// 改变主题对象的状态
		subject.change("new state Q");
	}

}
