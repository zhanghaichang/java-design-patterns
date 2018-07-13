
package com.qf.dp.chainofresponsibility;

/**
 * @Title: ProjectManager.java
 * @Package com.qf.dp.chainofresponsibility
 * @Description: 具体处理者角色
 * @author haichangzhang
 * @date 2018年7月13日 下午4:42:27
 * @version V1.0
 */
public class ProjectManager extends Handler {

	private String name;

	private String title;

	public ProjectManager(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}

	@Override
	public String handleFeeRequest(User user) {
		String str = "";
		// 项目经理权限比较小，只能在500以内
		if (user.getFee() < 500) {
			// 为了测试，简单点，只同意张三的请求
			if ("张三".equals(user.getName())) {
				str = "成功："+name+" "+title+"同意【" + user.getName() + "】的聚餐费用，金额为" + user.getFee() + "元";
			} else {
				// 其他人一律不同意
				str = "失败："+name+" "+title+"不同意【" + user.getName() + "】的聚餐费用，金额为" + user.getFee() + "元";
			}
		} else {
			// 超过500，继续传递给级别更高的人处理
			if (getSuccessor() != null) {
				System.out.println("当前"+name+" "+title+"没有权限处理申请金额大于500元，转为下一位处理人");
				return getSuccessor().handleFeeRequest(user);
			}
		}
		return str;
	}

}
