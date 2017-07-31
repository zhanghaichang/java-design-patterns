package com.qf.dp.bridge;

/**   
* @Title: MessageImplementor.java 
* @Package com.qf.dp.bridge 
* @Description: 实现发送消息的统一接口
* @author haichangzhang   
* @date 2017年7月31日 下午3:25:17 
* @version V1.0   
*/
public interface MessageImplementor {

	 /**
     * 发送消息
     * @param message 要发送消息的内容
     * @param toUser  消息的接受者
     */
	public void send(String message,String toUser);
}
