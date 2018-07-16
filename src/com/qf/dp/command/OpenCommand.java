package com.qf.dp.command;

/**
 * @Title: OpenCommand.java
 * @Package com.qf.dp.command
 * @Description: 开机命令的实现，实现Command接口，持有开机命令的真正实现，通过调用接收者的方法来实现命令
 * @author haichangzhang
 * @date 2018年7月13日 下午3:20:00
 * @version V1.0
 */
public class OpenCommand implements Command {

	private MainBoardApi mainBoardApi = null;

	public OpenCommand(MainBoardApi mainBoardApi) {
		this.mainBoardApi = mainBoardApi;
	}

	@Override
	public void execute() {
		// 对于命令对象，根本不知道如何开机，会转调主板对象
		// 让主板去完成开机的功能
		this.mainBoardApi.open();

	}

}
