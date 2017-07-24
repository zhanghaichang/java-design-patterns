package com.qf.dp.strategy.example2;

/**   
* @Title: DollarCash.java 
* @Package com.qf.dp.strategy.example2 
* @Description: TODO
* @author haichangzhang   
* @date 2017年7月24日 下午1:46:39 
* @version V1.0   
*/
public class DollarCash implements PaymentStrategy {
	
	
	

	/* 美金现金支付
	 * @see com.qf.dp.strategy.example2.PaymentStrategy#pay(com.qf.dp.strategy.example2.PaymentContext)
	 */
	@Override
	public void pay(PaymentContext context) {
		System.out.println("现在给"+context.getUsername()+"美金现金支付"+context.getMoney());
	}

}
