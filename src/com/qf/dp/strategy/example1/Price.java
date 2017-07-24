package com.qf.dp.strategy.example1;

/**
 * @Title: Price.java
 * @Package com.qf.dp.strategy
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月20日 下午4:05:30
 * @version V1.0
 */
public class Price {

	// 持有一个具体的策略对象
	private MemberStrategy strategy;
	
	//折扣
	private int discount;

	
	public int getDiscount() {
		return discount;
	}

	/**
	 * 构造函数，传入一个具体的策略对象
	 * 
	 * @param strategy
	 *            具体的策略对象
	 */
	public Price(MemberStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 计算图书的价格
	 * 
	 * @param booksPrice
	 *            图书的原价
	 * @return 计算出打折后的价格
	 */
	public double quote(double booksPrice) {
		this.discount=strategy.discount();
		return this.strategy.calcPrice(booksPrice);
	}
}
