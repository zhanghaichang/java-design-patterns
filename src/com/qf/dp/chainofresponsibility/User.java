package com.qf.dp.chainofresponsibility;

/**
 * @Title: User.java
 * @Package com.qf.dp.chainofresponsibility
 * @Description: 用户
 * @author haichangzhang
 * @date 2018年7月13日 下午4:59:20
 * @version V1.0
 */
public class User {

	private String name;

	private double fee;

	public User(String name, double fee) {
		this.name=name;
		this.fee=fee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
