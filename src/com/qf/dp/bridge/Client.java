package com.qf.dp.bridge;

/**
 * @Title: Client.java
 * @Package com.qf.dp.bridge
 * @Description: 客户端类
 * @author haichangzhang
 * @date 2017年7月31日 下午2:05:05
 * @version V1.0
 */
public class Client {

	public static void main(String[] args) {
		// 创建具体的实现对象
		MessageImplementor implementor = new MessageSMS();
		// 创建普通消息对象
		AbstractMessage message = new CommonMessage(implementor);
		// 将实现方式切换成邮件，再次发送
		message.sendMessage("加班申请速批", "李总");
		// 创建加急消息对象
		implementor = new MessageEmail();
		message = new UrgencyMessage(implementor);
		message.sendMessage("加班申请速批", "李总");
	}
}
