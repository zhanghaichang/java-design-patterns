package com.qf.dp.decorator.example1;

import java.util.Date;

/**
 * @Title: MonthPrizeDecorator.java
 * @Package com.qf.dp.decorator.example1
 * @Description: 装饰器对象，计算当月业务奖金
 * @author haichangzhang
 * @date 2018年7月12日 下午4:48:57
 * @version V1.0
 */
public class MonthPrizeDecorator extends Decorator {

	public MonthPrizeDecorator(Component component) {
		super(component);
	}

	public double calcPrize(String user, Date begin, Date end) {
		// 1：先获取前面运算出来的奖金
		double money = super.calcPrize(user, begin, end);
		// 2：然后计算当月业务奖金,按人员和时间去获取当月业务额，然后再乘以3%
		double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
		System.out.println(user + "当月业务奖金:" + prize);
		return prize + money;
	}

}
