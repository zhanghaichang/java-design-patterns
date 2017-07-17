package com.qf.dp.singleton;


/**
 * @Title: Singleton.java
 * @Package com.qf.dp.singleton
 * @Description:Lazy initialization holder class模式
 * @author haichangzhang
 * @date 2017年7月17日 上午11:37:54
 * @version V1.0
 */
public class Singleton {

	private Singleton() {
		System.out.println("Singleton 私有构造函数初始化");
	}

	private static class SingletonHolder {
		/***
		 * 静态初始化器，由JVM来保证线程安全
		 */
		private static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
