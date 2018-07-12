package com.qf.dp.decorator.example1;

import java.util.Date;

/**
 * @Title: Decorator.java
 * @Package com.qf.dp.decorator.example1
 * @Description: 装饰器的接口，需要跟被装饰的对象实现同样的接口
 * @author haichangzhang
 * @date 2018年7月12日 下午4:47:11
 * @version V1.0
 */
public abstract class Decorator extends Component {

	/**
	 * 持有被装饰的组件对象
	 */
	private Component component;

	/**
	 * 通过构造方法传入被装饰的对象
	 * 
	 * @param c被装饰的对象
	 */
	public Decorator(Component component) {
		this.component = component;
	}

	public double calcPrize(String user, Date begin, Date end) {
		// 转调组件对象的方法
		return component.calcPrize(user, begin, end);
	}

}
