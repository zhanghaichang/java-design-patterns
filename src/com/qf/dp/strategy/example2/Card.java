package com.qf.dp.strategy.example2;

/**
 * @Title: Card.java
 * @Package com.qf.dp.strategy.example2
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月24日 下午1:55:35
 * @version V1.0
 */
public class Card implements PaymentStrategy {

	/***
	 * 支付到银行卡
	 */
	@Override
	public void pay(PaymentContext context) {

		//这个新的算法自己知道要使用扩展的支付上下文
		PaymentContext2 ctx2=(PaymentContext2)context;
		//直接支付到银行卡，就不用去管了
		System.out.println("现在给"+ctx2.getUsername()+"的"+ctx2.getAccount()+"帐号支付了"+ctx2.getMoney()+"元");
	}

}
