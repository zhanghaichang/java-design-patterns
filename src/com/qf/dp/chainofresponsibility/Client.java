package com.qf.dp.chainofresponsibility;

/**
 * @Title: Client.java
 * @Package com.qf.dp.chainofresponsibility
 * @Description: 客户端类
 * @author haichangzhang
 * @date 2018年7月13日 下午4:45:56
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		// 先要组装责任链
		Handler h1 = new GeneralManager("王五", "总经理");
		Handler h2 = new DeptManager("赵六", "部门经理");
		Handler h3 = new ProjectManager("麻七", "项目经理");

		h3.setSuccessor(h2);
		h2.setSuccessor(h1);

		// 开始测试
		String test1 = h3.handleFeeRequest(new User("张三", 300));
		System.out.println("test1 = " + test1);
		String test2 = h3.handleFeeRequest(new User("李四", 300));
		System.out.println("test2 = " + test2);
		System.out.println("---------------------------------------");

		String test3 = h3.handleFeeRequest(new User("张三", 700));
		System.out.println("test3 = " + test3);
		String test4 = h3.handleFeeRequest(new User("李四", 700));
		System.out.println("test4 = " + test4);
		System.out.println("---------------------------------------");

		String test5 = h3.handleFeeRequest(new User("张三", 1500));
		System.out.println("test5 = " + test5);
		String test6 = h3.handleFeeRequest(new User("李四", 1500));
		System.out.println("test6 = " + test6);
	}

}
