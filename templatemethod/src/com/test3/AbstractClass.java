package com.test3;
/**
 * ����ģ�巽����ԭ������ȵĳ�����
 * @author zhang
 *
 */
public abstract class AbstractClass {
	/**
	 * ԭ�����1����νԭ��������ǳ���Ĳ���������Ҫ�������ṩʵ��
	 */
	public abstract void doPrimitiveOperation1();
	
	/**
	 * ԭ�����2
	 */
	public abstract void doPrimitiveOperation2();
	
	/**
	 * ģ�巽���������㷨���
	 */
	public final void templateMethod(){
		doPrimitiveOperation1();
		doPrimitiveOperation2();
	}
}