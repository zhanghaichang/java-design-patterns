package com.qf.dp.bridge;

/**
 * @Title: AbstractMessage.java
 * @Package com.qf.dp.bridge
 * @Description: 抽象消息类
 * @author haichangzhang
 * @date 2017年7月31日 下午3:23:11
 * @version V1.0
 */
public abstract class AbstractMessage {

	// 持有一个实现部分的对象
	MessageImplementor implementor;

	 /**
     * 构造方法，传入实现部分的对象
     * @param impl  实现部分的对象
     */
	public AbstractMessage(MessageImplementor implementor) {
		this.implementor=implementor;
	}
	
    /**
     * 发送消息，委派给实现部分的方法
     * @param message    要发送消息的内容
     * @param toUser    消息的接受者
     */
	public void sendMessage(String message, String toUser) {
		this.implementor.send(message, toUser);
	}
}
