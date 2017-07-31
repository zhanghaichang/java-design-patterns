package com.qf.dp.observer;

/**   
* @Title: Observer.java 
* @Package com.qf.dp.observer 
* @Description: 抽象观察者角色类
* @author haichangzhang   
* @date 2017年7月31日 下午5:09:03 
* @version V1.0   
*/
public interface Observer {

	 /**
     * 更新接口
     * @param state    更新的状态
     */
	public void update(String state);
}
