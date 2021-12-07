package cn.javass.dp.command.example5;

/**
 * 命令对象，蒜泥白肉
 */
public class PorkCommand implements Command {
	private CookApi cookApi = null;

	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}

	
	public void execute() {
		this.cookApi.cook("蒜泥白肉");
	}
}
