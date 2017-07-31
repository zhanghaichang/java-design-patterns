package com.qf.dp.bridge;

/**   
* @Title: MessageSMS.java 
* @Package com.qf.dp.bridge 
* @Description:系统内短消息的实现类
* @author haichangzhang   
* @date 2017年7月31日 下午3:33:51 
* @version V1.0   
*/
public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
	     System.out.println("使用系统内短消息的方法，发送消息'"+message+"'给"+toUser);

	}

}
