package com.qf.dp.decorator.example2;

/**
 * @Title: Client.java
 * @Package com.qf.dp.templatemethod
 * @Description: 客户端类
 * @author haichangzhang
 * @date 2017年7月24日 下午2:13:07
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {

		GoodsSaleEbi ebi = new CheckDecorator(new LogDecorator(new GoodsSaleEbo()));

		SaleModel saleModel = new SaleModel();
		saleModel.setGoods("手机");
		saleModel.setSaleNum(2);
		ebi.sale("张三", "张三丰", saleModel);
		ebi.sale("李四", "张三丰", saleModel);

	}

}
