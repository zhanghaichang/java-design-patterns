package com.qf.dp.builder;

/**
 * @Title: Builder.java
 * @Package com.qf.db.builder
 * @Description: 抽象建造者类Builder
 * @author haichangzhang
 * @date 2017年7月17日 下午2:23:09
 * @version V1.0
 */
public interface Builder {

	public void buildPart1();

	public void buildPart2();

	public Product retrieveResult();

}
