package com.qf.dp.chainofresponsibility;

/**   
* @Title: Handler.java 
* @Package com.qf.dp.chainofresponsibility 
* @Description: 　抽象处理者角色类
* @author haichangzhang   
* @date 2018年7月13日 下午4:40:00 
* @version V1.0   
*/
public abstract class Handler {
	
	
    /**
     * 持有下一个处理请求的对象
     */
	protected Handler successor=null;

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	/**
     * 处理聚餐费用的申请
     * @param user    申请人
     * @param fee    申请的钱数
     * @return        成功或失败的具体通知
     */
	public abstract String handleFeeRequest(User user);

}
