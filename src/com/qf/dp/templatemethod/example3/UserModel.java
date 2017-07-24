package com.qf.dp.templatemethod.example3;

/**
 * @Title: UserModel.java
 * @Package com.qf.dp.templatemethod.example3
 * @Description: 用户数据模型
 * @author haichangzhang
 * @date 2017年7月24日 下午4:55:33
 * @version V1.0
 */
public class UserModel {

	private String userId;
	private String name;
	private int age;

	public UserModel(String userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", name=" + name + ", age=" + age + "]";
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
