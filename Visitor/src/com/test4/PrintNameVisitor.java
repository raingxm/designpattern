package com.test4;
/**
 * ����ķ����ߣ�ʵ�֣������������ƣ�����϶��������ǰ������"�ڵ�: "
 * ��Ҷ�Ӷ��������ǰ����"Ҷ��: "
 * @author zhang
 *
 */
public class PrintNameVisitor implements Visitor {
	/**
	 * �����ۼƼ�¼������Ҫ����˵ĸ�
	 */
	private String preStr = "";
	public void visitComposite(Composite composite) {
		//�Ȱ��Լ����ȥ
		System.out.println(preStr+"+"+composite.getName());
		//��������������������ô�������Щ���������
		if(composite.getChildComponents() != null){
			//Ȼ������һ���ո񣬱�ʾ�������һ���ո�
			preStr += " ";
			//�����ǰ������Ӷ���
			for(Component c : composite.getChildComponents()){
				//�ݹ����ÿ���Ӷ���
				c.accept(this);
			}
			//��ѭ���Ӷ��������һ���˸��ȥ��
			preStr = preStr.substring(0,preStr.length()-1);
		}
	}

	public void visitLeaf(Leaf leaf) {
		//���ʵ�Ҷ�Ӷ��������
		System.out.println(preStr+"-"+leaf.getName());
	}

}