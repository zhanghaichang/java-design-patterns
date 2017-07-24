package com.qf.dp.strategy.example1;

/**
 * @Title: MemberStrategy.java
 * @Package com.qf.dp.strategy
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月20日 下午4:01:12
 * @version V1.0
 */
public interface MemberStrategy {

	/***
	 * 
	 * @Title: 计算图书的价格 @Description: @param @param booksPrice @param @return
	 * 计算出打折后的价格 @return double 返回类型 @throws
	 */
	public double calcPrice(double booksPrice);

	/**
	 * @Title: discount @Description: 折扣
	 * 返回类型 @throws
	 */
	public int discount();

}
