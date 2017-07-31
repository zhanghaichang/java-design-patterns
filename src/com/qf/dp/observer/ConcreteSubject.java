package com.qf.dp.observer;

/**   
* @Title: ConcreteSubject.java 
* @Package com.qf.dp.observer 
* @Description: 具体主题角色类
* @author haichangzhang   
* @date 2017年7月31日 下午5:15:25 
* @version V1.0   
*/
public class ConcreteSubject extends Subject {

	private String state;
	
	public String getState() {
		return state;
	}

	public void change(String newState){
		this.state=newState;
	    System.out.println("主题状态为：" + state);
        //状态发生改变，通知各个观察者
		this.notifyObservers(newState);
	}
}
