package com.qf.dp.templatemethod.example1;

/**
 * @Title: MoneyMarketAccount.java
 * @Package com.qf.dp.templatemethod.example1
 * @Description: 具体模板角色类
 * @author haichangzhang
 * @date 2017年7月24日 下午3:15:10
 * @version V1.0
 */
public class MoneyMarketAccount extends Account {

	@Override
	protected String doCalculateAccountType() {
		return "Money Market";
	}

	@Override
	protected double doCalculateInterestRate() {
		return 0.045;
	}

}
