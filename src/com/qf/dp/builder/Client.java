package com.qf.dp.builder;

/**
 * @Title: Client.java
 * @Package com.qf.db.builder
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月17日 下午2:23:36
 * @version V1.0
 */
public class Client {

	/*
	 * 客户端负责创建导演者和具体建造者对象。然后，客户端把具体建造者对象交给导演者，
	 * 导演者操作具体建造者，开始创建产品。当产品完成后，建造者把产品返还给客户端。 把创建具体建造者对象的任务交给客户端而不是导演者对象，
	 * 是为了将导演者对象与具体建造者对象的耦合变成动态的， 从而使导演者对象可以操纵数个具体建造者对象中的任何一个。
	 */
	public static void main(String[] args) {
		// 创建构建器对象
		InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);
		// 设置需要的数据，然后构建保险合同对象
		InsuranceContract contract = builder.setPersonName("小明").setOtherData("test").build();
		// 操作保险合同对象的方法
		contract.someOperation();

	}
}
