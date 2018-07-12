package com.qf.dp.decorator.example2;

/**
 * @Title: GoodsSaleEbo.java
 * @Package com.qf.dp.decorator.example2
 * @Description: TODO
 * @author haichangzhang
 * @date 2018年7月12日 下午5:43:28
 * @version V1.0
 */
public class GoodsSaleEbo implements GoodsSaleEbi {

	@Override
	public boolean sale(String user, String customer, SaleModel saleModel) {
		System.out.println(user + " 保存了[" + customer + "]购买【" + saleModel + "】的销售数据");
		return true;
	}

}
