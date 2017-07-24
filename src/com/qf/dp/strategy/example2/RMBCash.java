package com.qf.dp.strategy.example2;

/**
 * 人民币现金支付
 */
public class RMBCash implements PaymentStrategy {

	@Override
	public void pay(PaymentContext ctx) {
		System.out.println("现在给" + ctx.getUsername() + "人民币现金支付" + ctx.getMoney() + "元");
	}

}
