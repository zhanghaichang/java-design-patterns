package com.qf.dp.decorator.example2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Title: LogDecorator.java
 * @Package com.qf.dp.decorator.example2
 * @Description: 实现日志记录
 * @author haichangzhang
 * @date 2018年7月12日 下午5:49:36
 * @version V1.0
 */
public class LogDecorator extends Decorator {

	public LogDecorator(GoodsSaleEbi ebi) {
		super(ebi);
	}

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		// 执行业务功能
		boolean result = this.ebi.sale(user, customer, saleModel);
		// 在执行业务功能过后，记录日志
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println(
				"日志记录：" + user + "于" + df.format(new Date()) + "时保存了一条销售记录，客户是" + customer + ",购买记录是" + saleModel);
		return result;
	}

}
