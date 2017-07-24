package com.qf.dp.strategy.example2;

/**   
* @Title: PaymentContext2.java 
* @Package com.qf.dp.strategy.example2 
* @Description: 扩展支付上下文对象
* @author haichangzhang   
* @date 2017年7月24日 下午1:53:34 
* @version V1.0   
*/
public class PaymentContext2 extends PaymentContext {

	/***
	 * 银行账号
	 */
	private String account;
	
	public String getAccount() {
		return account;
	}

	public PaymentContext2(String username, double money, PaymentStrategy strategy,String account) {
		super(username, money, strategy);
		this.account=account;
	}

}
