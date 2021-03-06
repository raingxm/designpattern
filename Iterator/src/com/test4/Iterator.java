package com.test4;
/**
 * 迭代器接口，定义访问和遍历元素的操作，实现双向迭代
 * @author zhang
 *
 */
public interface Iterator {
	public void first();
	public void next();
	public boolean isDone();
	public Object currentItem();
	
	/**
	 * 判断是否为第一个元素
	 * @return  如果为第一个元素，返回true，否则返回false
	 */
	public boolean isFirst();
	
	/**
	 * 移动到聚合对象的上一个位置
	 */
	public void previous();
}
