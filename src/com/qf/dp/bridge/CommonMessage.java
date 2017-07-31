
package com.qf.dp.bridge;

/**   
* @Title: CommonMessage.java 
* @Package com.qf.dp.bridge 
* @Description: 　普通消息类
* @author haichangzhang   
* @date 2017年7月31日 下午3:27:46 
* @version V1.0   
*/
public class CommonMessage extends AbstractMessage {

	public CommonMessage(MessageImplementor implementor) {
		super(implementor);
	}
	
	public void sendMessage(String message,String toUser){
		// 对于普通消息，直接调用父类方法，发送消息即可
		super.sendMessage(message, toUser);
	}

}
