package com.qf.dp.facade;

/**   
* @Title: Facade.java 
* @Package com.qf.dp.facade 
* @Description: TODO
* @author haichangzhang   
* @date 2017年7月31日 下午1:57:41 
* @version V1.0   
*/
public class Facade {

	public void open(){
		new Light().open();
		new Heater().open();
		new TV().open();
	}
}
