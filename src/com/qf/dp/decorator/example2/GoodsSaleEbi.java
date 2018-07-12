package com.qf.dp.decorator.example2;

/**   
* @Title: GoodsSaleEbi.java 
* @Package com.qf.dp.decorator.example2 
* @Description: 商品销售管理的业务接口 
* @author haichangzhang   
* @date 2018年7月12日 下午5:41:26 
* @version V1.0   
*/
public interface GoodsSaleEbi {
	
	
    /** 
     * 保存销售信息，本来销售数据应该是多条，太麻烦了，为了演示，简单点 
     * @param user 操作人员 
     * @param customer 客户 
     * @param saleModel 销售数据 
     * @return 是否保存成功 
     */
	public boolean sale(String user,String customer,SaleModel saleModel);
}
