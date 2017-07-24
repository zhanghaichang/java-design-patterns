package com.qf.dp.strategy.example1;

/**
 * @Title: PrimaryMemberStrategy.java
 * @Package com.qf.dp.strategy
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月20日 下午4:03:10
 * @version V1.0
 */
public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于初级会员的没有折扣");
		return booksPrice;
	}

	@Override
	public int discount() {
		return 0;
	}

}
