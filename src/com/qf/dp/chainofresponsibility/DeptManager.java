package com.qf.dp.chainofresponsibility;

/**
 * @Title: DeptManager.java
 * @Package com.qf.dp.chainofresponsibility
 * @Description: 部门经理的
 * @author haichangzhang
 * @date 2018年7月13日 下午4:44:01
 * @version V1.0
 */
public class DeptManager extends Handler {
	
	
	public DeptManager(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}


	private String name;
	
	private String title;
	

	@Override
	public String handleFeeRequest(User user) {
		String str = "";
		// 部门经理的权限只能在1000以内
		if (user.getFee() < 1000) {
			// 为了测试，简单点，只同意张三的请求
			if ("张三".equals(user.getName())) {
				str = "成功："+name+" "+title+"同意【" + user.getName() + "】的聚餐费用，金额为" + user.getFee() + "元";
			} else {
				// 其他人一律不同意
				str = "失败："+name+" "+title+"不同意【" + user.getName() + "】的聚餐费用，金额为" + user.getFee() + "元";
			}
		} else {
			if (getSuccessor() != null) {
				System.out.println("当前"+name+" "+title+"没有权限处理申请金额大于1000元，转为下一位处理人");
				return getSuccessor().handleFeeRequest(user);
			}

		}
		return str;
	}

}
