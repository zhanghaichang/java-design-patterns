package com.qf.dp.observer;

import java.util.ArrayList;
import java.util.List;

/**   
* @Title: Subject.java 
* @Package com.qf.dp.observer 
* @Description: 抽象主题角色类
* @author haichangzhang   
* @date 2017年7月31日 下午5:08:01 
* @version V1.0   
*/
public abstract class Subject {

	  /**
     * 用来保存注册的观察者对象
     */
	private List<Observer> list=new ArrayList<Observer>();
	
	/**
     * 注册观察者对象
     * @param observer    观察者对象
     */
	public void attach(Observer observer){
		list.add(observer);
		 System.out.println("Attached an observer");
	}
	
	/**
     * 删除观察者对象
     * @param observer    观察者对象
     */
	public void detach(Observer observer){
		list.remove(observer);
	}
	
	 /**
     * 通知所有注册的观察者对象
     */
	public void notifyObservers(String newState){
		for(Observer observer:list){
			observer.update(newState);
		}
	}
}
