package com.qf.dp.chainofresponsibility;

/**
 * @Title: GeneralManager.java
 * @Package com.qf.dp.chainofresponsibility
 * @Description: 总经理
 * @author haichangzhang
 * @date 2018年7月13日 下午4:44:55
 * @version V1.0
 */
public class GeneralManager extends Handler {
	
	
	public GeneralManager(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}



	private String name;
	
	private String title;
	
	

	// 总经理的权限很大，只要请求到了这里，他都可以处理
	@Override
	public String handleFeeRequest(User user) {
		String str = "";
		// 总经理的权限很大，只要请求到了这里，他都可以处理
		if (user.getFee() >= 1000) {
			// 为了测试，简单点，只同意张三的请求
			if ("张三".equals(user.getName())) {
				str = "成功："+name+" "+title+"同意【" + user.getName() + "】的聚餐费用，金额为" + user.getFee() + "元";
			} else {
				// 其他人一律不同意
				str = "失败："+name+" "+title+"不同意【" + user.getName() + "】的聚餐费用，金额为" +  user.getFee() + "元";
			}
		} else {
			// 如果还有后继的处理对象，继续传递
			if (getSuccessor() != null) {
				System.out.println("当前"+name+" "+title+"没有权限处理申请金额大于1000元，转为下一位处理人");
				return getSuccessor().handleFeeRequest(user);
			}
		}
		return str;
	}

}
