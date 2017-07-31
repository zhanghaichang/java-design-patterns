package com.qf.dp.bridge;

/**   
* @Title: MessageEmail.java 
* @Package com.qf.dp.bridge 
* @Description: 邮件短消息的实现类
* @author haichangzhang   
* @date 2017年7月31日 下午3:34:43 
* @version V1.0   
*/
public class MessageEmail implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
        System.out.println("使用邮件短消息的方法，发送消息'"+message+"'给"+toUser);
	}

}
