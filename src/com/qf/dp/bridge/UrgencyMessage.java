package com.qf.dp.bridge;

/**   
* @Title: UrgencyMessage.java 
* @Package com.qf.dp.bridge 
* @Description: 加急消息类
* @author haichangzhang   
* @date 2017年7月31日 下午3:30:36 
* @version V1.0   
*/
public class UrgencyMessage extends AbstractMessage {

	public UrgencyMessage(MessageImplementor implementor) {
		super(implementor);
	}
	
	public void sendMessage(String message,String toUser){
		message="加急："+message;
		super.sendMessage(message, toUser);
	}
	
	/**
     * 扩展自己的新功能，监控某消息的处理状态
     * @param messageId    被监控的消息编号
     * @return    监控到的消息的处理状态
     */
	public Object watch(String messageId){
		 // 根据消息id获取消息的状态，组织成监控的数据对象，然后返回
		return null;
	}

}
