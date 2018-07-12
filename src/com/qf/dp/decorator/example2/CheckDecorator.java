package com.qf.dp.decorator.example2;

/**
 * @Title: CheckDecorator.java
 * @Package com.qf.dp.decorator.example2
 * @Description: 实现权限控制
 * @author haichangzhang
 * @date 2018年7月12日 下午5:46:52
 * @version V1.0
 */
public class CheckDecorator extends Decorator {

	public CheckDecorator(GoodsSaleEbi ebi) {
		super(ebi);
	}

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		// 简单点，只让张三执行这个功能
		if ("张三".equals(user)) {
			return this.ebi.sale(user, customer, saleModel);
		} else {
			// 就不再调用被装饰对象的功能了
			System.out.println("对不起" + user + "，你没有保存销售单的权限");
			return false;
		}
	}

}
