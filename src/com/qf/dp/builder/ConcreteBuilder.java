package com.qf.dp.builder;

/**
 * @Title: ConcreteBuilder.java
 * @Package com.qf.db.builder
 * @Description: TODO
 * @author haichangzhang
 * @date 2017年7月17日 下午2:27:17
 * @version V1.0
 */
public class ConcreteBuilder implements Builder {

	private Product product = new Product();

	/**
	 * 产品零件建造方法1
	 */
	@Override
	public void buildPart1() {
		product.setPart1("编号：9527");

	}

	@Override
	public void buildPart2() {
		// 构建产品的第二个零件
		product.setPart2("名称:root");

	}

	@Override
	public Product retrieveResult() {
		return product;
	}

}
