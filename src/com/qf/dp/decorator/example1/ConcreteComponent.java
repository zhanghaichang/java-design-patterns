package com.qf.dp.decorator.example1;

import java.util.Date;

/**
 * @Title: ConcreteComponent.java
 * @Package com.qf.dp.decorator.example1
 * @Description: 基本的实现计算奖金的类，也是被装饰器装饰的对象 
 * @author haichangzhang
 * @date 2018年7月12日 下午4:46:22
 * @version V1.0
 */
public class ConcreteComponent extends Component {

	@Override
	public double calcPrize(String user, Date begin, Date end) {
		//只是一个默认的实现，默认没有奖金 
		return 0;
	}

}
