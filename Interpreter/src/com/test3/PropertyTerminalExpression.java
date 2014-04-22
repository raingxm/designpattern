package com.test3;
/**
 * 属性作为终结符对应的解释器
 * @author zhang
 *
 */
public class PropertyTerminalExpression extends ReadXmlExpression {
	/**
	 * 属性的名字
	 */
	private String propName;
	
	public PropertyTerminalExpression(String propName){
		this.propName = propName;
	}
	
	public String[] interpret(Context c) {
		//直接获取最后的元素属性的值
		String[] ss = new String[1];
		ss[0] = c.getPreEle().getAttribute(this.propName);
		return ss;
	}

}
