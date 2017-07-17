package com.qf.dp.singleton;

/**
 * @Title: EagerSingleton.java
 * @Package :com.qf.dp.singleton
 * @Description: 饿汉式单例类
 * @author haichangzhang
 * @date 2017年7月17日 上午11:31:49
 * @version V1.0
 */
public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();

	/***
	 * 私有构造函数
	 */
	private EagerSingleton() {
		System.out.println("EagerSingleton 私有构造函数初始化");
	}

	/***
	 * 静态工厂方法
	 */
	public static EagerSingleton getInstance() {
		return instance;
	}

}
