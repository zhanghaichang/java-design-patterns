package com.qf.dp.strategy.example2;

/**
 * @Title: Client.java
 * @Package com.qf.dp.strategy.example2
 * @Description: 策略模式--工资支付
 * @author haichangzhang
 * @date 2017年7月24日 上午11:48:25
 * @version V1.0
 */
public class Client {

	public static void main(String [] args) {

		//准备Patter支付上下文
		PaymentContext context = new PaymentContext("Petter", 1000, new DollarCash());
		context.payNow();
		//切换一个人,给李四支付工资
		context=new PaymentContext("李四",6000, new RMBCash());
		context.payNow();
		//添加新的支付方式
		context=new PaymentContext2("小王",80000,new Card(),"1234567890");
		context.payNow();
	}

}
