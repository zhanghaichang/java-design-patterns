package com.qf.dp.templatemethod.example1;

/**
 * @Title: Account.java
 * @Package com.qf.dp.templatemethod.example1
 * @Description:抽象模板角色类
 * @author haichangzhang
 * @date 2017年7月24日 下午3:03:55
 * @version V1.0
 */
public abstract class Account {

	/**
	 * 模板方法，计算利息数额
	 * 
	 * @return 返回利息数额
	 */
	public final double calculateInterest() {
		double interestRate = doCalculateInterestRate();
		String accountType = doCalculateAccountType();
		double amount = calculateAmount(accountType);
		return amount * interestRate;
	}

	/**
	 * 基本方法留给子类实现
	 */
	protected abstract String doCalculateAccountType();

	/**
	 * 基本方法留给子类实现
	 */
	protected abstract double doCalculateInterestRate();

	/**
	 * 基本方法，已经实现
	 */
	private double calculateAmount(String accountType) {
		/**
		 * 省略相关的业务逻辑
		 */
		return 7234.00;
	}
}
