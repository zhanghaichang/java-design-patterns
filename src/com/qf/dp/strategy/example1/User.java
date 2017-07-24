package com.qf.dp.strategy.example1;

/**
 * @Title: User.java
 * @Package com.qf.dp.strategy
 * @Description: 用户
 * @author haichangzhang
 * @date 2017年7月20日 下午4:10:23
 * @version V1.0
 */
public class User {

	private String id;
	private Integer level;
	private String username;
	private double amount;
	private int discount;
	private double price;

	@Override
	public String toString() {
		return "用户 [id=" + id + ", 会员等级level=" + level + ", 用户名=" + username + ", 总计=" + amount + ", 折扣=" + discount
				+ ", 打折后价格=" + price + "]";
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
