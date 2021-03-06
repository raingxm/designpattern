package com.test4;

/**
 * 命令对象，北京烤鸭
 * @author zhang
 *
 */
public class DuckCommand implements Command {

	/**
	 * 持有具体做菜的厨师对象
	 */
	private CookApi cookApi = null;
	
	/**
	 * 设置具体做菜的厨师对象
	 */
	public void setCookApi(CookApi cookApi){
		this.cookApi = cookApi;
	}
	
	public void execute() {
		this.cookApi.cook(tableNum,"北京烤鸭");
	}
	
	/**
	 * 点菜的桌号
	 */
	private int tableNum;
	
	/**
	 * 构造函数，传入点菜的桌号
	 * @param tableNum 点菜的桌号
	 */
	public DuckCommand(int tableNum){
		this.tableNum = tableNum;
	}

	public int getTableNum() {
		// TODO Auto-generated method stub
		return tableNum;
	}
}
