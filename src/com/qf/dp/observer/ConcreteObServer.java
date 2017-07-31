package com.qf.dp.observer;

/**   
* @Title: ConcreteObServer.java 
* @Package com.qf.dp.observer 
* @Description: 具体观察者角色类
* @author haichangzhang   
* @date 2017年7月31日 下午5:18:16 
* @version V1.0   
*/
public class ConcreteObServer implements Observer {
	
	//观察者的状态
	private String observerState;

	@Override
	public void update(String state) {
	 /**
     * 更新观察者的状态，使其与目标的状态保持一致
     */
		observerState=state;
		System.out.println("状态为："+observerState);
	}

}
