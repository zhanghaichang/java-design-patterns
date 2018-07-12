package com.qf.dp.decorator.example2;

/**
 * @Title: Decorator.java
 * @Package com.qf.dp.decorator.example2
 * @Description: 装饰器的接口，需要跟被装饰的对象实现同样的接口
 * @author haichangzhang
 * @date 2018年7月12日 下午5:44:17
 * @version V1.0
 */
public abstract class Decorator implements GoodsSaleEbi {

	/**
	 * 持有被装饰的组件对象
	 */
	protected GoodsSaleEbi ebi;

	
    /** 
     * 通过构造方法传入被装饰的对象 
     * @param ebi被装饰的对象 
     */  
	public Decorator(GoodsSaleEbi ebi) {
		this.ebi = ebi;
	}
}
