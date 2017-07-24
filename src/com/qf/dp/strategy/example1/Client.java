package com.qf.dp.strategy.example1;

/**
 * @Title: Client.java
 * @Package com.qf.dp.strategy
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月20日 下午4:00:32
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		User user = new User();
		user.setId("123456789");
		user.setLevel(3);
		user.setUsername("小明");
		user.setAmount(500d);
		// 选择并创建需要使用的初级会员策略对象
		MemberStrategy strategy = new PrimaryMemberStrategy();
		// 中级会员
		if (user.getLevel() == 2) {
			strategy = new IntermediateMemberStrategy();
		}
		// 高级会员
		if (user.getLevel() == 3) {
			strategy = new AdvancedMemberStrategy();
		}
		// 创建环境
		Price price = new Price(strategy);
		user.setPrice(price.quote(user.getAmount()));
		user.setDiscount(price.getDiscount());
		System.out.println(user);
	}

}
