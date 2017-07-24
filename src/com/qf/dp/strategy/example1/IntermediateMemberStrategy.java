package com.qf.dp.strategy.example1;

/**
 * @Title: IntermediateMemberStrategy.java
 * @Package com.qf.dp.strategy
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月20日 下午4:04:17
 * @version V1.0
 */
public class IntermediateMemberStrategy implements MemberStrategy {

	private static final double DISCOUNT = 0.9d;

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于中级会员的折扣为10%");
		return booksPrice * DISCOUNT;
	}

	@Override
	public int discount() {
		return (int) (DISCOUNT*10);
	}

}
