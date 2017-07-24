package com.qf.dp.strategy.example1;

/**
 * @Title: AdvancedMemberStrategy.java
 * @Package com.qf.dp.strategy
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月20日 下午4:04:48
 * @version V1.0
 */
public class AdvancedMemberStrategy implements MemberStrategy {

	private static final double DISCOUNT = 0.8d;

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("对于高级会员的折扣为20%");
		return booksPrice * DISCOUNT;
	}

	@Override
	public int discount() {
		return (int) (DISCOUNT * 10);
	}

}
