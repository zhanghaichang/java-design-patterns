package com.qf.dp.singleton;

/**
 * @Title: LazySingleton.java
 * @Package com.qf.dp.singleton
 * @Description: 懒汉式单例类
 * @author haichangzhang
 * @date 2017年7月17日 上午11:39:29
 * @version V1.0
 */
public class LazySingleton {

	private static LazySingleton instance = null;

	/**
     * 私有默认构造子
     */
	private LazySingleton() {
		System.out.println("LazySingleton 私有构造函数初始化");
	}

	 /**
     * 静态工厂方法
     */
	public static synchronized LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
