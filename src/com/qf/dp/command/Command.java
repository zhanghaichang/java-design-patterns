package com.qf.dp.command;

/**   
* @Title: Command.java 
* @Package com.qf.dp.command 
* @Description: 命令接口，声明执行的操作 
* @author haichangzhang   
* @date 2018年7月13日 下午3:18:01 
* @version V1.0   
*/
public interface Command {

    /** 
     * 执行命令对应的操作 
     */  
	public void execute();
}
