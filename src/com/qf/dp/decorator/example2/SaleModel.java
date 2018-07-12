package com.qf.dp.decorator.example2;

/**   
* @Title: SaleModel.java 
* @Package com.qf.dp.decorator.example2 
* @Description: 封装销售单的数据，简单的示意一些 
* @author haichangzhang   
* @date 2018年7月12日 下午5:42:33 
* @version V1.0   
*/
public class SaleModel {

	  /** 
	    * 销售的商品 
	    */  
	    private String goods;  
	    /** 
	    * 销售的数量 
	    */  
	    private int saleNum;  
	    public String getGoods() {    
	        return goods;     
	    }  
	    public void setGoods(String goods) {  
	        this.goods = goods;   
	    }  
	    public int getSaleNum() {  
	        return saleNum;  
	    }  
	    public void setSaleNum(int saleNum) {  
	        this.saleNum = saleNum;  
	    }  
	    public String toString(){  
	        return "商品名称="+goods+",购买数量="+saleNum;  
	    }  
}
